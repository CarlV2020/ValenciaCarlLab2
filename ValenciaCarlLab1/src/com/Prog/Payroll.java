package com.Prog;

public class Payroll{

	private String employee;
	private String date;

	
	public Payroll(){
		System.out.println("Generating Salary...");
	}
	
	public Payroll(String employee, String date){
		this.employee = employee;
		this.date = date;
	}
	
	public void salary (double rate, double daysP, double overTHrs, int Vale) {
		double salary = rate * daysP + (rate / 8 * overTHrs) - Vale ;
		System.out.println("The salary of the employee for " + date + " is "+ salary + " pesos");
	}
	
	public String getEmployee() {
		return this.employee;
	}
	
	public String getDate() {
		return this.date;
	}
	
	
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
