package com.mayuri.DayThree;

public class Executor {

	public static void main(String[] args) {
		// to do auto generated method
		Encapsulation obj = new Encapsulation();
		obj.setLaptopName ("Dell");
		obj.setPrice(5645.00f);
		obj.setSerialNumber(123456);
		System.out.println(obj.getLaptopName());
		System.out.println(obj.getPrice());
		System.out.println(obj.getSerialNumber());
	}
}
