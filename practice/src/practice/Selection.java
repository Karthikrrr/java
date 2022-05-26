package practice;

public class Selection {
	public static void main(String args[])
	{
		int arr[]= {56,123,54,4,1,23454,0};
		int n=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			System.out.println("i is "+min);
			for(int j=i;j<arr.length;j++)
			{
//				int min=j;
				if(arr[j]<arr[min])
				{
				min=j;
				System.out.println("j is "+min);

				}	
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			System.out.println("min is"+arr[i]);
			System.out.println("swap is "+arr[min]);
		}
		for (int e : arr)
		{
			System.out.println(e);
		}
	}
}
