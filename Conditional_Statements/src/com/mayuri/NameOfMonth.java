//Name of the Month Program (Switch Based) in Java

package com.mayuri;

import java.util.Scanner;

public class NameOfMonth 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Month : ");
	    int month = input.nextInt();
		
		
		switch(month)
		{
			case 1:
				System.out.println("Name of the Month : January");
				break;
			case 2:
				System.out.println("Name of the Month : February");
				break;
			case 3:
				System.out.println("Name of the Month : March");
				break;
			case 4:
				System.out.println("Name of the Month : April");
				break;
			case 5:
				System.out.println("Name of the Month : May");
				break;
			case 6:
				System.out.println("Name of the Month : June");
				break;
			case 7:
				System.out.println("Name of the Month : July");
				break;
			case 8:
				System.out.println("Name of the Month : August");
				break;
			case 9:
				System.out.println("Name of the Month : September");
				break;
			case 10:
				System.out.println("Name of the Month : October");
				break;
			case 11:
				System.out.println("Name of the Month : November");
				break;
			case 12:
				System.out.println("Name of the Month : December");
				break;
			default :
				System.out.println("Enter a Valid Month!");
		}
		
		input.close();
	

	}

}
