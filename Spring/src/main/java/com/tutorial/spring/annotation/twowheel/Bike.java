package com.tutorial.spring.annotation.twowheel;

import org.springframework.stereotype.Component;

/**
 * @author Jayram
 *
 */
@Component
public class Bike {
	public Bike(){
		System.out.println("Bike.enclosing_method() "+ this);
	}
}
