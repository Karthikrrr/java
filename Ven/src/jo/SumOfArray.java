package jo;

public class SumOfArray {
	public static int check(int arr[],int sum)
	{
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int newsum=arr[i]+arr[j];
				if(newsum==sum)
				{
					String s= Integer.toString(sum);
					return sum;
				}
			}
			if(i==n-1)
			{
				int o=01;
				String r="not found";
				return o;
			}
	
		}
		return 0;

	}
	
	
	public static void main(String[] args)
	{
		int[] arr= new int[] {1,2,4,56,66,6,64236,123,62,1,123};
		int sum =64242;
//		SumOfArray  s=new SumOfArray();
		System.out.print(check(arr,sum));
	}

}
