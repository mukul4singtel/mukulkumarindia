package com.singtel.exercise.entities;

/**
 * Class to check the Solution with main method.
 */
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
    }
}

