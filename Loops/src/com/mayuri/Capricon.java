package com.mayuri;

import java.util.Scanner;

public class Capricon 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = in.nextInt();
		int square = n*n;
		int temp = square;
		int contDigits = 0;
		
		boolean isCapricon = false;
		
		while(temp>0)
		{
			contDigits ++;
			temp/=10;
		}
		for(int i=1;i<contDigits; i++)
		{
			int divisor = (int)Math.pow(10, i);
			int quotient = square /divisor;
			int reminder = square % divisor;
			if(quotient+reminder ==n) 
			{
				isCapricon = true;
			}
			
		}
		if(isCapricon)
		{
			System.out.println("Capricorn Number!");
		}
		else
		{
			System.out.println("Not a Capricorn Number!");
		}
		
		
		in.close();
		
		
	}

}
