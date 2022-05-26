package jo;
import java.util.*;
public class Sumzero 
{
	public int check(int[] arr)
	{
		Set<Integer> h=new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 ||sum==0 || h.contains(sum))
			{
				return 0;
			}
			h.add(sum);
		}
		return 1;
	}
public static void main(String[] args)
{
int[] arr=new int[] {1000, 2, -3, 1, 6};
Sumzero s=new Sumzero();
System.out.print(s.check(arr));
}
}
