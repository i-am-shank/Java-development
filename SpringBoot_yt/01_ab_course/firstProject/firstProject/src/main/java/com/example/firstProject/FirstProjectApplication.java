package com.example.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

//	@Autowired  -->  Spring boot first scans all the annotations. @Autowired will map corresponding bean from bean-pool to the corresponding object.
	@Autowired
	DB db;

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Creating object of another class in another class.. not a good practice
//		Instead, use dependency-injection
//		db = new ProdDB();

		System.out.println(db.getData());
	}
}
