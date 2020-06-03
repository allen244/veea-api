package com.veea.interview.services;

import com.veea.interview.domain.Person;

import java.util.List;

public interface PersonService {

    Person savePerson(Person personDto);

    public List<Person> listAll();

}
