//Buzz Number Program (if-else Based) in Java.

package com.mayuri;

import java.util.Scanner;

//A number is said to be Buzz Number if it ends with 7 or is divisible by 7.
public class BuzzNumber
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = in.nextInt();
		
		if (n % 10 == 7 || n % 7 == 0)
		{
			System.out.println("Entered Number is a Buzz Number!");
		}
		else
		{
			System.out.println("Entered Number is not a Buzz Number!");
		}
		
	   in.close();
	
	}

}
