package com.lcwd.core.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("student5")
public class Student {
	public Student() {
		System.out.println("Creating student");
	}
	@PostConstruct  // after bean creation this method will execute
	public void created() {
		//some initialization
		System.out.println("Student bean is created: created()");
	}
	@PreDestroy   //destroy hone se phle it will execute
	public void preDestroy() {
		System.out.println("Bye bye student bean destroy()");
	}
}
