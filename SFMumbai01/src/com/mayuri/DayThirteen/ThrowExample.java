//In this program the age of the student and weight of the student is checked
/*If the student age is less than 15 and weight less than 40 
 * than the program should return that the student is not eligible*/

package com.mayuri.DayThirteen;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) throws CantRegisterException
	{
		System.out.println("Welcome to the Registration!..");
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			System.out.println("Enter the weight: ");
			int weight = sc.nextInt();
			
			
			if(age<15 && weight<40)
			{
				throw new CantRegisterException("Invalid input You may not Register! Please enter valid age and weight. ");
			}
			else
			{
				System.out.println("Student entry is valid..You may Register!");
			}
			
		}
		finally
		{
			sc.close();
		}
		
	}

}
class CantRegisterException extends Exception
{

	public CantRegisterException(String msg) {
		super(msg);
		System.out.println("Have a nice day!");
		
	}
	
}
