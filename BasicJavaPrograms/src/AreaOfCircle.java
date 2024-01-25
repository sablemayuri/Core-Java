// Find Area of a Circle Program in Java

import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String[] args) 
	{
		float pi,r,area;
		pi= (float)22/7;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		r= sc.nextFloat();
		
		area = pi*r*r;
		System.out.println("Area of a Circle is : " + area);
	

	}

}
