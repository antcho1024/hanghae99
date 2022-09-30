package com.sparta.week01_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getCourses() {
        Person me = new Person();
        me.setName("Cathy");
        me.setAge(25);
        me.setJob("preCEO");
        return me;
    }
}
