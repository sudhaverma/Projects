package com.projects.ClassicAlgorithms;

import java.util.Scanner;

public class SortingAlgoBubbleSort {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements to be sorted using Bubble sort algorithm");
		int num = sc.nextInt();
		int A[] = new int[num];
		System.out.println("Enter the elements :");
		for(int i = 0; i < num; i++)
		{
			A[i] =sc.nextInt();
		}
		sort(A);
		System.out.println("Sorted elements using Bubble sort");
		for(int ele :A)
		{
			System.out.println(ele);
		}
	}

	private static void sort(int[] A) {
		// bubble sort algorithm
		int len = A.length;
		for(int k = 1;k< len-1; k++)
		{
			int flag =0;
			for(int j =0 ;j <len-2 ;j++)
			{
				if(A[j] > A[j+1])
				{
					swap(A,j,j+1);
					flag =1;
				}
			}
			if(flag ==0)
				break;
		}
		
	}

	private static void swap(int[]A,int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		
	}
}
