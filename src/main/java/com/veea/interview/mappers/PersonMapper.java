package com.veea.interview.mappers;

import com.veea.interview.domain.Person;
import com.veea.interview.model.PersonDto;

public interface PersonMapper {

    PersonDto personToPersonDto(Person person);


    Person personDtoToPerson(PersonDto dto);
}
