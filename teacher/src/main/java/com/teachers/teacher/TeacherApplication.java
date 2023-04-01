package com.teachers.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class TeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherApplication.class, args);
	}
	@Autowired
	private RestTemplate restTamplate;
	
	@GetMapping("/teacher")
	public String test() {
		String name = restTamplate.getForObject("http://localhost:8083/students",String.class);
		return "teacher name is : "+ name;
	}

}
