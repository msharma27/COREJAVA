package CoreJava;

import java.util.Scanner;

public class SquareRoot {

	// variables
	
	
	
	// method 1 - Using Math sqrt function
	public static void ComputeRoot(float num)
	{
		System.out.println("\n---- Method 1-----\n");
		System.out.print("Square root of the number is : ");
		System.out.println((float) Math.sqrt(num));
		
	}
	
	public static void ComputeRootByEquation(float number)
	{
		float temp;
		 
		float sqrt = number / 2;
		temp = sqrt;

		do {
			temp = sqrt;
			sqrt = (temp +(number / temp)) /2;
			
		} while((temp - sqrt) !=0);
		
		System.out.println("\n-----Method 2------\n");
		System.out.print("Square root of the number is : ");
		System.out.println(sqrt);
	}
	
	// main method
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("-----------Computing the squareroot of a number-------------");
		System.out.println("Enter the number");
		float input = s.nextFloat();
		
		ComputeRoot(input);
		
		ComputeRootByEquation(input);
		
	}
}
