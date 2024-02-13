//Equal Number (If based) Program in Java

package com.mayuri;

import java.util.Scanner;

public class EqualNumber 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = input.nextInt();
		input.close();
		
		if (num == 10)
		{
			System.out.println("Number is equal to 10!");
		}

	}

}
