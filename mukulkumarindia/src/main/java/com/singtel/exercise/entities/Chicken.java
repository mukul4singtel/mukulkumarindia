package com.singtel.exercise.entities;

public class Chicken extends Bird {
	/**
	 * Method definition of Singing behaviour for Chicken
	 * @return void
	 */
    public void sing() {
    	System.out.println("Cluck, cluck");
    }
    
	/**
	 * Method definition of flying behaviour for Chicken
	 * @return void
	 */
    public void fly() {
    	throw new RuntimeException("I cant't fly");
    }
}
