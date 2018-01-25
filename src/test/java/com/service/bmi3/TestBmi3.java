package com.service.bmi3.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBmi3 {

    Bmi3Delegate bmi3Delegate = new Bmi3Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = bmi3Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
