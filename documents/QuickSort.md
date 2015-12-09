# What is Quicksort?

It is a sorting algorithm also called partition-exchange sort which uses divide-and-conquer strategy. It's  best and average case complexity is O(NlogN). It's worst case complexity is O(N^2). 

## Properties of Quicksort: 
* It is not a stable sorting algorithm i.e, it does not preserve the input order of the keys.
* It is in-place sorting algorithm. It doesnt require any extra space for sorting unlike Merge sort.
* It is more useful to use quicksort for sorting an array with duplicates. 

## How does it work?
It is a 3 step process
* Step 1: Pick/select a pivot element from the array.
* Step 2 : Reaarange the array in such a way that elements greater than pivot element is present to its right and elements lesser than pivot element is present to its left. This process is called partitioning.
* Step 3: Recursively apply above procedure to smaller half of the subarray and to the larger half till the array gets sorted completley.

Implementation code is attached here : 

```
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
        int start=0;
        int end = 0;
        end = A.length-1;
        QuickSort qs = new QuickSort();
        qs.Quick(A,start,end);
        System.out.println("Sorted list :");
        for(int i : A)
        {
        System.out.println(" "+i);
        }
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
```