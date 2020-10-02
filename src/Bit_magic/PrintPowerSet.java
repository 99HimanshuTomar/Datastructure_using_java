package Bit_magic;

public class PrintPowerSet {

	static void printpowerset(String str)
	{
		char[] str1=str.toCharArray();
		int n=str.length();
		int powsize=(int) Math.pow(2,n);
		for (int i = 0; i < powsize; i++) {
			for (int j = 0; j < n; j++) {
				if((i & (1 << j))!=0)
					System.out.println(str1[j]);					
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		printpowerset("abc");
	}
}
