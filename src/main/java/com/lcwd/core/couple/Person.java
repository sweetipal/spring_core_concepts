package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	//@Autowired
	//@Qualifier("cat")
	Animal animal;
//	public Person(Animal animal) {
//		this.animal = animal;
//	}
	@Autowired
	public Person(@Qualifier("dog") Animal animal) {   // constructor injection
		this.animal = animal;
	}
	public void playWithAnimal() {
		animal.play();
	}
}
