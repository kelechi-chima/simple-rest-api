package com.afrosoft.simple.rest.api.controller;

import com.afrosoft.simple.rest.api.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final String MESSAGE = "Hello %s";

    @RequestMapping(path = "/greet", method = RequestMethod.GET)
    public Greeting greet(@RequestParam(name = "name", defaultValue = "world") String name) {
        Greeting greeting = new Greeting();
        greeting.setMessage(String.format(MESSAGE, name));
        return greeting;
    }
}
