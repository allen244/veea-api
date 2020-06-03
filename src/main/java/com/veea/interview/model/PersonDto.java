package com.veea.interview.model;

import com.veea.interview.domain.Person;

import java.util.List;

public class PersonDto {

    private List<Person> people;

    public PersonDto(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
