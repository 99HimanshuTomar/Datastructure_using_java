package Binary_search;

public class Using_iteration {

	static int bSearch(int arr[], int n, int x)
	{
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low + high)/2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] > x)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] ={10,20,30,40,50};
		int n=arr.length;
		int x=20;
		int result=bSearch(arr,n,x);
		if(result > 0)
			System.out.println("Result found at location "+result);
		else
			System.out.println("Not found");
		
	}

}
