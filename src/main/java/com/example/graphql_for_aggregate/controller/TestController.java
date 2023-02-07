package com.example.graphql_for_aggregate.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    private String test = "TestString";

    @QueryMapping
    public String testA() {
        return test;
    }

    @QueryMapping
    public String getEveryThing() {
        return "everything";
    }

    @MutationMapping
    public String setTestA(@Argument String test) {
        this.test = test;
        return "success";
    }
}
