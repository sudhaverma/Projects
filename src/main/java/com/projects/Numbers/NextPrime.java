package com.projects.Numbers;

import java.util.Scanner;

/**
 * Next Prime Number - Have the program find prime numbers until the user chooses to stop asking for the next one.
 * @author sudha
 *
 */
public class NextPrime {

	public static void main(String args[])
	{
		System.out.println("Enter the limit for the prime numbers to be displayed ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		System.out.println("Prime numbers are ");
		findPrimes(limit);
		sc.close();
	}

	private static void findPrimes(int limit) {
		// Finds prime number in Number System
		//This function takes time complexity of O(n*Sqrt(n)) where n is the number of elements in number system
		String r = null;
		do
		{
			for(int i = 2 ; i <= limit ; i++)
			{
			boolean res = isPrime(i);
			if(res)
			{
				System.out.println(i);
			}
			System.out.println("Do you want to find next prime number ? Yes or No");
			Scanner sc = new Scanner(System.in);
			r = sc.next();
			}
		}
		while(r.equalsIgnoreCase("Yes"));
	}

	private static boolean isPrime(int num) {
		// finds whether the given number is prime or not
		for(int i = 2 ; i <= Math.sqrt(num) ; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
