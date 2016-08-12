package com.ing.springbootdockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    TodoRepository repository;

    @RequestMapping("/")
    @ResponseBody
    List<Todo> home() {
        return repository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Todo home(@RequestBody Todo input) {
        repository.save(input);
        System.out.println(input);
        return input;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
