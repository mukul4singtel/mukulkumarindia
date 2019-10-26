package com.singtel.exercise.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class to start the application.
 */
@SpringBootApplication
public class Solution {
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();
        Bird chicken = new Chicken();
        bird.walk();
        bird.fly();
        bird.sing();
        duck.walk();
        chicken.fly();
        SpringApplication.run(Solution.class, args);
    }
}

