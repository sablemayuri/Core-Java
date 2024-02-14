package com.mayuri.DayEight;

public class StringDemo2 {

	public static void main(String[] args) 
	{
		String s = new String("Mayuri");
//		s.concat("Sable");//Immutable String Objects
		String s2 = s.concat(" Sable");
		System.out.println(s2);
		
//		String and StringBuffer
		//Both are opposites of each other
		//String objects are Immutable (cannot be changed)
		//StringBuffer Objects are Mutable in nature
		
		StringBuffer s1 = new StringBuffer("Mayuri");
		s1.append(" Sable");
		System.out.println(s1);
		
		
		System.out.println(s.length());//length()method is used with string 
		      						//length variable is used with arrays.
		
		
		String I = s.toLowerCase();
		String u = s.toUpperCase();
		
		System.out.println(I);
		System.out.println(u);
		

	}

}
