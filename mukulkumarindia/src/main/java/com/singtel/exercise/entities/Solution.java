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
        System.out.println(bird.walk());
        System.out.println(bird.fly());
        System.out.println(bird.sing());
    }
}

