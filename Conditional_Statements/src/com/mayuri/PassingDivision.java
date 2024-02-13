//Passing Division (IF Based Program) in Java

package com.mayuri;

import java.util.Scanner;

public class PassingDivision
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks out of 100 : ");
		System.out.println("Enter the marks of English : ");
		int english = input.nextInt();
		System.out.println("Enter the marks of Maths : ");
		int maths = input.nextInt();
		System.out.println("Enter the marks of History : ");
		int history = input.nextInt();
		System.out.println("Enter the marks of Science : ");
		int science = input.nextInt();
		System.out.println("Enter the marks of Geography : ");
		int geography = input.nextInt();
		input.close();
		
		int total = english+maths+history+science+geography;
		System.out.println("The Total marks out of 500 : " + total);
		
		int percent = total/5;
		System.out.println("The Percentage is : " + percent);
		
		
		if(percent<=33)
		{
			System.out.println("You are Fail!");
		}
		else if (percent>=33 && percent < 40)
		{
			System.out.println("Third Division");
		
		}
		else if (percent>=40 && percent > 60)
		{
			System.out.println("Second Division");
		
		}
		else 
		{
			System.out.println("First Division");
		
		}

	}

}
