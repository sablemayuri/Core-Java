package com.mayuri.DaySixteen;
//Entity
public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private int age;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//Constructors
	public Employee(int id, String name, double salary, int age ) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	//added unimplemented method for giving body to the dummy(abstract)method in the interface
	@Override
	public int compareTo(Employee otherEmployee) {
		return Integer.compare(this.id, otherEmployee.id);
	}
	
	
	
	
	

}
