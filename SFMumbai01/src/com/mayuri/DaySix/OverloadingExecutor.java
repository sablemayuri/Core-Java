package com.mayuri.DaySix;

public class OverloadingExecutor {

	public static void main(String[] args)
	{
//		MethodOverloading m = new MethodOverloading();
//		System.out.println(m.addition(1234, 4321));		
		
		System.out.println(MethodOverloading.addition("Mayuri", "Sable"));
		System.out.println(MethodOverloading.addition(12, 345));
		System.out.println(MethodOverloading.addition(12.56f, 45.78f));
		System.out.println(MethodOverloading.addition(68.13f, 154));
		

	}

}
