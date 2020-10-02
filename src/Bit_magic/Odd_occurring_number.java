package Bit_magic;

public class Odd_occurring_number {

	//Find odd occurring element number in the list
	
	static void check(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])
					count++;		
			}
			if(count%2!=0)
				System.out.println(arr[i]);
		}
	}
	
	//efficient way it will take only o(n)
	static int check2(int arr[],int n)
	{
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			res=res ^ arr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]=new int[]{3,4,3,4,5,4,4,6,7,7};
		check(arr);
	}
}
