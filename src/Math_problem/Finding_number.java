package Math_problem;
//find h number of bits in number
public class Finding_number {

	//using iteration
	static int check(int data)
	{
		int count=0;
		while(data!=0) {
		if(data!=0) {
			count++;
		    data=data/10;
		}
		}
		return count;
	}
	//using recursive
	static int check2(int n)
	{
		if(n==0)
			return 0;
		return 1 + check2(n/10);
	}
	//using logarithmic
//	static int check3(int n)
//	{
//		return Math.floor(log10(n)+1);
//	}
	
	
	public static void main(String[] args) {
		int result=check2(123);
		System.out.println(result);
	}
}
