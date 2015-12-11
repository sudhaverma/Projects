package com.projects.ClassicAlgorithms;

import java.util.Scanner;
/**
 * Sorting - Implement two types of sorting algorithms: Merge sort.
 * @author sudha
 *
 */

public class SortingAlgoMergeSort {

	public static void mergeList(int[] left, int[] right, int[] Arr)
	{
		int nL = left.length;
		int nR = right.length;
		int i = 0,j = 0,k = 0;
		while((i < nL) && (j < nR))
		{
			if(left[i] < right[j])
			{
				Arr[k] = left[i];
				i++;
				k++;
			}
			else 
			{
					Arr[k] = right[j];
					j++;
					k++;
				}
			}
		while(i < nL)
		{
			Arr[k] = left[i];
			i++;
			k++;
		}
		while(j < nR)
		{
			Arr[k] = right[j];
			j++;
			k++;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be sorted using Merge Sort Algorithm");
		int num = sc.nextInt();
		int[] Arr = new int[num];
		System.out.println("Enter the elements now :");
		for(int i = 0; i < num ;i++)
		{
        Arr[i] = sc.nextInt();	
		}
		System.out.println("Elements before merge sort");
		for(int a: Arr)
		{
			System.out.println(a);
		}
		SortingAlgoMergeSort.mergeSort(Arr);
		System.out.println("Elements after merge sort");
		for(int a: Arr)
		{
			System.out.println(a);
		}
		
	}
	
	public static void mergeSort(int[] Arr)
	{
		
		int N = Arr.length;
		int mid = N/2;
		if(N < 2)
		{
			return;
		}
		System.out.println(mid);
		int[] left = new int[mid];
	    int[] right = new int[N-mid];
		for(int i = 0;i < mid; i++)
		{
			left[i] = Arr[i];
		}
		for(int i = mid; i <= N - 1;i++)
		{
			right[i-mid] = Arr[i];
		}	
		
		
		SortingAlgoMergeSort.mergeSort(left);
		SortingAlgoMergeSort.mergeSort(right);
		SortingAlgoMergeSort.mergeList(left,right,Arr);
	}
	
}
