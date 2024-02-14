package com.mayuri.DayFour;

public class AssociationExecutor {

	public static void main(String[] args)
	{
		Address address = new Address("NasikCity", "Nasik", "MH","422010");
		
		Person person = new Person("Mayuri Sable", address);
		
		person.display();

	}

}
