package com.example.testingweb;

import org.springframework.stereotype.Service;

import test.jar.App;

@Service
public class GreetingService {
	public String greet() {
		//return "Hello, World";
		App mg = new App();
		return mg.getGreeting();
	}
}
