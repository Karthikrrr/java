package jo;
import java.util.*;
public class Dif {
	public static void main(String[] args)
	{
	String	str1="ABCDEFG";
	String str2="ABDFFGH";
	char[] s1=str1.toCharArray();
	char[] s2=str2.toCharArray();
	ArrayList<Character> arr=new ArrayList<>();
	for(int i=0;i<str1.length();i++)
	{
	if(s1[i]==s2[i])
	{
		arr.add(s1[i]);
	}
	if(s1[i]!=s2[i])
	{
		char z='-';
		arr.add(z);
		arr.add(s1[i]);
	}else {
		
	}
	}
	}

}
