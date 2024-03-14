package com.mayuri.DaySixteen;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	//added unimplemented method for giving body to the dummy(abstract)method in the interface
	@Override
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e1.getSalary(), e2.getSalary());
	}
	
	

}
