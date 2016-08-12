package com.ing.springbootdockerdemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class SampleController {
    //This is of course not the way to do this but this is just a quick and dirty example
    private ArrayList<Todo> todos = new ArrayList<Todo>();

    @RequestMapping("/")
    @ResponseBody
    List<Todo> home() {
        return todos;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Todo home(@RequestBody Todo input) {
        todos.add(input);
        return input;
    };

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
