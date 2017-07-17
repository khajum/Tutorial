package io.javabrains.springboot.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	/**
	 * gets list of courses.
	 * 
	 * @param topicId
	 * 
	 * @return list of courses
	 */
	public List<Course> listCourses(int topicId) {
		return (List<Course>) repository.findByTopicId(topicId);
	}

	/**
	 * gets the course object of given id.
	 * 
	 * @param id
	 *            Id of course to get
	 * @return Course object
	 */
	public Course getCourse(int id) {
		return repository.findOne(id);
	}

	/**
	 * Adds course to courses list
	 * 
	 * @param course
	 *            course object to add
	 */
	public void addCourse(Course course) {
		repository.save(course);
	}

	/**
	 * Updates courses with given ID.
	 * 
	 * @param course
	 *            course object to update
	 */
	public void updateCourse(Course course) {
		repository.save(course);
	}

	/**
	 * Removes course from courses list
	 * 
	 * @param id
	 *            ID of course to remove
	 */
	public void deleteCourse(int id) {
		repository.delete(id);
	}
}
