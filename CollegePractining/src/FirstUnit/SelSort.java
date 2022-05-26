package FirstUnit;

public class SelSort {
	public static void main(String args[])
	{
		int[] x= {9,1,2,0,7,5};
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
		int temp=0;
		int q=0;
		System.out.println();
		for(int i=q;i<x.length;i++)
		{
			for(int j=q+1;j<x.length;j++)
			{
		//	System.out.println("value oof i is"+i);
				if(x[i]>x[j])
				{
				temp=x[j];
				x[j]=x[i];
				x[i]=temp;
				
				}
			}
			q++;
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
	}

}


//9,1,2,0,7,5

//0,1,2,5,7,9
