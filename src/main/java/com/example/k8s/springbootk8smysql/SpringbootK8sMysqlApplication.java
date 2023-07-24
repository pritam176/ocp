package com.example.k8s.springbootk8smysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class SpringbootK8sMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sMysqlApplication.class, args);
	}

	@Bean
	public RestTemplate getResttemplate(){
		return new RestTemplate();
	}

}
