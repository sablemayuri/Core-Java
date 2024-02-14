package com.mayuri.DayTen;

public class Student // Class is a user defined Datatype 
{
	private int rollNo;
	private String name;
	
	//Constructors
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	
	//Getters and Setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
