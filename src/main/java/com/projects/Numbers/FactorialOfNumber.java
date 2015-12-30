package com.projects.Numbers;

import java.util.Scanner;

/*
 * Factorial Finder - The Factorial of a positive integer, n, is defined as the product of the sequence n, n-1, n-2, ...1 and the factorial of zero, 0, is defined as being 1.
 * @author sudha 
 */
public class FactorialOfNumber {
	
	public static void main(String args[])
	{
		System.out.println("Enter the number for finding factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int result = findFactorial(num);
		System.out.println("Factorial of number "+ num +" is -> "+result);
	}

	private static int findFactorial(int num) {
		// finds the factorial of the given number
		if(num < 1)
			return 1;
		
		return num* findFactorial(num-1);
	}

}
