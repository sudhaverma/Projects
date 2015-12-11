package com.projects.Text;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed :");
		String str = sc.nextLine();
		String reversedString = reverse(str);
		System.out.println("After reversing string is->"+reversedString.toString());
		sc.close();
	}
	public static String reverse(String str) {
	char temp;
	char[] ch = str.toCharArray();
	for(int i = 0; i< ch.length/2; i++)
	{
		
		temp = ch[i];
		ch[i] = ch[ch.length-1-i];
		ch[ch.length-1-i] = temp;
	}
		
		return new String(ch);
		
	}
}
	

