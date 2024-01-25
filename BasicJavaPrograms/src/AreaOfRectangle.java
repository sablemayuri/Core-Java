//To Find the Area of a Rectangle Program in Java

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		int l,b,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		l= sc.nextInt();
		System.out.println("Enter the bredth : ");
		b= sc.nextInt();
		
		area = l*b;
		System.out.println("Area of a Rectangle is : " + area);

	}

}
