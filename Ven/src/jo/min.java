package jo;

public class min {

	public void check(int[] arr)
	{
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.print(max);
		System.out.print(min);
	}
	
public static void main(String[] args)
{
int[] arr=new int[] {1,21,55,12};
min s=new min();
s.check(arr);

}

}
