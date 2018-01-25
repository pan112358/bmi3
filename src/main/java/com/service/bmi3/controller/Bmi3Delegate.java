package com.service.bmi3.controller;

import org.springframework.stereotype.Component;


@Component
public class Bmi3Delegate implements Bmi3 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
