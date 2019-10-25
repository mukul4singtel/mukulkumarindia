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
        System.out.println(new SingingBird().sing("i am singing"));
        System.out.println(new Duck().sing("quack,quack"));
    }
}

