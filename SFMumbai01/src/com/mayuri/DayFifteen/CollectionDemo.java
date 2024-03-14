package com.mayuri.DayFifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		//Generics - used to generalise the nature of elements
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(110);
		list.add(1110);
		list.add(111110);
		list.add(11101);
	
//		list.remove(1);
	
		System.out.println(list);
		
		for(int element:list)
		{
			System.out.println(element);
		}
		
		//Collection Framework....Collections class
		
		//sort
		Collections.sort(list);
		System.out.println("Sorted List  Asc: "+list);
		//reverse
		Collections.reverse(list);
		System.out.println("Sorted List Desc : "+list);

		//Lambda Expression
		Comparator<Integer> comp= (n1,n2)->n2-n1;
		Collections.sort(list,comp);
		System.out.println("Sorted List Desc : "+list);
		
		//Userdefined object----> Generics
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(101, "Mayuri", 5.5f);
		studentList.add(s1);
		Student s2 = new Student(102, "Preeti", 4.5f);
		studentList.add(s2);
		Student s3 = new Student(103, "Kamini", 2.5f);
		studentList.add(s3);
		Student s4 = new Student(104, "Suchita", 3.5f);
		studentList.add(s4);
		Student s5 = new Student(105, "Pooja", 2.5f);
		studentList.add(s5);
		System.out.println(studentList);
		
		//Sorting on percentage criteria
		Comparator<Student> comp1 = (st1,st2)->(int)(st1.getPer()-st2.getPer());
		Collections.sort(studentList, comp1);
		System.out.println(studentList);
		
		
		//Homework
		Comparator<Student> comp2 = (st1,st2)->st1.getName().compareTo(st2.getName());
		Collections.sort(studentList, comp2);
		System.out.println(studentList);
	}

}
