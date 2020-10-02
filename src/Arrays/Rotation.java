package Arrays;

public class Rotation {

	static void leftrotate(int arr[], int d)
	{
		int n=arr.length;	
		for (int i = 0; i < d; i++) {
			int temp=arr[0];
			for (int j = 1; j < n; j++) {
				arr[j-1]=arr[j];	
			}
			arr[n-1]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//better solution
	//0(n+d)==>d is smaller so overall time complexity is 0(n)
	static void leftrotate2(int arr[],int d)
	{ 
		int n=arr.length; 
		int temp[]=new int[d];
		for (int i = 0; i < d; i++) 
			temp[i]=arr[i];
		for (int i = d; i < n; i++) 
			arr[i-d]=arr[i];
		for (int i = 0; i < d; i++) 
			arr[n-d+i]=temp[i];
			
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}			
	}
	
//	static void leftrotate3(int arr[], int d)
//	{
//		reverse(arr,0,d-1);
//		reverse(arr,d,n-1);
//		reverse(arr,0,n-1);
//	}
//	
//	private static void reverse(int[] arr, int low, int high) {
//		// TODO Auto-generated method stub
//		while(low < high)
//		{
//			Collection.swap(arr[low],arr[high]);
//			low++;
//			high--;
//		}
//		
//		
//	}
//	static int swap(int x, int y)
//	{
//		return x ;
//	}

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		int d=2;
		leftrotate2(arr,d);
	}
	
}
