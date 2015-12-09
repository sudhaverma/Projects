package com.projects.numbers;

import java.util.Scanner;

/**
 * Credit Card Validator - Takes in a credit card number from a common credit card vendor (Visa, MasterCard, American Express, Discoverer) and validates it to make sure that it is a valid number (look into how credit cards use a checksum).
 * @author sudha
 *
 */
public class CreditCardValidator {

	
public static void main(String aargs[])
{
	System.out.println("Enter credit card number");
	Scanner sc=new Scanner(System.in);
	
	long num=sc.nextLong();
	String res=findCredit(num);
	System.out.println(res);
}

private static String findCredit(long num) {
	String s=String.valueOf(num);
	int len=String.valueOf(num).length();
	
	int rem=0;
	int tot=0;
	int prod=0;
	int sum1=0;
	for(int i=1;i<len;i=i+2)
	{
		prod=(2* Character.getNumericValue(s.charAt(i)));
		System.out.println("prod is"+prod);
		if(prod>=0 && prod<=9)
		{
			tot=tot+prod;
			
		}
		else
		{
			rem=prod%10;
			System.out.println("rem is"+rem);
			prod=prod/10;
			System.out.println("prod is"+prod);
			
			
			tot=prod+rem+tot;
		}
		System.out.println("sum is "+tot);
	}
	
	for(int i=0;i<s.length();i=i+2)
	{
		System.out.println("char "+s.charAt(i));
		System.out.println(sum1);
		
		sum1=sum1+Character.getNumericValue(s.charAt(i));
		
	}
	System.out.println("sum1 is"+sum1);
	int final_sum=sum1+tot;
	System.out.println("final is"+final_sum);
	if(final_sum%10==0)
	{
	return "valid";	
	}
	else
	{
	return "invalid";
	}
	
	}
	
	
	

}


