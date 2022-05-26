package jo;
import java.util.*;

public class BInarySum {
	static String check(int[] arr)
	{
		int[] newarr=new int[] {};
		int n=arr.length;
//	for(int i=0;i<n;i++)
//	{
//		if(arr[i]==0)
//		{
//			arr[i]=-1;
//		}
//		
//	}
	int sum=0;
	int maxsize=0;
	int startindex=0;
	for(int i=0;i<n;i++)
	{

		if(arr[i]==0)
		{
			sum=-1;
		}else {
			sum=+1;
		}	
		
		for(int j=1;j<n;j++)
		{
			if(arr[j]==0)
			{
				sum=sum-1;
			}else {
				sum=sum+1;
			}
			
			if(sum==0 && maxsize<i-j+1)
			{
				maxsize=i-j+1;
				startindex=i;
			}
		}
	}
	int endindex=startindex-maxsize+1;
	String s=Integer.toString(maxsize);
	//String s=Arrays.toString(arr);
    System.out.println(startindex + " to " + endindex);
	return s;
	
	//return s;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {1,0,0,1,0,1,1,1};
		System.out.print(check(arr));
	}

}
