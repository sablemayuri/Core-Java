//Find the Greatest between 2 (If Based) Program in Java

package com.mayuri;

import java.util.Scanner;

public class GreaterNumber
{

	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number 1 : ");
		n1 = input.nextInt();
		System.out.println("Enter the Number 2 : ");
		n2 = input.nextInt();
		input.close();
		
		if(n1 > n2)
		{
			System.out.println("n1 is Greater!");
		}
		else
		{
			System.out.println("n2 is Greater !");
		}

	}

}
