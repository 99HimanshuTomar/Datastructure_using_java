package Sortings;

public class Insertion_sort {

	//it will take o(n^2) in worst case
	public static void insertionSort(int arr[],int n)
	{
        for (int i = 1; i < n; ++i) { 
             int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
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
		System.out.print("Before sorting: ");
		print_sort(arr, n);
		insertionSort(arr,n);
		System.out.print("After sorting: ");
		print_sort(arr, n);
	}

}
