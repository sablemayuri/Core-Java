//Even Odd (If Based) Program in Java

package com.mayuri;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = input.nextInt();
		input.close();
		
		if(num % 2 == 0)
		{
			System.out.println("Number is Even!");
		}
		else
		{
			System.out.println("Number is Odd!");
		}
		

	}

}
