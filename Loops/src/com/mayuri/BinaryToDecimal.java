//Binary to Decimal Number (while loop Based) Program in Java

package com.mayuri;

import java.util.Scanner;

public class BinaryToDecimal 
{

	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Binary Number : ");
		int binary = in.nextInt();
		int i = 0 , decimal = 0, rem;
		int temp = binary;
		
		while(temp >0)
		{
			rem = temp % 10;
			decimal += rem*Math.pow(2, i);
			temp = temp/ 10;
			i++;
		}
		
		System.out.println("Decimal = " + decimal);
		
		
		in.close();

	}

}
