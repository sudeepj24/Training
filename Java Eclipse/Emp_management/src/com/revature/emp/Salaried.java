package com.revature.emp;

public class Salaried extends Employee{
//    private int daysPresent;
    private double days_present;
    
    
    
	public double getDays_present() {
		return days_present;
	}



	public void setDays_present(double days_present) {
		this.days_present = days_present;
	}

	


	public Salaried() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Salaried(int emiId, String name, int salary) {
		super(emiId, name, salary);
		// TODO Auto-generated constructor stub
	}



	@Override
	public double calculateSalary() {
		return 100 * days_present;
		
	}
    
    
    
}
