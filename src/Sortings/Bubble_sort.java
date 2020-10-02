package Sortings;

public class Bubble_sort {
	boolean swapped;
	public static void bubbleSort(int arr[], int n) {
		
		for (int i=0;i<n-1;i++) {
			boolean swapped=false;
			for(int j=0;j<n-i-1;j++)
				if(arr[j] > arr[j+1]) {
					//swap(arr[j],arr[j+1]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}	
			if(swapped==false)
				break;
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
		bubbleSort(arr,n);
		System.out.print("After sorting: ");
		print_sort(arr, n);
		
	}

}
