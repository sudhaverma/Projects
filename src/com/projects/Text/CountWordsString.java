package com.projects.Text;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Count Words in a String - Counts the number of individual words in a string. For added complexity read these strings in from a text file 
 * and generate a summary.
 * @author sudha
 *
 */
public class CountWordsString {

	public static void main(String args[])
	{
		System.out.println("Enter a string :");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		countWords(s);
	}

	private static void countWords(String s) {
		// counts the number of words in the given string
		int len = s.length();
		StringTokenizer str = new StringTokenizer(s, " ");
		int count = 0;
		while(str.hasMoreTokens())
		{
			count++;
			str.nextToken();
		}
		System.out.println("Number of words in given string is "+count);
	}
}
