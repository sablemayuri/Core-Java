//Amicable Numbers (For Loop Based) Program in Java.

package com.mayuri;

import java.util.Scanner;

/*Two different numbers are said to be so Amicable Numbers if each sum of divisors is equal to the other number.
Amicable Numbers are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368) etc.*/

public class AmicableNumber
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		int a = in.nextInt();
		System.out.println("Enter the 2nd Number : ");
		int b = in.nextInt();
		int sumA=0,sumB=0;
		
		for (int i = 1; i< a; i++) 
		{
			if (a%i==0)
			{
				sumA+=i;
			}
		}
		
		for(int i = 1; i < b; i++)
		{
			if (b%i==0)
			{
				sumB += i;
				
			}
		}
		
		if (sumA==b && sumB==a)
		{
			System.out.println("The Entered Number is a Amicable Number!");
		}
		else
		{
			System.out.println("The Number is not Amicable Number!");
		}
	
		in.close();

	}

}
