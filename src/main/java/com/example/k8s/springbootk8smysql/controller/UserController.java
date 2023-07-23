package com.example.k8s.springbootk8smysql.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class UserController {

   
	
	
	@GetMapping("/users")
	public String getUsers() {
		log.info("invoked");
		return "I am Hosted on OCP";
	}
	
	
	

}
