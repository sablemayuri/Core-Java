package com.mayuri.DayTwelve;

public class ExceptionDemo {

	public static void main(String[] args) 
	{
		int arr[];
		
		try
		{
			arr = new int [] {10,20,30,40,50};
			System.out.println(arr[6]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Specified index does not exist! " +e.getMessage());
		}
		finally
		{
			System.out.println("Hey I am Finally!");
		}

	}

}
