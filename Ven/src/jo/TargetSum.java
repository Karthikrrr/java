package jo;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {
	
		
	public void Cal(int arr[],int finalSum)
	{
		int len=arr.length;
		HashMap<Integer,Integer> hash=new HashMap<>(arr.length);
		int sum=0;
		for(int  i=0;i<len;i++)
		{
			 sum=sum+arr[i];
			if(hash.containsKey(sum))
			{
				System.out.print("found");
			}else {
				hash.put(arr[i],i);
			}
			
		}
		System.out.print("not found");
	}
	public static void main(String[] args)
	{
	int[] arr = new int[] {1,23,4,5,5,67,8,8,9};
	int finalSum=27;
	TargetSum s=new TargetSum();
	s.Cal(arr,finalSum);
//	String x;
//	int p[]=new int[10];
//	p=s.Cal(arr, finalSum);
//	x=Arrays.toString(p);
//	System.out.println(x);
	}
}

