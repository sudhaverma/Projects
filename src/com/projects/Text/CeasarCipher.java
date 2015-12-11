package com.projects.Text;

/**
 * Vigenere / Vernam / Ceasar Ciphers - Functions for encrypting and decrypting data messages. Then send them to a friend.
 * @author sudha
 */

import java.util.Scanner;

public class CeasarCipher {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be encrypted");
		String plainText = sc.nextLine();
		System.out.println("Enter the offset value for encryption");
		int offset = sc.nextInt();
		String encryptedString = encryptString(plainText,offset);
		System.out.println("After encryption ->"+ encryptedString);
		String decryptedString = decryptString(encryptedString , offset);
		System.out.println("Decrypted String is "+decryptedString);
	}

	private static String decryptString(String encryptedString, int offset) {
		// decrypts the given encrytedString to plaintext
		
		
		return encryptString(encryptedString, 26-offset);
	}

	private static String encryptString(String encryptedString2 , int offset) {
		// encrypts the string using offset provided by the user 
		 offset = offset % 26 + 26;
		String encryptedString = "";
		int len = encryptedString2.length();
		for(int i = 0 ;i < len ; i++)
		{
			char ch = encryptedString2.charAt(i);
			if(Character.isUpperCase(ch))
			{
				encryptedString += ((char)('A'+ (ch - 'A' + offset)% 26));
			}
			else if (Character.isLowerCase(ch))
			{
				encryptedString += ((char)('a' + (ch - 'a' + offset)% 26));
			}
					
		}
		return encryptedString;
		
	}
	
}
