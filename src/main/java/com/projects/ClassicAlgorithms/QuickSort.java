
/**
 * Implementation of Quick sort algorithm
 * @author sudha
 */
package com.projects.ClassicAlgorithms;

import java.util.Scanner;



	public class QuickSort
	{
	    public static void main(String args[])
	    {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number of elements to be sorted using QuickSort algorithm :");
	      int N = sc.nextInt();
	      int A[] = new int[N];
	      System.out.println("Enter the elements :");
	      for(int i = 0 ; i < N; i++)
	      {
	      A[i] = sc.nextInt();
	      }
	        int start = 0;
	        int end = 0;
	        end = A.length-1;
	        QuickSort qs=new QuickSort();
	        qs.Quick(A,start,end);
	        for(int i : A)
	        {
	        System.out.println(" "+i);
	        }
	        sc.close();
	    }
	    public void Quick(int []A, int start, int end)
	    {
	        if(start >= end)
	            return;
	        int pindex = 0;
	        pindex = Partition(A, start, end);
	        Quick(A, start, pindex-1);
	        Quick(A, pindex+1, end);
	    }
	    public int Partition(int A[], int start, int end)
	    {
	    	/*
	    	 * this function picks up the pivot element in the array and partitions the array based on pivot element
	    	 */
	     int pivot = A[end];
	     int pindex = start;
	     int temp = 0;
	     int temp1 = 0;
	     for (int i = start; i <= end-1; i++)
	     {
	        if(A[i] <= pivot)
	        {
	        temp = A[i];
	        A[i] = A[pindex];
	        A[pindex] = temp;
	        pindex++;
	        }
	     }
	     temp1 = A[pindex];
	     A[pindex] = A[end];
	     A[end] = temp1;
	     return pindex;
	    }

	
}
