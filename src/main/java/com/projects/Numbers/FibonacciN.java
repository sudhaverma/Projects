package com.projects.Numbers;

import java.util.Scanner;

/**
 * Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
 * 
 * @author Sudha
 *
 */
public class FibonacciN {
	
	public static void main(String args[])
	{
		System.out.println("Please enter the limit of the fibonnaci series");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		long [] F = new long[limit];
		//Set all F with -1 indicating that F(i) is not yet calculated
		for(int i = 0; i < limit ; i++)
		{ 
			F[i] = -1;
		}
		String res;
		do
		{
		System.out.println("Please enter a number for generating fibonnaci series ");
		int number = sc.nextInt();
		long result = 0;
		
		System.out.println("Fibonnaci series of given number "+ number + " is-> ");
		for(int i=0 ;i < number ; i++)
		{
			result = findFibonnaci(i , F);
			System.out.println(result);
		}
		System.out.println("Do you want to continue -Yes or No ?");
		res = sc.next();
		}
		while(res.equalsIgnoreCase("Yes"));
		sc.close();
	} 

	private static long findFibonnaci(int num , long[] f) {
		// Using recursion with memoization to find Fibonnaci of given number 'num'
		if(num == 1 || num == 0)
		{
			return num;
		}
		if(f[num] != -1)
		{
			return f[num];
		}
		f[num] = findFibonnaci(num-1 , f) + findFibonnaci(num-2 ,f); 
		return f[num];
	}

}
