package jo;
import java.util.*;

public class SumOfArrayOn {
public static String check(int arr[],int sum)
{
	int n=arr.length;
	int  start=0,end=-1,CurSum=0;
	HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<n;i++)
	{
		CurSum=CurSum+arr[i];
		System.out.println(CurSum);
		if(CurSum -sum == 0)
		{
			start=0;
			end=0;
			break;
		}
		
	//if(map.containsKey(CurSum-sum))
		if(CurSum-sum >0)
		{
		System.out.println(CurSum-sum);
			start=map.get(CurSum-sum)+1;
			end=i;
			
			System.out.println("start is "+start);
			System.out.println("end is "+end);

			System.out.println("sum is "+sum);
			break;
		}
		
		map.put(CurSum,i);
		String z=map.toString();
		System.out.print(z);
		
	}
	String s=map.toString();
	return s;
			

}
	
	public static void main(String[] args)
{
int[] arr= new int[] {123,14,34,14,4,154,512,53324,134,14,134};
int sum =158;
System.out.print(check(arr,sum));
}
}
