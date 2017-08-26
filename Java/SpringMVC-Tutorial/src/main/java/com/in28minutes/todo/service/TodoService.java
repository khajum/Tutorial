package com.in28minutes.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minutes.model.Todo;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "rlimbu", "Learn Spring MVC", new Date(), true));
		todos.add(new Todo(2, "rlimbu", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "rlimbu", "Learn Hibernate", new Date(), false));
	}

	/**
	 * 
	 * @param user
	 *            user name
	 * @return list of Todos of user
	 */
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();

		for (Todo todo : todos) {
			if (todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}
		}

		return filteredTodos;
	}

	/**
	 * 
	 * @param id
	 *            ID of Todo object.
	 * @return Todo object
	 */
	public Todo retriveTodo(int id) {
		for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}

		return null;
	}

	/**
	 * Add todo task to todos list
	 * 
	 * @param name
	 *            user name
	 * @param desc
	 *            user description
	 * @param targetDate
	 *            target date
	 * @param isDone
	 */
	public void addTodo(String name, String desc, Date targetDate,
			boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

	/**
	 * updates Todo.
	 * 
	 * @param todo
	 *            Todo object to be updated.
	 */
	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}

	/**
	 * removes todo from todos list
	 * 
	 * @param id
	 *            id of todo to be removed
	 */
	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();

		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}

}
