package Matrix;
import java.util.*;
public class Lis 
{
public static void main(String args[])
{
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(1142);
for (int i=0;i<arr.size();i++)
{
//System.out.print(arr.get(1));
//System.out.print(Collections.max(arr));
	if(arr.get(i)<arr.get(++i))
	{
		System.out.println(arr.get(i));
	}
}
System.out.print(arr.get(1));
}
}
