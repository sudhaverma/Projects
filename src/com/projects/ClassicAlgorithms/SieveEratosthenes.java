package com.projects.ClassicAlgorithms;

import java.util.Scanner;

/**
 * Sieve of Eratosthenes - The sieve of Eratosthenes is one of the most efficient ways to find all of the smaller primes (below 10 million or so).
 * @author sudha
 *
 */
public class SieveEratosthenes {

	public static void main(String args[])
	{
		System.out.println("Enter the number below 10 million for finding all the primes upto that number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		findPrime(num);
	}
//this function has the time complexity of O(N(log(logN)) and space complexity is O(N)
	private static void findPrime(int num) {
		// prints all the prime numbers upto 'num'
		int[] arr = new int[num+1];
		for(int i = 0 ; i <= num ; i++)
		{
			arr[i] = 1; //initialize all the numbers upto num as prime numbers
		}
		arr[0] = 0;
		arr[1] = 0;
		
		for(int i = 2 ; i<= Math.sqrt(num) ; i++)
		{
			//strike off all the multiples of prime numbers in the list
			if(arr[i] == 1)
			{
			for(int j = 2; j*i <= num ; j++)
			{
				arr[i*j] = 0;
			}
			}
		}
		//Print all the prime numbers upto given number 'num'
		for(int i = 0 ;i <= num ; i++)
		{
			if(arr[i] == 1)
			{
				System.out.println(i);
			}
		}
	}
}
