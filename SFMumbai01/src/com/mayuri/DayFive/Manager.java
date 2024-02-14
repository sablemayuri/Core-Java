package com.mayuri.DayFive;
//Child class or derived class
public class Manager extends Employee
{
	private int teamsize;

	
	//Constructors

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String employeeName, int employeeId, String department,int teamsize) {
		super(employeeName, employeeId, department);
		// TODO Auto-generated constructor stub
	}
	
	
	//Getters and Setters
		public int getTeamsize() {
			return teamsize;
	}
		
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Manager [teamsize=" + teamsize + ", getEmployeeName()=" + getEmployeeName() + ", getEmployeeId()="
				+ getEmployeeId() + ", getDepartment()=" + getDepartment() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
