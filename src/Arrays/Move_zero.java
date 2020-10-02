package Arrays;

public class Move_zero {

	static void moveZero(int arr[])
	{		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
			{
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j]!=0)
					{
						//swap(arr[i],arr[j]);
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
	
	//efficient solution
	static void moveZero2(int arr[])
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
	
	
	static void printArray(int arr[]) { 
	    for (int i = 0; i < arr.length; i++) 
	    System.out.print(arr[i] + " "); 
	} 
	  
	
	public static void main(String args[]) { 
	    int arr[] = {0, 1, 9, 8, 4, 0, 0, 2,7, 0, 6, 0, 9}; 
	  
	    System.out.print("Original array: "); 
	    printArray(arr); 
	  
	    moveZero2(arr); 
	  
	    System.out.print("\nModified array: "); 
	    printArray(arr); 
	} 

	
}
