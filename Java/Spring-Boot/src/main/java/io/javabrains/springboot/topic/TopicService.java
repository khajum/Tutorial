package io.javabrains.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repository;

	/**
	 * gets list of topics.
	 * 
	 * @return list of topics
	 */
	public List<Topic> listTopics() {
		return (List<Topic>) repository.findAll();
	}

	/**
	 * gets the topic object of given id.
	 * 
	 * @param id
	 *            Id of topic to get
	 * @return Topic object
	 */
	public Topic getTopic(int id) {
		return repository.findOne(id);
	}

	/**
	 * Adds topic to topics list
	 * 
	 * @param topic
	 *            topic object to add
	 */
	public void addTopic(Topic topic) {
		repository.save(topic);
	}

	/**
	 * Updates topics with given ID.
	 * 
	 * @param id
	 *            Id of topic to update
	 * @param topic
	 *            topic object to update
	 */
	public void updateTopic(int id, Topic topic) {
		repository.save(topic);
	}

	/**
	 * Removes topic from topics list
	 * 
	 * @param id
	 *            ID of topic to remove
	 */
	public void deleteTopic(int id) {
		repository.delete(id);
	}
}
