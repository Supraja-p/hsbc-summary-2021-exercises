package com.hsbc;

import java.util.Scanner;

public class TestComplexArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees you want to store");
		int size = scan.nextInt();
		// declaring an array of employee
		Employee[] employees = new Employee[size]; // each block will have null by default
		for(int i = 0; i < size; i++) {
			System.out.println("Employee is going to be stored at index: "+i);
			System.out.println("Enter id");
			int id = scan.nextInt();
			System.out.println("Enter name");
			String name = scan.next();
			System.out.println("Enter salary");
			double salary = scan.nextDouble();
			Employee emp = new Employee(id, name, salary);
			employees[i] = emp;
		}
		System.out.println("---- All the employees -------");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		scan.close();
	}
}
