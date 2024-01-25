//Fahrenheit to Celsius Program in Java

import java.util.Scanner;
public class Fahrenite2Celsius {

	public static void main(String[] args)
	{
		float f,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Fahrenhiet : ");
		f= obj.nextFloat();
		c= ((f-32)*5)/9;
		System.out.println("Celsius : " + c);

	}

}
