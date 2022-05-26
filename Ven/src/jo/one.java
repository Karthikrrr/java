package jo;

import java.util.Arrays;

public class one 
{

 static int[] check(int arr[],int n)	
{
int[] newarr= {};
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i==j)
		{
			break;
		}
		int p=arr[i]-arr[j];
		if(p==0)
		{
			newarr=new int[]{i,j};
		}
	}
			
}
return newarr;
}
public static void main(String args[])
{
	one k= new one();
	int[] arr= new int[] {1,3,3,4,412,13};
	int n=arr.length;
	int[] f=(k.check(arr,n));
	System.out.print(Arrays.toString(f));
}

}

