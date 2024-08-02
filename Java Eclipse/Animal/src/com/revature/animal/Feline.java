package com.revature.animal;

public abstract class Feline implements Animal {
	private String name;

	public Feline(String name) {
		super();
		this.name = name;
	}
	
	public abstract void sound();
	
	public void display() {
		System.out.println("Hello, myself Fanine named" + name);
	
}
