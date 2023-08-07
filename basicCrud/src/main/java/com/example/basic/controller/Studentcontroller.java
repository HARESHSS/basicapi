package com.example.basic.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.basic.entity.User;
import com.example.basic.repository.repo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
	@Autowired
	public repo rep;
	@PostMapping("/add")
	public User adddata(@RequestBody User user) {
		rep.save(user);
		return user;
	}
	@GetMapping("/get")
    public List<User> getAllNotes()
    {
        return rep.findAll();
    }
}
