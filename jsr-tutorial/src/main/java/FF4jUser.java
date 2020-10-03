package main.java;

import jakarta.inject.Inject;

public class FF4jUser {
	@Inject
	FF4J ff4j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FF4jUser user = new FF4jUser();
		System.out.println(user.getFf4j().getAlive());
	}

	public FF4J getFf4j() {
		return ff4j;
	}

	public void setFf4j(FF4J ff4j) {
		this.ff4j = ff4j;
	}

}
