package com.mayuri.DayNine;
//Demo on String Comparison
public class StringComparison {

	public static void main(String[] args)
	{
		String s1 = "TNSIF";//String Constant Pool
		
		String s2 = "TNSIF";
		
		String s3 = new String ("TNSIF");//Heap area
		
		String s4 = new String ("TNSIF");
		
//	to check	s1==s2, s1==s3, s3==s4
		
		//== operator --------> Address Comparison
		System.out.println("s1==s2:" + " "+ (s1==s2));
		System.out.println("s1==s3:"+" "+(s1==s3));
		System.out.println("s3==s4:" + " " +(s3==s4));
		
		//equals()------>Content Comparison
		System.out.println("s1 equals s2: " +s1.equals(s2));
		System.out.println("s1 equals s3: " +s1.equals(s3));
		System.out.println("s3 equals s4: " +s3.equals(s4));
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//compareTo()-----> unicode //returns 0 if strings are equal
		System.out.println(s1.compareTo("tnsif")); //smaller than other string then return negative number
		System.out.println(s1.compareTo("TNSIF")); // equal strings then returns 0
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));//returns 0 only cause ignoring the case & considered equal
		System.out.println(s1.compareTo(s2));//can do for objects as well
	}

}
