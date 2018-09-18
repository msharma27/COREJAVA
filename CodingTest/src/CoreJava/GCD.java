package CoreJava;

import java.util.Scanner;

public class GCD {

	// GCD of two numbers doesn’t change if smaller number is subtracted from a bigger number.
	public static int ComputeGCD(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
		}

		else if (a == b) {
			return a;
		}

		if (a > b)
			// recursively call this function
			return ComputeGCD(a - b, b);
		else
			return ComputeGCD(b - a, a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		int result;
		result = ComputeGCD(num1, num2);

		System.out.println("GCD of the numbes is: " + result);

	}
}
