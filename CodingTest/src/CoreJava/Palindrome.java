package CoreJava;

import java.util.Scanner;

public class Palindrome {

	// check if the string is a palindrome or not
	
	public static void CheckPalindrome(String str)
	{
		String rev_str = new StringBuffer(str).reverse().toString();
		
		if(str.equals(rev_str))
		{
			System.out.println("It is a palindrome");
		}
		
		else
		{
			System.out.println("String is not a palindrome");
		}
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String org_str = s.next();
		
		CheckPalindrome(org_str);
		
	}
}
