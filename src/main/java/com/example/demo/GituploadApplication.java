package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class GituploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(GituploadApplication.class, args);
	}
@GetMapping("/")
public String get()
{
	return "Hi All  Git uploaded code";
}
}
