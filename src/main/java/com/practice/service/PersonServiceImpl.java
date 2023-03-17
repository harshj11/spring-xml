package com.practice.service;

import java.util.List;

import com.practice.model.Person;
import com.practice.repository.PersonRepository;
import com.practice.repository.PersonRepositoryImpl;

public class PersonServiceImpl implements PersonService {
	private PersonRepository personRepository;
	
	public PersonServiceImpl() {
		personRepository = new PersonRepositoryImpl();
	}
	
	/**
	 * Return all persons.
	 */
	@Override
	public List<Person> getAllPersons() {
		return personRepository.getAllPersons();
	}
}
