package com.lcwd.core;

import org.springframework.boot.SpringApplication;
import com.lcwd.core.couple.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"",""})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Person p = new Person(animal);
//		p.playWithAnimal();
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person person= context.getBean(Person.class);
		person.playWithAnimal();
		Animal cat =  context.getBean("cat",  Animal.class);
		cat.play();
	}

}
