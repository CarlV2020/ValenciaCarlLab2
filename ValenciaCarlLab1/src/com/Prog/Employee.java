package com.Prog;

public class Employee extends Payroll {
	
	private int age;
	private String pos;
	private char gender;
	
	
	public Employee(int age, String pos, char gender) {
		this.age = age;
		this.pos = pos;
		this.gender= gender;
	}
	
	public void salary (double rate, double daysP, double overTHrs, int Vale) {
		double salary = rate * daysP + (rate / 8 * overTHrs) - Vale ;
		System.out.println("Weekly Salary: " + salary);
	}
	
	public void years(int num){
		System.out.println(num + " years in the Company");
	}
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPos() {
		return pos;
	}


	public void setPos(String pos) {
		this.pos = pos;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}

}
