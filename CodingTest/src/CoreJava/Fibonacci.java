package CoreJava;

import java.util.Scanner;

public class Fibonacci {

	public static int ComputeFibonacci(int val) {
		if (val <= 1) {
			return val;
		} else {
			return ComputeFibonacci(val - 1) + ComputeFibonacci(val - 2);
		}
	}

	// main function

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		int result;
		result = ComputeFibonacci(n);
		System.out.println("Fibonacci for n is: " + result);

	}

}
