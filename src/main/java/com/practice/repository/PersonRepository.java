package com.practice.repository;

import java.util.List;

import com.practice.model.Person;

public interface PersonRepository {

	/**
	 * Return all persons from the database(presently a mock call).
	 * 
	 * @return all persons.
	 */
	List<Person> getAllPersons();

}