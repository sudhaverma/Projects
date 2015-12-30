package com.projects.Numbers;

import java.util.HashSet;
/**
 * Happy Numbers - A happy number is defined by the following process. Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers. Display an example of your output here. Find first 8 happy numbers.
 * @author sudha
 *
 */
public class HappyNumbers{
	
   public static boolean findHappy(long number){
       long sum = 0;
       int digit = 0;
       //using hashset to find cycles in the process of finding happy numbers
       HashSet<Long> cycle = new HashSet<Long>();
       while(number != 1 && cycle.add(number)){
           sum = 0;
           while(number > 0){
               digit = (int)(number % 10);
               sum += digit*digit;
               number /= 10;
           }
           number = sum;
       }
       return number == 1;
   }
 
   public static void main(String[] args){
	   System.out.println("First 8 happy numbers are ->");
       for(long number = 1, count = 0; count < 8; number++){
           if(findHappy(number)){
               System.out.println(number);
               count++;
           }
       }
   }
}
