package jo;
import java.util.*;
public class Charcounting
{
public static void main(String[] args)
{
String str="helllo";
HashMap<Character,Integer> hm=new HashMap<>();
for(char c:str.toCharArray())
{
	if(hm.containsKey(c))
	{
		int x=hm.get(c);
		hm.put(c,++x);
	}else {
		hm.put(c,1);
	}
//hm.put(c,hm.getOrDefault(c,0)+1);
}
System.out.print(hm);
}
}
