# What is Merge sort?

* Merge sort is a divide-and-conquer algorithm used for sorting an unordered list of elements. Complexity of merge sort is O(N log N) in worst and average case with O(N) auxiliary space complexity.

* In Merge sort we reduce a problem into sub-problems in a recursive or self similar manner. At any step, once we get the solution of sub-problem, we can construct the solution of the actual problem.
So, we reduce the sublist till we are left with one element in the sublist which is considered to be sorted. Then we start combining or merging the sublist to get sorted list.

## How does it work?

* It divides the array into half and recursively call mergesort on those halves till we are left with single element in the  subarray.
* Single elements present in the subarray is considered as sorted. Finally we merge these elements to get solution of the problem.


# Properties of Merge sort:
* It is a stable sorting algorithm i,e. It preserves the relative order of the input.
* It is not in place sorting algorithm - It requires extra space proportional to the input array for sorting.
* It's worst and average case complexity is O(NLogN).


##Applications of Merge sort :
* Merge sort is useful for sorting linked lists in O(NLogN) time where N is the nodes present in the Linked list. Other NlogN algorithms like Heap Sort, Quick Sort (average case O(NLogN)) cannot be applied to linked lists.
* Inversion Count Problem.
* Used in External sorting.

###Code is attached here :

```
package com.projects.RecursiveAlgorithms;

import java.util.Scanner;
/**
 * Implementation of Merge sort.
 * @author sudha
 *
 */

public class MergeSort {

    public static void mergeList(int[] left, int[] right, int[] Arr)
    {
        int nL = left.length;
        int nR = right.length;
        int i = 0,j = 0,k=0;
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
        for(int i = 0; i < num ; i++)
        {
        Arr[i] = sc.nextInt(); 
        }
        System.out.println("Elements before merge sort");
        for(int a: Arr)
        {
            System.out.println(a);
        }
        MergeSort.mergeSort(Arr);
        System.out.println("Elements after Merge sort ->");
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
        for(int i = 0; i < mid; i++)
        {
            left[i] = Arr[i];
        }
        for(int i = mid; i <= N-1; i++)
        {
            right[i-mid] = Arr[i];
        }   
        
        
        MergeSort.mergeSort(left);
        MergeSort.mergeSort(right);
        MergeSort.mergeList(left,right,Arr);
    }
    
}
```





