package com.mayuri.DayTen;

public class Executor {

	public static void main(String[] args) 
	{
		Student arr[]; //Array Declaration
		arr= new Student[5]; //Array Creation
		
		arr[0]= new Student(101, "Mayuri");
		arr[1]= new Student(102, "Preeti");
		arr[2]= new Student(103, "Suchita");
		arr[3]= new Student(104, "Kamini");
		arr[4]= new Student(105, "Pooja");
		
		
		for (int i = 0; i<arr.length; i++) 
		{
			System.out.println("Student Array Elements  "+i+": "+ arr[i].getRollNo()+" "+arr[i].getName());
			
		}

	}

}
