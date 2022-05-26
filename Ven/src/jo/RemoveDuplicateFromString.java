package jo;

import java.util.HashSet;

public class RemoveDuplicateFromString {
	public static String check(char str1[],int n)
	{
		HashSet<Character> h= new HashSet<>(n-1);
			
		for(char x:str1)
		{
			h.add(x);
		}
		
//		char[] st= new char[h.size()];
//		int i=0;
//		for(char q: h )
//		{
//			st[i++]=q;
//			System.out.print(q);
//		}
//		
		String st=h.toString();
		return st;
	}
	public static void main(String[] args)
	{
		String str= "adsaddfa";
		char[] str1=str.toCharArray();
		int n=str.length();
		Rmdup r= new Rmdup();
		r.check(str1,n);
	}
	

}
