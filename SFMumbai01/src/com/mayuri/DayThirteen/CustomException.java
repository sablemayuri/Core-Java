package com.mayuri.DayThirteen;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args)
	{
		int age ;
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		age= sc.nextInt();
		
		if(age<18) 
		{
			throw new CantVote("You Can't vote as you are underage..");
		}
		else
		{
			System.out.println("You can happily vote..");
		}
		

	}

}
class CantVote extends RuntimeException//Throwable --printStackTrace()
{

	public CantVote(String msg) {
		super(msg);
		
	}

	
	
}
