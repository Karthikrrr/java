package jo;

import java.util.HashSet;
import java.util.*;

public class Rmdup {

	public static char[] check(char str1[],int n)
	{
		HashSet<Character> h= new HashSet<>(n-1);
			
		for(char x:str1)
		{
			h.add(x);
		}
		
		char[] st= new char[h.size()];
		int i=0;
		for(char q: h )
		{
			st[i++]=q;
			System.out.print(q);
		}
		
		return st;
	}
	public static void main(String[] args)
	{
		String str= "aapple";
		char[] str1=str.toCharArray();
		int n=str.length();
		Rmdup r= new Rmdup();
		r.check(str1,n);
	}
	
}
