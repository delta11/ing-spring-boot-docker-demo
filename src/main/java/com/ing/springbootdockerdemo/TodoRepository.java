package com.ing.springbootdockerdemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by delta11 on 21-5-16.
 */
public interface TodoRepository extends CrudRepository<Todo, Integer> {
    List<Todo> findAll();
}
