package com.veea.interview.controllers;

import com.veea.interview.domain.Person;
import com.veea.interview.model.PersonDto;
import com.veea.interview.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/veea/api/v1/")
@RestController
public class PersonController {


    @Autowired
    private final PersonService personService;


    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public PersonDto getPeople() {
        return new PersonDto(personService.listAll());
    }

    @PostMapping(path = "person")
    public ResponseEntity saveNewPerson(@RequestBody @Validated Person person) {
        return new ResponseEntity<>(personService.savePerson(person), HttpStatus.CREATED);
    }
}
