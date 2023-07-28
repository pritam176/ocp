package com.example.k8s.springbootk8smysql.controller;


import com.example.k8s.springbootk8smysql.entity.User;
import com.example.k8s.springbootk8smysql.repository.UserRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${service-mesh}")
	private String url ;


	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public String getUsers() {
		log.info("invoked");
		userRepository.save(User.builder().name("Pritam").country("IND").build());
		return "I am Hosted on OCP,Spring boot";
	}

	@GetMapping("/all")
	public String getAllUsers() {
		log.info("invoked");
		List<User> users= userRepository.findAll();
		return "No of User + "+users.size();
	}

	@GetMapping("/rest")
	public String getRestUsers() {
		log.info("Rest tetst");
		log.info("Rest tetst");

		return restTemplate.getForObject(url,String.class);
	}
	
	
	

}
