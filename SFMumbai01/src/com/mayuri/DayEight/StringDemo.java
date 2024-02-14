package com.mayuri.DayEight;

public class StringDemo {

	public static void main(String[] args) 
	{
		String str = new String("Mayuri");//Way 1
		System.out.println(str);
		
		String str2 = "Sable";//Way 2
		System.out.println(str2);
		
		
		String s1 = new String("Hello");//2 Objects i.e 1 in Heap & 1 in String pool
		String s2 = new String("Hello");//1 Object in Heap & no Duplicate in String Pool
		String s3 = "Hello";//0 Objects no Duplicate
		String s4 = "Hello";//0 Objects no Duplicate

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
