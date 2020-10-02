package Sortings;

import java.util.Arrays;

class Merge_sort { 
 
	//o(m+n)*log(m+n)
	public static void merge_two_array(int a[],int b[],int m, int n)
	{
		int c[]=new int[m+n];
		for(int i=0;i<m;i++) {c[i]=a[i];}
		for(int j=0;j<m;j++) {c[j+m]=a[j];}
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}	
	}
	
	//optimal soluton
	//only o(m+n)
	public static void merge_two_array2(int a[],int b[],int m,int n)
	{
		int i=0,j=0;
		while(i<m && j<n)
		{
			if(a[i] < b[j]) System.out.println(a[i++]+" ");
			else System.out.println(b[j++]+ " ");
		}
		while(i<m) System.out.println(a[i++]+" ");
		while(j<n) System.out.println(b[j++]+" ");
	}
	
	//Merge function
	void merge(int arr[], int l, int m, int r) 
	{ 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int L[] = new int[n1]; 
		int R[] = new int[n2]; 

		for (int i = 0; i < n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j = 0; j < n2; ++j) 
			R[j] = arr[m + 1 + j]; 

		int i = 0, j = 0,k = l;  
		while (i < n1 && j < n2) { 
			if (L[i] <= R[j]) { 
				arr[k++] = L[i++];  
			} 
			else { 
				arr[k++] = R[j++];  
			}  
		} 

		while (i < n1) { 
			arr[k++] = L[i++]; 
		} 

		while (j < n2) { 
			arr[k++] = R[j++];  
		} 
	} 

	void mergeSort(int arr[], int l, int r) 
	{ 
		if (l < r) { 
			
			int m = (l + r) / 2; 
			mergeSort(arr, l, m); 
			mergeSort(arr, m + 1, r); 
			merge(arr, l, m, r); 
		} 
	} 

	static void print_sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		int arr[] = { 10,15,20,40,8,11,15,22,25 }; 

		System.out.print("Before sorting: "); 
		print_sort(arr); 

		Merge_sort ob = new Merge_sort(); 
		ob.mergeSort(arr, 0, arr.length - 1); 

		System.out.print("After sorting: "); 
		print_sort(arr);
		
		int a[]= {10,15,20,40};
		int b[]= {5,6,6,10,15};
		int m=a.length;
		int n=b.length;
		merge_two_array(a, b, m, n);
		
	} 
}
