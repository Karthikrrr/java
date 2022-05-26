package practice;
import java.util.*;

public class complexity {
//	public static void main(String[] args)
//	{
////		int[] x= {1,3,5,6,7,9};
////		int search=7;
////		int start=0;
////		int end=x.length-1;
////		int mid=start+end/2;
////		binary(int[] x,int search,int end,int start,int mid);
////		public void binary(x,search,end,start,mid)
////		{
////			int start=0;	
////			int end=x.length-1;
////			mid=
//
//			int[] x= {1,3,5,6,7,9};
//			int search=7;
//			int start=0;
//			int end=x.length-1;
//			//int mid=start+end/2;
//	binary(x,search,start,end);
//	}
	
	public static void binary(int x[],int start,int end,int search)
	{
		int mid=start+end/2;
		while(end>start)
		{
			if(search ==  x[mid])
			{
				System.out.print(mid);
			}else
			{
				if (search<x[mid])
				{
					end=mid-1;
				}else //(search > x[mid])
				{
					start=mid+1;
				}
			}
		}
	}	
	
	public static void main(String[] args)
	{
//		int[] x= {1,3,5,6,7,9};
//		int search=7;
//		int start=0;
//		int end=x.length-1;
//		int mid=start+end/2;
//		binary(int[] x,int search,int end,int start,int mid);
//		public void binary(x,search,end,start,mid)
//		{
//			int start=0;	
//			int end=x.length-1;
//			mid=

			int[] x= {1,3,5,6,7,9};
			int search=7;
			int start=0;
			int end=x.length-1;
			//int mid=start+end/2;
	binary(x,search,start,end);
	}
	
	
}
