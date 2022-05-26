package ONE;
import java.util.*;
public class Buff 
{
	public String check(String str)
	{
		StringBuffer s=new StringBuffer();
		char[] ch=str.toCharArray();
		
		Stack<Character> st=new Stack<Character>();
		st.push();
		for (int i=0;i<ch.length;i++)
		{
			
			if(st.peek()<ch[i])
			{
			System.out.print(st.peek());	
			}else {
			st.push(ch[i]);
			}
			s.append(ch[i]);
		}
		return s.toString();
	}
	public static void main(String[] args)
	{
		
		String str="hello";
		Buff b=new Buff();
		b.check(str);
		
	}

}
