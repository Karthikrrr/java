package jo;
import java.util.*;
public class Split
{
public static void main(String[] args)
{
int x=21231;
ArrayList<Integer> arr=new ArrayList<Integer>();
int c=0;
while(x>0)
{
arr.add(x%10);
System.out.print(x%10);
x=x/10;
}
System.out.print(arr);
int n=arr.size();
for(int i=0;i<arr.size();i++)
{
if(arr.get(i)<arr.get(n))
{
	Integer temp=0,temps=0;
	temp=arr.get(i);
	temps=arr.get(n);
	arr.set(n, temp);
	arr.set(i,temps );
	i++;
	n--;
	
}
}
System.out.print(arr);
}
}
