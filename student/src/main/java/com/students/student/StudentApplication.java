package com.students.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.students.controller.StudentsController;

@SpringBootApplication
@RestController
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		
	}	
	@GetMapping("/students")
	public String student(@RequestParam(value = "name", defaultValue = "Labib Ahmed") String name) {
		String address = null;
		return name  + " and address is : " + address; 
	}

}
