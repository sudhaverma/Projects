package com.projects.ClassicAlgorithms;

import java.util.Scanner;

/**
 * Collatz Conjecture - Start with a number n > 1. Find the number of steps it takes to reach one using the following process: If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1.
 * @author sudha
 *
 */

public class CollatzConjecture {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number between 1 and 100 to check collatz conjecture :");
		int num = sc.nextInt();
		int steps = findStepForCollatz(num);
		System.out.println("Number of steps required to reach one is " + steps);
		sc.close();
	}

	private static int findStepForCollatz(int num) {
		// Checks whether the number is even or odd and then based on it calculates steps to reach 1 from that number
		int stepcount= 0;
		while(num != 1)
		{
		if (num % 2==0)
		{
			num = num/2;
			System.out.println(num);
			stepcount++;
		}
		else
		{
			num = 3*num + 1;
			System.out.println(num);
			stepcount++;
			
		}
		}
		return stepcount;
	}
}
