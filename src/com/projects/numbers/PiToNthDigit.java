package com.projects.numbers;



import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places. Keep a limit to how far the program will go.
 * @author sudha
 *
 */

public class PiToNthDigit {

	final static BigDecimal PI = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		boolean isDigit = true;
		int digit = 0;
		System.out.print("");

		while (isDigit) {

			
			try {
				System.out.println("Please enter number between 1 and 20 :");
				digit = sc.nextInt();
				isDigit = false;
			} catch (Exception e) {
				System.out.println();
				System.out.println("Digit must be an integer :");
				sc = new Scanner(System.in);
			}

			
			if (digit < 1 || digit > 20 && isDigit == false) {
				isDigit = true;
	            System.out.println("You must enter a number between 1 and 20: ");
				sc = new Scanner(System.in);
				
			}
			
			
		}
		sc.close();
		String format = "#.";

		for (int i = 1; i <= digit; i++) {
			format = format + "0";
		}

		DecimalFormat formatter = new DecimalFormat(format);

		System.out.println("PI to " + digit + " digit places is: " + formatter.format(PI));
	}

}