//Swapping Program in Java


public class Swapping
{

	public static void main(String[] args)
	{
		int a = 10, b= 20, temp;
		System.out.println("Before Swapping");
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
		
		temp = a;
		a= b;
		b= temp;
		
		System.out.println("After Swapping");
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
		
	}

}
