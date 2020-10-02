package Strings_datastructure;

import java.util.Arrays;

public class Example4 {

	//Given a string, find lexicographic rank of it	
	static int lexographic(char[] str)
	{
		int rank=1;
		int n=str.length;
		int mul=fact(n);
		int count[]=new int[256];
		Arrays.fill(count, 0);
		for (int i = 0; i < n; i++) {
			count[str[i]]++;
		}
		for (int i = 1; i < 256; i++) {
			count[i]=count[i]+count[i-1];
		}
		for (int i = 0; i < n; i++) {
			mul=mul/(n-i);
			 rank=rank + count[str[i]- 1] * mul;
			for (int j = 0; j < count.length; j++) {
				count[j]--;
			}
		
		}
		return rank;
	}
	
	private static int fact(int n) {
		int x=1;
		for (int i = 1; i <= n; i++) {
			x=x*i;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str="BAC".toCharArray();
		int output=lexographic(str);
		System.out.println(output);
		

	}

}
