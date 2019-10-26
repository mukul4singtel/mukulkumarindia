package com.singtel.exercise.entities;

/**
 * Class to hold properties of Duck.
 */
public class Duck extends Bird {
	
	/**
	 * Method definition of Singing behaviour for Duck
	 * @return void
	 */
    public void sing() {
        System.out.println("Quack, quack");
    }
    
	/**
	 * Method definition of Swimming behaviour for Duck
	 * @return void
	 */
    public void swim() {
        System.out.println("Duck is swimming");
    }
    
    
}
