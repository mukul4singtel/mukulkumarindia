package com.singtel.exercise.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.exercise.entities.Animal;
import com.singtel.exercise.entities.Duck;

public class AnimalServiceTest {
    private AnimalService animalService;
	@Test
	public void testGetAnimal() {
		Animal animal = animalService.getAnimal("Duck");
		
		assertTrue(animal.getClass().equals(Duck.class));
	}

}
