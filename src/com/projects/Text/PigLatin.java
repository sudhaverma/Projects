package com.projects.Text;

import java.util.Scanner;

/**
 * Pig Latin - Pig Latin is a game of alterations played on the English language game. To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed 
 * (Ex.: "banana" would yield anana-bay). Read Wikipedia for more information on rules.
 * @author sudha
 *
 */
public class PigLatin {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the english word :");
		String str =sc.nextLine();
		convertToPigLatin(str);
	}

	private static void convertToPigLatin(String str) {
		// it converts the word to pig latin word
		int len = str.length();
		int place = -1;
		String result = null;
		for(int i = 0;i < len-1; i++)
		{
			char ch = str.charAt(i);
			if(( ch == 'a') || (ch =='e') || (ch =='i') || (ch =='o') || (ch =='u') || (ch == 'A')|| (ch == 'E') || (ch == 'I') ||(ch == 'O') || (ch == 'U'))
			{
			
				place = i;
				break;
			
			}
		}	
			if (place != -1) {
				String s = str.substring(place);
				String res = str.substring(0, place);
				 result = s+res+"ay";
				 System.out.println("Pig Latin for the given word is "+result);
			} else {
				System.out.println("No PigLatin for this word ");
			}
		
		
		
		
	}
}
