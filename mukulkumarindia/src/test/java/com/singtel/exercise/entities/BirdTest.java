package com.singtel.exercise.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class BirdTest {

	@Test
	public void testSing() {
		Bird bird = new Bird();
		assertTrue("I am Singingtest".equals(bird.helperMethod("I am Singing")));
	}

}
