package com.in28minutes.todo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.model.Todo;
import com.in28minutes.todo.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodoList(ModelMap model) {
		String user = getLoggedInUserName(model);
		model.addAttribute("todos", service.retrieveTodos(user));
		return "list-todos";

	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		model.put("todo", new Todo());
		return "todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

		if (result.hasErrors())
			return "todo";

		service.addTodo(getLoggedInUserName(model), todo.getDesc(),
				todo.getTargetDate(), false);
		model.clear(); // to prevent request parameter "name" to be passed.
		return "redirect:./list-todos";
	}

	public String getLoggedInUserName(ModelMap model) {
		return (String) model.get("name");

	}

	/*
	 * public String getLoggedInUserName() { Object principal =
	 * SecurityContextHolder.getContext() .getAuthentication().getPrincipal();
	 * 
	 * if (principal instanceof UserDetails) return ((UserDetails)
	 * principal).getUsername();
	 * 
	 * return principal.toString(); }
	 */

	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(ModelMap model, @RequestParam int id) {
		model.put("todo", service.retriveTodo(id));
		return "todo";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo,
			BindingResult result) {
		if (result.hasErrors())
			return "todo";

		todo.setUser(getLoggedInUserName(model));
		// todo.setId(todo.getId());
		service.updateTodo(todo);

		model.clear();
		return "redirect:./list-todos";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:./list-todos";
	}

}
