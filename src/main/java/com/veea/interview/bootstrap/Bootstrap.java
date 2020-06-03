package com.veea.interview.bootstrap;

import com.veea.interview.domain.Person;
import com.veea.interview.services.PersonService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PersonService personService;

    public Bootstrap(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Person person = new Person();
        person.setFirstname("al");
        person.setLastname("s");
        person.setAddress("1232");
        person.setColor("blue");
        person.setZipcode("11385");
        person.setPhonenumber("123-123-1234");
        personService.savePerson(person);

        Person person2 = new Person();
        person2.setFirstname("pia");
        person2.setLastname("s");
        person2.setAddress("1232");
        person2.setColor("black");
        person2.setZipcode("11385");
        person2.setPhonenumber("123-123-1234");
        personService.savePerson(person2);


    }
}