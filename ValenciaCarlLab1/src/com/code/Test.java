package com.code;
import com.Prog.*;
public class Test {

	public static void main(String[] args) {
		
		System.out.println("Payroll Calculator");
		Payroll e1 = new Employee(24, "Electrician", 'M');
		e1.setEmployee("Russell Pondivida");
		System.out.println(e1.getEmployee());
		System.out.println(((Employee) e1).getAge());
		System.out.println(((Employee) e1).getPos());
		System.out.println(((Employee) e1).getGender());
		System.out.println(e1.getEmployee());
		e1.salary(550, 5.5, 7, 500);


		Payroll e2 = new Payroll("Carl Valencia", "20/01/20");
		System.out.println(e2.getEmployee());
		e2.salary(750, 6, 5, 1000);
		
		
		

	}

}
