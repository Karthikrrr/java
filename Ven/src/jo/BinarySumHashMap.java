package jo;
import java.util.*;

public class BinarySumHashMap {
	static int check(int arr[])
	{int sum=0;
	int maxlength=0;
	int endindex=-1;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]= (arr[i]==0) ? -1:1;
		}
		//1,-1,1,1,1,1-1,-1
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum ==0)
			{
				System.out.println();
				maxlength=i+1;
				endindex=i;
				System.out.println("max is"+maxlength);

			}
			if(h.containsKey(sum))
			{
				System.out.println(i);
				if(maxlength<i-h.get(sum))
				{
					System.out.println("i is "+i);

					System.out.println(i);
					maxlength=i-h.get(sum);
					endindex=i;
				}
			}else {
			//System.out.print(arr[i]);
			h.put(sum,i);
			System.out.println(h);
			}
			}
		return maxlength;
		
		
		
	}
	public static void main(String args[])
	{
		int arr[]= {1,0,1,1,1,1,0,0};
	System.out.print(check(arr));
	}

}
