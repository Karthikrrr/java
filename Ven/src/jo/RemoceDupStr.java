package jo;
import java.util.*;

/*str="asdasdasdas"
 * 
 * 
 * 
 * */

public class RemoceDupStr {
	public  void remov(String str)
	{
//		
//		Stack<Character> st= new Stack<>();
//		int[] charFreq =new int[29];
//		boolean[] exist=new boolean[29];
//		
//		for (char ch:str.toCharArray())
//		{
//			charFreq[ch - 'a']++;
//		}
// 		String s=charFreq.toString();
//		System.out.print(s);
		  Stack<Character> st = new Stack<>();
	        int[] freq = new int[26];
	        boolean[] exist = new boolean[26];
	        
	        for(int i=0;i<str.length();i++)
	        {
	        	char ch=str.charAt(i);
	        	//System.out.println(ch);
	        	freq[ch -'a']++;
	        	System.out.println(ch);
	        }
	        
	        for(int i=0;i<str.length();i++)
	        {
	        	char ch=str.charAt(i);
	        	freq[ch- 'a']--;
	        	
	        }
	        
	        
	        
//	        for(char ch: str.toCharArray())
//	            freq[ch - 'a']++;
//	        
////	        String x=freq.toString();
////	        System.out.print(x);
//	        for (int z:freq)
//	        	System.out.print(z);
	              
	}
 	
	public static void main(String[] args)
	{
	String	str="asaasd";
	RemoceDupStr r=new RemoceDupStr();
	r.remov(str);
	}
}
