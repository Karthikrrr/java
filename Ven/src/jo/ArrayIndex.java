package jo;

import java.util.*;

public class ArrayIndex {
public static  void main(String[] args)
{
int[] arr=new int[]{1,2,3};
int i=0;
int[] arr1=new int[10];
while(i<10)
{
arr1[i]=i;
i++;
}

System.out.print(Arrays.toString(arr1));
if(10%2==0)
{
	System.out.print("ok")	;
}
int k=0;
int x=Math.max(arr[k],arr[k++]);
System.out.print(x);
}

}
