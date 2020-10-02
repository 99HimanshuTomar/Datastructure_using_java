package Bit_magic;

public class Power_of_two {

	static boolean isPow(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}
	
	static boolean isPow2(int n)
	{
		if(n==0)
			return false;
		return ((n & (n-1))==0);
	}
	public static void main(String[] args) {
		System.out.println(isPow2(4));
	}
}
