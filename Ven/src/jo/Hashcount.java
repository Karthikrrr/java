package jo;
import java.util.*;

public class Hashcount {
	// Q) You are given a string A. Your task is to print the total number of occurrences of each character

	// Example:	Input:  A = ”helixh”
//	 		Output: h=2
//	 			e=1
//	 			l=1
//	 			i=1
//	 			x=1


	public static void main(String[] args)
	{

	String A="Hhhelixh";
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	char[] ch=A.toCharArray();
	int count=1;
	for(int i=0;i<A.length();i++)
	{
	if(hm.containsKey(A.charAt(i)))
	{
	int x=hm.get(A.charAt(i));
	String c=Character.toString(A.charAt(i));
	hm.put(c,++x);
	}
	String ji=Character.toString(A.charAt(i));
	Integer intobject = new Integer(count);
	hm.put(ji,count);
	}
	System.out.print(hm);
	}
}

	// public class Main
	// {
//	 	public static void main(String[] args) {
		    
//	 		System.out.println("Hello World");
//	 	}
	// }

