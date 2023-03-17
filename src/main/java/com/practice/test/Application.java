package com.practice.test;
import java.util.List;

import com.practice.model.Person;
import com.practice.service.PersonService;
import com.practice.service.PersonServiceImpl;

public class Application {
	public static void main(String[] args) {
		PersonService personService = new PersonServiceImpl();
		List<Person> persons = personService.getAllPersons();
		
		for(Person p: persons)
			System.out.println(p);
	}
}
