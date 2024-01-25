//Find the sum of two numbers Program in Java

import java.util.Scanner;
public class Sum 
{

	public static void main(String[] args) 
	{
		int num1,num2,sum;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number Num1 : ");
		num1 = obj.nextInt();
		System.out.println("Enter a number Num2 : ");
		num2 = obj.nextInt();
		
		sum = num1+num2;
		System.out.println("Sum of Two Numbers is : " + sum);
		

	}

}
