package com.practice.repository;

import java.util.ArrayList;
import java.util.List;

import com.practice.model.Person;

public class PersonRepositoryImpl implements PersonRepository {
	
	/**
	 * Return all persons from the database(presently a mock call).
	 * 
	 * @return all persons.
	 */
	@Override
	public List<Person> getAllPersons() {
		Person p1 = new Person("Mahendra Singh", "Dhoni");
		Person p2 = new Person("Virat", "Kohli");
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(p1);
		persons.add(p2);
		
		return persons;
	}
}
