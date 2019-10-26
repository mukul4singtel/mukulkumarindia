package com.singtel.exercise.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.singtel.exercise.entities.Animal;
import com.singtel.exercise.entities.Chicken;
import com.singtel.exercise.entities.Duck;

/**
 * Service class to have all Animal Related services
 */
@Service
public class AnimalService {
	/**
	 * Method to give Animal object based on Animal Type (Duck or Chicken)
	 * @param animalType
	 * @return
	 */
	public Animal getAnimal(String animalType) {
		
         return Optional.of("Duck".equals(animalType))
         .filter(Boolean::booleanValue)
         .map(trueCase -> (Animal)new Duck()).orElse((Animal)new Chicken());
		
	}

}
