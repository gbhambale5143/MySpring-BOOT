package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application implements CommandLineRunner {
	@Autowired
	Sum ref;
	public static void main(String[] args) {
	
		SpringApplication.run(Demo4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int b = ref.Addition();
		System.out.println(b);
		;
		
	}

}
