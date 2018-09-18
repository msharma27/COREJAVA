package CoreJava;

import java.util.Scanner;

public class reverseNumber {

	
	// methods
	public static void reverseInt(int val)
	{
		int temp = 0;
		
		while(val!=0)
		{
			temp = temp*10;
			temp = temp + (val%10);
			val = val/10;
			
		}
		
		System.out.println("Reverse of the number is: " + temp);
	}
	
	// main method
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to be reversed");
		
		int num = s.nextInt();
		
		reverseInt(num);
	
	}
}
