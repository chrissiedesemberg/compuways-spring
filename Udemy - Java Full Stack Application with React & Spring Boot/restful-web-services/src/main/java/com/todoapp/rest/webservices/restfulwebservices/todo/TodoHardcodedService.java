package com.todoapp.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	
	private static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "test", "Learn to dance", new Date(), false));
		todos.add(new Todo(++idCounter, "test", "Learn about microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "test", "Learn Angular", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(Long id) {
		Todo todo = findById(id);
		if(todo == null) return null;
		if (todos.remove(todo)){
				return todo;}
		return null;
	}
	
	public Todo save(Todo todo) {
		if (todo.getId() ==-1 || todo.getId() ==0) {
			todo.setId(++idCounter);
			todos.add(todo);
			} else {
			deleteById((long) todo.getId());
			todos.add(todo);
		}
		return todo;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}

		return null;
	}
}
