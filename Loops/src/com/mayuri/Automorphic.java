package com.mayuri;

import java.util.Scanner;

public class Automorphic 
{

	public static void main(String[] args)
	{
		int c = 0, sqrnum;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int n = in.nextInt();
		int num = n;
		
		while(num > 0)
		{
			num/=10;
			c++;
		}
		sqrnum = n*n;
		int sqrNumRem = sqrnum%(int) Math.pow(10, c);
		
		if (sqrNumRem ==n)
		{
			System.out.println(n +" "+ "Is a Automorphic number!");
		}
		else
		{
			System.out.println( "Not a Automorphic number!");
		}
		in.close();
	}

}
