//Find Avereage Marks Program in Java

import java.util.Scanner;
public class MarksAverage 
{

	public static void main(String[] args) 
	{
		int english,science,history,maths,geography,total,percent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks out of 100 : ");
		System.out.println("Enter the marks English : ");
		english = sc.nextInt();
		System.out.println("Enter the marks Science : ");
		science = sc.nextInt();
		System.out.println("Enter the marks History : ");
		history = sc.nextInt();
		System.out.println("Enter the marks Maths : ");
		maths = sc.nextInt();
		System.out.println("Enter the marks Geography : ");
		geography = sc.nextInt();
		
		total= english+science+history+maths+geography;
		System.out.println("Total Marks out of 500 is :  " + total);
	
		percent = total/5;
		System.out.println("Percentage of marks is :  " + percent);
		

	}

}
