package jo;
import java.util.*;
public class Textop
{  
	    public static void main(String[] args) 
	    {  
	          
	        String str1="Great Power";  
	      //  StringBuffer newStr=new StringBuffer(str1);  
	         Stack<Character> st=new Stack<Character>();
	         Queue<Character> q=new LinkedList<>();
	         int index=0;
	         char[] newStr=str1.toCharArray();
	         char[] ch=new char[10];
	        for(int i = 0; i < str1.length(); i++) 
	        {    
	            if(Character.isLowerCase(str1.charAt(i)))
	            {  
	            char k=Character.toUpperCase(str1.charAt(i));
	              newStr[i]=k;
	              st.push(newStr[i]);
	              q.add(newStr[i]);
	            }  
	            
	            else if(Character.isUpperCase(str1.charAt(i))) 
	            { 
	            	 char k=Character.toLowerCase(str1.charAt(i));
		              newStr[i]=k;
		              st.push(newStr[i]);
		              q.add(newStr[i]);
	            
	            }
	        }
	        for(int j=0;j<str1.length();j++)
	        {
	        System.out.print(newStr[j]);  
	        }
	        
	    
	    }  
	  
}
