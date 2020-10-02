package Strings_datastructure;

public class Example1 {

	//Given two strings, check if they are anagram of each other.It means whether the two string is same but order is different
	 static boolean anagram(char[] s1, char[] s2)
	{
		if(s1.length!=s2.length)
			return false;
		int count[]=new int[256];
		for (int i = 0; i < s1.length; i++) {
			count[s1[i]]++;
		}
		for (int i = 0; i < s2.length; i++) {
			count[s2[i]]--;
		}
		for (int i = 0; i < 256; i++) {
			if(count[i]!=0)
				return false;
		}
		
		return true;
		
	}
	 
	 public static void main(String[] args) {
		char[] s1="aabcd".toCharArray();
		char[] s2="abbcd".toCharArray();
		if(anagram(s1, s2))
			System.out.println("Yes");
		else
			System.out.println("NO");
		
	}
	
	
}
