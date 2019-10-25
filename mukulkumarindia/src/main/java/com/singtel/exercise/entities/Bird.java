package com.singtel.exercise.entities;

/**
 * Bird Class
 * @author mukulkumar
 *
 */
public class Bird extends Animal{
	/**
	 * Method definition of Flying behaviour
	 * @return the void
	 */
    public void fly() {
    	System.out.println("I am flying");
    }
   
	/**
	 * Method definition of Singing behaviour
	 * @return void
	 */
    public void sing() {
    	System.out.println("I am Singing");
    }
    
	/**
	 * Helper method  to test Singing behaviour
	 * @return modified testing string
	 */
    public String helperMethod(String testString) {
    	sing();
    	return testString+"test";
    }
}
