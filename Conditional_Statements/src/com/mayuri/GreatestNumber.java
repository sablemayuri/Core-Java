//Greatest number (If Based) Program in Java

package com.mayuri;

import java.util.Scanner;

public class GreatestNumber 
{

	public static void main(String[] args) 
	{
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		num1 = input.nextInt();
		System.out.println("Enter Number 2 : ");
		num2 = input.nextInt();
		System.out.println("Enter Number 3 : ");
		num3 = input.nextInt();
		input.close();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(" Num1 is Greatest !");
			}
			else
			{
				System.out.println(" Num3 is Greatest !");
			}
		}
		if(num2 > num3)
		{
			System.out.println(" Num2 is Greatest !");
		}
		else
		{
			System.out.println(" Num3 is Greatest !");
		}
		

	}

}
