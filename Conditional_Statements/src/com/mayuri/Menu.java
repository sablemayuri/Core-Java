/*Menu Driven (Switch Based) Program in Java to find the area of triangle, equilateral triangle,
 square , rectangle or a circle as per the choice entered from the menu.*/

package com.mayuri;

import java.util.Scanner;

public class Menu
{

	public static void main(String[] args) 
	{
		int a,l,b,r;
		double area;
		Scanner input = new Scanner(System.in);
		System.out.println("Press  1 = Area of a Right Triangle :");
		System.out.println("Press  2 = Area of a Equilateral Triangle :");
		System.out.println("Press  3 = Area of a Square :");
		System.out.println("Press  4 = Area of a Rectangle :");
		System.out.println("Press  5 = Area of a Circle :");
		System.out.println("-----------------------------------------------------");
		System.out.println("Select your Choice From the given Menu");
		int choice = input.nextInt();
		
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the Length : ");
		    l= input.nextInt();
			System.out.println("Enter the Breadth : ");
			b= input.nextInt();
			area = (l*b)/2;
			System.out.println(" Area of a Right Triangle :" + area);
			break;
		case 2:
			System.out.println("Enter the area : ");
			a = input.nextInt();
			area = (a*a*Math.sqrt(3))/4;
			System.out.println(" Area of a Equilateral Triangle :");
			break;
		case 3:
			System.out.println("Enter the area : ");
		    a = input.nextInt();
			area = a*a;
			System.out.println(" Area of a Square :" + area);
			break;
		case 4:
			System.out.println("Enter the Length : ");
			l= input.nextInt();
			System.out.println("Enter the Breadth : ");
			b= input.nextInt();
			area = l*b;
			System.out.println(" Area of a Rectangle :" + area);
			break;
		case 5:
			System.out.println(" Radius of a Circle :");
			r = input.nextInt();
			area= r*r*22/7;
			System.out.println(" Area of a Circle :" + area);
			break;
		default:
			System.out.println(" Enter a Valid Choice !");
		}
		
		input.close();

	}

}
