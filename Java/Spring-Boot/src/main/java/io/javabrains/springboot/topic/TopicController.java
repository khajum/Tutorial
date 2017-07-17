package io.javabrains.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService service;

	@RequestMapping(value = "/topics")
	public List<Topic> getAllTopics() {
		return service.listTopics();
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public String addTopic(@RequestBody Topic topic) {
		service.addTopic(topic);
		return "Topic added successfully!";
	}

	@RequestMapping(value = "/topics/{id}")
	public Topic getTopic(@PathVariable int id) {
		return service.getTopic(id);
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public String updateTopic(@RequestBody Topic topic, @PathVariable int id) {
		service.updateTopic(id, topic);
		return "Topic with Id=" + id + " updated successfully";
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	public String deleteTopic(@PathVariable int id) {
		service.deleteTopic(id);
		return "Topic with Id=" + id + " deleted succefully";
	}
}
