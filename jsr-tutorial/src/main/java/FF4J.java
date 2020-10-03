package main.java;

import jakarta.enterprise.inject.Any;
import jakarta.enterprise.inject.Default;

@Any
@Default
public class FF4J {
	private String alive = "alive";

	public FF4J() {
		super();
		System.out.println("passe par constructeur");
	}

	public String getAlive() {
		return alive;
	}

	public void setAlive(String alive) {
		this.alive = alive;
	}

}
