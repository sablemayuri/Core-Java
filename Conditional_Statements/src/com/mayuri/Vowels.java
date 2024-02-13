// Vowels (Switch Based) Program in Java


package com.mayuri;

import java.util.Scanner;

public class Vowels
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the character : ");
		char ch = input.next().charAt(0);
		input.close();
		
		switch(ch)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowels");
			break;
		default:
			System.out.println("Constant");
		
		
		}

	}

}
