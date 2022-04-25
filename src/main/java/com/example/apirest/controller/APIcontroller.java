package com.example.apirest.controller;

import com.example.apirest.been.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/apirest")
public class APIcontroller {

@RequestMapping(value="/person", method = RequestMethod.GET )
    public Person getPerson (HttpServletRequest request){
        Person person1 = new Person();
        person1.setName("petter");
        person1.setSurname("Parker");
        person1.setDocument("0123");

        return person1;
    }



}
