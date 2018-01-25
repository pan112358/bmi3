package com.service.bmi3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-25T06:46:42.002Z")

@RpcSchema(schemaId = "bmi3")
public class Bmi3Impl implements Bmi3{

    @Autowired
    private Bmi3Delegate bmi3Delegate;


    public String helloworld(String name) {

        return bmi3Delegate.helloworld(name);
    }

}
