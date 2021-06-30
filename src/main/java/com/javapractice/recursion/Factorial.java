package com.javapractice.recursion;

/**
 * Factorial is multiplication of all the numbers from 1 till number. factorial
 * of 0 is 1 and factorial of -ve numbers is infinite.
 * 
 * Recursion is method calling itself. there has to be a break point in
 * recursion else we can get stack overflow exception. The recursion is costlier
 * than the regular implementation but sometime it is still preferred because of
 * its convenience.
 * 
 */
public class Factorial {

	public static int factorialWithRecursion(int number) {
		if (number == 0) {
			return 1;
		}
		return number * factorialWithRecursion(number - 1);
	}

	public static int factorialWithoutRecursion(int number) {
		int fact = 1;
		if (number == 0) {
			return fact;
		} else {
			for (int i = 1; i <= number; i++) {
				fact *= i;
			}
		}
		return fact;
	}

	public static void main(String args[]) {
		System.out.println("Factorial of 5 without recursion : " + factorialWithoutRecursion(5));
		System.out.println("Factorial of 5 with recursion    : " + factorialWithRecursion(5));
	}

}
