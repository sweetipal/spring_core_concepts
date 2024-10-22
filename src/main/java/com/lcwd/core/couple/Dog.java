package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("dog")
@Component
@Qualifier("dog")
public class Dog implements Animal {

	@Override
	public void play() {
		System.out.println("Dog is playing");
		
	}
	

}
