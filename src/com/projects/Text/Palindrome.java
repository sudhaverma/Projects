package com.projects.Text;

import java.util.Scanner;

/**
 * Check if Palindrome - Checks if the string entered by the user is a palindrome. That is that it reads the same forwards as backwards like “racecar”
 * @author sudha
 *
 */
public class Palindrome {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		boolean result = findPalindrome(str);
		if(result)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

	private static boolean findPalindrome(String str) {
		// checks whether the given string is palindrome or not
		int len = str.length();
		int i = 0;
		while( i < len)
		{
			if(str.charAt(i) != str.charAt(len-1-i))
			{
			return false;
			}
			i++;
		}
		return true;
	}
}
