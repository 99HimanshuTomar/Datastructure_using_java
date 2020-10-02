package Binary_search;

public class Using_recursion {

	static int bSearch(int arr[], int low, int high, int x)
	{
		int mid=(low+high)/2;
		if(arr[mid]==x) return mid;
		else if(arr[mid] > x)
			return bSearch(arr,low,mid-1,x);
		else
			return bSearch(arr,mid+1,high,x);
	}
	
	public static void main(String[] args) {
		int arr[] ={10,20,30,40,50};
		
		int x=20;
		
		int result=bSearch(arr,0,5,x);
		if(result > 0)
			System.out.println(result);
		else
			System.out.println("Not found");
	}

}
