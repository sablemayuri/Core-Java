package com.mayuri.DaySixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args)
	{
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(111,"Mayuri",50000.0, 23));
		employees.add(new Employee(211,"Preeti",80000.0, 20));
		employees.add(new Employee(311,"Suchita",30000.0,24));
		employees.add(new Employee(511,"Kamini",40000.0, 23));
		employees.add(new Employee(411,"Pooja",30000.0, 24));
		
		System.out.println("Original List : ");
		employees.forEach(System.out::println);//double colon to print the list
		
		Collections.sort(employees);
		
		System.out.println("Sorted List on the basis of Ids : ");
		employees.forEach(System.out::println);
		

		Collections.sort(employees, new EmployeeSalaryComparator());
		System.out.println("Sorted List on the basis of Salary : ");
		employees.forEach(System.out::println);
		
		Collections.sort(employees, new EmployeeNameComparator ());
		System.out.println("Sorted List on the basis of Name : ");
		employees.forEach(System.out::println);
		
		Collections.sort(employees, new EmployeeAgeComparator());
		System.out.println("Sorted List on the basis of Age : ");
		employees.forEach(System.out::println);
	}

}
