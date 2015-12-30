package com.projects.Text;

import java.util.Scanner;

/**
 * Count Vowels - Enter a string and the program counts the number of vowels in the text. For added complexity have it report a sum of each vowel found.
 * @author sudha
 *
 */

public class CountVowels {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		countVowels(str);
	}

	private static void countVowels(String str) {
		// returns the sum of each vowels found in the given text
		int len = str.length();
		int c1 = 0 ,c2 = 0 , c3 = 0 , c4 = 0, c5 = 0 ;
		str = str.toLowerCase();
		for(int i = 0 ; i < len-1 ; i++)
		{
			char  ch = str.charAt(i);
			if(ch == 'a' )
			{
				c1++;
			}
			else if(ch == 'e')
			{
				c2++;
			}
			else if(ch == 'i')
			{
				c3++;
			}
			else if(ch == 'o')
			{
				c4++;
			}
			else if(ch == 'u')
			{
				c5++;
			}
			
		}
		System.out.println("Number of times 'a' present is " +c1);
		System.out.println("Number of times 'e' present is " +c2);
		System.out.println("Number of times 'i' present is " +c3);
		System.out.println("Number of times 'o' present is " +c4);
		System.out.println("Number of times 'u' present is " +c5);
		
	}
}
