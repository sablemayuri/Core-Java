//Voting age (IF Based) Program in Java

package com.mayuri;

import java.util.Scanner;


public class VotingAge 
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = input.nextInt();
		input.close();
		if(age>=18)
		{
			System.out.println("You are Eligible for Voting!");
		}
		else
		{
			System.out.println("You are not Eligible for Voting!");
		}
	}

}
