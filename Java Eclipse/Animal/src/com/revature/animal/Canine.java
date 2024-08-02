package com.revature.animal;

public abstract class Canine implements Animal{
	private String name;

	public Canine(String name) {
		super();
		this.name = name;
	}
	
	public abstract void sound();
	
	public void display() {
		System.out.println("Hello, myself Canine named" + name);
	}
	
}
