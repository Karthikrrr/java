package Hy;


class che
{
public static int[] check(int arr[],int n)	
{
int[] newarr= {};
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;i++)
	{
		int p=arr[i]-arr[j];
		if(p==0)
		{
			newarr=new int[]{i,j};
		}
	}
			
}
return newarr;
}

}
public class Subby {
	int[] arr= new int[] {1,3,3,41423,412,13};
	int n=arr.length;
	che c=new che();
	System.out.print(c.check(arr,n));
}


}
