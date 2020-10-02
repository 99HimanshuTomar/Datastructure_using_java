package Strings_datastructure;

import java.util.Arrays;

public class Example2 {
	
	 //Given a string, Find the leftmost character that repeats.
	static int firstRepeating(char[] str)
	{
		int res=Integer.MAX_VALUE;
		int fi[]=new int[256];
		Arrays.fill(fi, -1);
		for (int i = 0; i < str.length; i++) {
			if(fi[str[i]] == -1)
				fi[str[i]]=i;
			else
				res=Math.min(res, fi[str[i]]);
		}
		return (res==Integer.MAX_VALUE)?-1:res;
	}
	
	public static void main(String[] args) {
		 char[] str = "harshitshakya".toCharArray(); 
	        int index = firstRepeating(str); 
	        if (index == -1) 
	        { 
	            System.out.printf("Either all characters are "
	                    + "distinct or string is empty"); 
	        }  
	        else
	        { 
	            System.out.printf("First Repeating character"
	                    + " is %c", str[index]); 
	            System.out.println(" ,and index is "+index);
	        } 
	}

}
