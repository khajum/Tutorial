package io.javabrains.springboot.course;

import io.javabrains.springboot.topic.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	CourseService service;

	@RequestMapping(value = "/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable int topicId) {
		return service.listCourses(topicId);
	}

	@RequestMapping(value = "/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable int topicId, @PathVariable int id) {
		return service.getCourse(id);
	}

	@RequestMapping(value = "/topic/{id}/courses", method = RequestMethod.POST)
	public String addCourse(@RequestBody Course course,
			@PathVariable int topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		service.addCourse(course);
		return "Course added successfully!";
	}

	@RequestMapping(value = "/topics/{id}/courses/{id}", method = RequestMethod.PUT)
	public String updateCourse(@RequestBody Course course,
			@PathVariable int topicId, @PathVariable int id) {
		course.setTopic(new Topic(topicId, "", ""));
		service.updateCourse(course);
		return "Course with Id=" + id + " updated successfully";
	}

	@RequestMapping(value = "/courses/{id}", method = RequestMethod.DELETE)
	public String deleteCourse(@PathVariable int id) {
		service.deleteCourse(id);
		return "Course with Id=" + id + " deleted succefully";
	}
}
