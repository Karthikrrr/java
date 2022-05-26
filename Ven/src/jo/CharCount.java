package jo;
import java.util.*;

public class CharCount {

	public static void main(String[] args)
	{
		String str="hello";
		int count=1;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for (char c:str.toCharArray())
		{
			if(hm.containsKey(c))
			{	
				int x=hm.get(c);
			hm.put(c,x+1);
			
		}else {
			hm.put(c,count);
		}}
		System.out.print(hm);
	}
}
