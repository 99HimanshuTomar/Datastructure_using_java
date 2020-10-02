package Bit_magic;

public class Count_set_bit {

	//naive solution
	static int countSet(int n) {
		int res=0;
		while(n>0)
		{
			if(n%2!=0)
				res++;
			n=n/2;
		}
		return res;
			
	}
	//other way
	static int countSet2(int n) {
		int res=0;
		while(n>0)
		{
			if((n&1)==1)
				res++;
			n=n>>1;
		}
		return res;
	}
	
	//brian kerningam's algo
	static int countSet3(int n) {
		int res=0;
		while(n>0)
		{
			n=(n&(n-1));
			res++;
		}
		return res;
			
	}
}
