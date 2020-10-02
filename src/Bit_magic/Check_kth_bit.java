package Bit_magic;

public class Check_kth_bit {

	//Check if kth bit is set
	//using left shift
    static void kthbit(int n,int k)
	{
		if((n&(1 << (k-1))) !=0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
    static void kthbit2(int n,int k)
    {
    	if((n>>(k-1)&1)==1)
    		System.out.println("Yes");
    	else
    		System.out.println("No");
    }
    
    public static void main(String[] args) {
		kthbit(5,3);
	}
	
}
