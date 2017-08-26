package com.in28minutes.login;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private LoginService service;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat();
	binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
	// model.put("login", new Object());
	return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {

	if (!service.validateUser(name, password)) {
	    model.put("errorMessage", "Invalid Credentials.");
	    return "login";
	}

	model.put("name", name);
	return "welcome";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model) {
	model.put("name", "rlimbu");
	return "login";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String showHomePage(ModelMap model) {
	return "home";
    }
}
