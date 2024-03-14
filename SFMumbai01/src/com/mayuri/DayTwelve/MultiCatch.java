package com.mayuri.DayTwelve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch 
{
		public static void divide()
		{
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the operands for division: ");
			
			try 
			{
				a=sc.nextInt();
				b= sc.nextInt();
				c= a/b;
				System.out.println("Division is =  "+c);
				
			}
			catch(InputMismatchException e) 
			{
				System.err.println("Invalid Input! Please ensure entering integer input: ");
			}
			catch(ArithmeticException e)
			{
				System.err.println("Exception caught! "+e.getMessage());
			}
			catch(Exception e)
			{
				System.err.println("Exception caught! "+e.getMessage());
			}
			finally
			{
				sc.close();
			}
			
			
		}

}
