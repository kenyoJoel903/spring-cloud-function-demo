package com.kenyo.serverless.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kenyo.serverless.model.Person;

@Repository
public class PersonRepository {
	
	private List<Person> persons;
	
	public PersonRepository() {
		this.persons = new ArrayList<Person>();
		this.persons.add(new Person(1, "JUAN"));
		this.persons.add(new Person(2, "Luis"));
	}
	
	public List<Person> listAll() {
		return persons;
	}

}
