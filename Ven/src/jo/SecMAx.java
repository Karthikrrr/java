package jo;

public class SecMAx 
{
	public void check(int[] arr)
	{
		int n=arr.length;
		int max=0;
		int sec=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				sec=max;
				max=arr[i];
			}else if(arr[i]>sec && arr[i] < max)
			{
				sec=arr[i];
				
			}
		}
		System.out.print(sec);
	}
	
public static void main(String[] args)
{
int[] arr=new int[] {1,21,55,12};
SecMAx s=new SecMAx();
s.check(arr);
int x=10123;
Math.max(x,1);
}
}
