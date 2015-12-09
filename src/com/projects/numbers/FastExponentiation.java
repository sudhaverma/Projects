package com.projects.numbers;

import java.util.Scanner;

/**
 * Fast Exponentiation - Ask the user to enter 2 integers a and b and output a^b (i.e. pow(a,b)) in O(lg n) time complexity.
 * @author sudha
 *
 */
public class FastExponentiation {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter values for a and b in exponentiation ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = findPower(a,b);
		System.out.println(" a raised to the power of b is "+result);
		
	}

	private static int findPower(int a, int b) {
		// this function finds the power(a,b) i,e a raised to power of b using recursion with memoization approach
		 int temp;
		    if( b == 0)
		        return 1;
		    temp = findPower(a, b/2);
		    if (b%2 == 0)
		        return temp*temp;
		    else
		        return a*temp*temp;
	}
}
