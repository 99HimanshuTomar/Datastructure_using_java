package Sortings;
import java.util.Arrays; 

class Radix_sort { 

	static void countSort(int arr[], int n, int exp) 
	{ 
		int output[] = new int[n]; // output array 
		
		int count[] = new int[10]; 
		Arrays.fill(count,0); 

		
		for (int i = 0; i < n; i++) 
			count[ (arr[i]/exp)%10 ]++; 

		for (int i = 1; i < 10; i++) 
			count[i] += count[i - 1]; 

		for (int i = n - 1; i >= 0; i--) 
		{ 
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
			count[ (arr[i]/exp)%10 ]--; 
		} 

		for (int i = 0; i < n; i++) 
			arr[i] = output[i]; 
	} 

	static void radixsort(int arr[], int n) 
	{ 
		int mx = arr[0]; 
		for (int i = 1; i < n; i++) 
			if (arr[i] > mx) 
				mx = arr[i]; 

		for (int exp = 1; mx/exp > 0; exp *= 10) 
			countSort(arr, n, exp); 
	} 

	static void print(int arr[], int n) 
	{ 
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 

	public static void main (String[] args) 
	{ 
		int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
		int n = arr.length; 
		radixsort(arr, n); 
		print(arr, n); 
	} 
} 

