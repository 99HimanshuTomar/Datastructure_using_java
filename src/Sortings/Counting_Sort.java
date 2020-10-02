package Sortings;

import java.util.Arrays;

public class Counting_Sort {

	static void countingSort(int arr[],int n,int k)
	{
		int count[]=new int[k];
		for(int i=0;i<k;i++)
			count[i]=0;
		for (int i=0;i<n;i++) 
			count[arr[i]]++;
		int index=0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < count[i]; j++) {
				arr[index]=i;
				index++;
			}
		}		
	}
	
	 private static void print_sort(int arr[],int n)
		{
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	
	
	
	public static void main(String[] args) {
		int arr[]={5,7,20,10};
		int n=arr.length;
		int k=Arrays.stream(arr).max().getAsInt();
		System.out.print("Before sorting: ");
		print_sort(arr, n);
		countingSort(arr,n,k);
		System.out.print("After sorting: ");
		print_sort(arr, n);
		
		
		
		
	}

}
