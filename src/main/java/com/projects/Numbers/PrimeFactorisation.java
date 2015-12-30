package com.projects.Numbers;

import java.util.Scanner;
/*
 * Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.
 * @author sudha
 */

public class PrimeFactorisation {

	
	public static void main(String args[])
	{
		System.out.println("Enter the number for which we have to find prime factorisation");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		findPrimeFactors(number);
		sc.close();
	}

	private static void findPrimeFactors(int number) {
		// Finding prime factors of a given number 'number'
		// Time complexity of this algorithm is O(Sqrt(number))
		int count; //this variable will keep track of power of the number
		for(int i = 2 ; i <= Math.sqrt(number) ; i++)
		{
			if( number % i == 0)
			{ 
			    count = 0;
				while(number % i == 0)
				{
					number = number /i;
					count++;
				}
				System.out.print(i +","+ count+"\t");
			}
			
		}
		if(number != 1)
		{
			System.out.print(number + ","+ 1);
		}
		
	}
}
