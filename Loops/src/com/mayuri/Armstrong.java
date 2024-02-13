// Armstrong (While loop Based) program in java.

package com.mayuri;

import java.util.Scanner;

/*Armstrong Number is a positive number 
if it is equal to the sum of cubes of its digits is called Armstrong number 
and if its sum is not equal to the number then its not a Armstrong number.*/

public class Armstrong                                
{

	public static void main(String[] args) 
	{
		int rem, cubesum= 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = in.nextInt();
		int num = n;
		
		while(num >0)
		{
			rem = num % 10;
			cubesum += (rem*rem*rem);
			num /= 10;
			
		}
		if (n == cubesum)
		{
			System.out.println("Armstrong Number !");
		}
		else
		{
			System.out.println("Not a Armstrong Number !");
		}

		in.close();
	}

}
