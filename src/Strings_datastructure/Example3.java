package Strings_datastructure;

import java.util.Arrays;

public class Example3 {

	//Given a string, find the leftmost character that does not repeat
	
	static int firstnonrepeat(char[] str)
	{
		int res=Integer.MAX_VALUE;
		int fi[]=new int[256];
		Arrays.fill(fi, -1);
		for (int i = 0; i < str.length; i++) {
			if(fi[str[i]]== -1)
				fi[str[i]]=i;
			else
				fi[str[i]]= -2;
		}
		for (int i = 0; i < fi.length; i++) {
			if(fi[i]>=0)
				res=Math.min(res, fi[i]);
		}
		
		return res;
	}
	
	
	
	
	public static void main(String[] args) {
		char[] s1="harshitshakya".toCharArray();
		int index= firstnonrepeat(s1);
		System.out.println(index);
	}

}
