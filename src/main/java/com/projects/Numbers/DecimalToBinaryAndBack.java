package com.projects.Numbers;

import java.util.Scanner;

/*
 * Binary to Decimal and Back Converter - Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent.
 */
public class DecimalToBinaryAndBack {
	
	public static void main(String args[])
	{
		System.out.println("Enter the number for Binary to Decimal conversion ->");
		Scanner sc = new Scanner(System.in);
		int Binarynumber = sc.nextInt();
		int result = ConvertToDecimal(Binarynumber);
		System.out.println("Number in Decimal form is -> "+ result);
		System.out.println("Enter the number for Decimal to Binary conversion ->");
		int Decimalnumber = sc.nextInt();
		sc.close();
		StringBuffer Binresult = ConvertToBinary(Decimalnumber);
		System.out.println("Number in Binary form is -> "+ Binresult);
	}

	private static int ConvertToDecimal(int binarynumber) {
		// Conversion of a Binary representation of a number to Decimal form
		int rem = 0;
		int i = 0;
		int sumTotal = 0;
		while(binarynumber > 0)
		{
			rem = binarynumber % 10;
			sumTotal  = (int) (Math.pow(2, i) * rem + sumTotal);
			binarynumber = binarynumber / 10;
			i++;
		}
		return sumTotal;
	}

	private static StringBuffer ConvertToBinary(int number) {
		// Conversion of a Decimal number to its Binary representation
		StringBuffer al = new StringBuffer();
		int rem = 0;
		while(number > 0)
		{
			rem = number % 2;
			al.append(rem);
			number = number/2;
		}
		al.reverse();
		
		return al;
	}

}
