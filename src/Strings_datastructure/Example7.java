package Strings_datastructure;

public class Example7 {
	//pattern searching algo
	
	//Naive solution
	static void patSearch1(char[] txt, char[] pat)
	{
		int n=txt.length, m=pat.length;
		for (int i = 0; i < n-m; i++) {
			for (int j = 0; j < m; j++) {
				if(txt[i+j] != pat[j])
					break;
			if(j == m)
				System.out.println(i);
			}
		}
	}
	//Naive solution in a efficient way
	static void patSearch2(char[] txt, char[] pat)
	{
		int n=txt.length, m=pat.length;
		for (int i = 0; i < n-m; ) {
			for (int j = 0; j < m; j++) {
				if(txt[i+j] != pat[j])
					break;
			if(j == m)
				System.out.println(i);
			
			if(j == 0)
				i++;
			else
				i=i+j;
		}
	}
	}
	
	public static void main(String[] args) {
		char[] s1="ABABAB".toCharArray();
		char[] s2="ABAB".toCharArray();
		
		patSearch2(s1, s2);
	}

}
