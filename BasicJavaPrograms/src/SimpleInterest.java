//Simple Interest Program in Java

import java.util.Scanner;
public class SimpleInterest 
{

	public static void main(String[] args)
	{
		int p,r,t,si;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an Amount: ");
		p = obj.nextInt();
		System.out.println("Enter a Rate: ");
		r = obj.nextInt();
		System.out.println("Enter a Time: ");
		t = obj.nextInt();
		
		si = p*r*t/100;
		System.out.println("Simple Interest : " + si);
		

	}

}
