package Hy;
import java.util.*;
import java.lang.*;
/*
 * aapplle
 *
 * 
 * 
 * */
public class RemoveDup {
	 static String check(char str[])
	{
		 String f="";
		int n= str.length;
		int index=0;
		for(int i=0;i<n;i++)
		{
			int j;
			for( j=0;j<n;j++)
			{
				
				if(str[i]==str[j])
				{
				
					//System.out.println( "i = "+Character.toString(str[i]));
					//System.out.println( "j= "+Character.toString(str[j]));
					break;
				}
			}
		//	System.out.println(j);
			if(j==i)
			{
				
				str[index++]=str[i];
				//System.out.println("finally   :"+str[index]);
				
			}
			//System.out.println("for done");
			
			
		}
		//f=Character.toString(str,index);
		//System.out.println(str[1]);
			return 	String.valueOf(Arrays.copyOf(str,index));
	
	}
	
	public static void main(String[] args)
	{
	String	a="aapplle";
	
	char str[]= a.toCharArray();
	System.out.print(check(str));
	
	}
}
