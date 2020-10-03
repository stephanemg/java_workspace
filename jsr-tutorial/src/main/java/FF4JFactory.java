package main.java;

import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Default;
import jakarta.enterprise.inject.Produces;

public class FF4JFactory {
	@Produces
	public FF4J getFf4j() {
		System.out.println("passe par factory");
		return new FF4J();
	}
}
