package practice;
import java.util.*;
public class rmvdp 
{
	public static void main(String[] args) {
		int index=0;
		int[] arr=new int[]{1,1,2};
		for(int i=0;i<arr.length-1;i++)
		{
		    if(arr[i]!=arr[i+1])
		    {
		    	
		        arr[index]=arr[i];
		        System.out.println(arr[index]);
		        index++;
		        i++;
		    }
		}
		System.out.print(index+1);

//		System.out.print(Arrays.toString(arr));
	}
}
