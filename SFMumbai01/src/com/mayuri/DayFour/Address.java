package com.mayuri.DayFour;
//Contained Class
public class Address 
{
	private String street;
	private String city;
	private String state;
	private String postelCode;
	
	
	//Constructors
	
	public Address() {
		super();
	}
	public Address(String street, String city, String state, String postelCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postelCode = postelCode;
	}
	
	//Getters and setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostelCode() {
		return postelCode;
	}
	public void setPascalCode(String postelCode) {
		this.postelCode = postelCode;
	}
	
	
	
	

}