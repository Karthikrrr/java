
//import java.util.*;
//import java.lang.*;
package practice;
//import labs.tri;


public class binary 
{
public static void main(String args[])
{
	int[] x= {1,2,3,4,5,6};
	int start=0;
	int end=x.length-1;
	int mid=start+end/2;
	int search=3;
	while(start<end)
	{
		if(search==x[mid])
		{
			System.out.println("eleremnet found"+Integer.toString(mid));
		end=0;
		}else {
			if(search>x[mid])
			{
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
	}
}
}
