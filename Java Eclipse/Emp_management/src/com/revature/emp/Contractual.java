package com.revature.emp;

public class Contractual extends Employee{
	
	private int hours_present;

	public int getHours_present() {
		return hours_present;
	}

	public void setHours_present(int hours_present) {
		this.hours_present = hours_present;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 20*hours_present;
	}
	
	

}
