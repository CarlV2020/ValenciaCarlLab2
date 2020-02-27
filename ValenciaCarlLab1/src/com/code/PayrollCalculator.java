package com.code;
import com.Prog.Payroll;

public class PayrollCalculator {

	public static void main(String[] args) {
		System.out.println("Payroll Calculator");
		Payroll e1 = new Payroll();
		e1.setEmployee("Rusell Pondivida");
		e1.setDate("20/01/20");
		System.out.println(e1.getEmployee());
		e1.salary(550, 5.5, 7, 500);


		Payroll e2 = new Payroll("Carl Valencia", "20/01/20");
		System.out.println(e2.getEmployee());
		e2.salary(750, 6, 5, 1000);

	}

}
