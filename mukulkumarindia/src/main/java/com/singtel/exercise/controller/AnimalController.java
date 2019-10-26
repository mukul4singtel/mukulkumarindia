package com.singtel.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.exercise.entities.Animal;
import com.singtel.exercise.service.AnimalService;

/**
 * Controller class to receive REST requests from the caller
 * @author mukulkumar
 *
 */
@RestController
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	
    @RequestMapping("/greeting")
    public Animal getAnimal(@RequestParam(value="animalType") String animalType) {
        return animalService.getAnimal(animalType);
    }
}
