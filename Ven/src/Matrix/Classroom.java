package Matrix;
import java.util.*;
public class Classroom
{
	//public int (int[][] interval)
//	{
//		int n=interval.length;
//		int[] start=new int[n];
//		int[] end=new int[n];
//		if(n==0|| interval==null)
//		{
//			return 0;
//		}
//		Arrays.sort(interval,(a,b)=>a.start-b);
	 public int check(int[][] intervals) {
        int len = intervals.length;
        int[] startTime = new int[len];
        int[] endTime = new int[len];
        int index = 0;
        for(int[] interval: intervals){
            startTime[index] = interval[0];
            endTime[index++] = interval[1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        int i = 0, j = 0;
        int activate = 0, max = 0;
        while(i < len && j < len){
            if(startTime[i] < endTime[j]){
                activate++;
                i++;
            }else{
                activate--;
                j++;
            }
            max = Math.max(max, activate);
        }
        return max;
    }
	
	public static void main(String[] args)
	{
	int[][] inteerval={{1,2},{4,5},{3,5}};
	Classroom c=new Classroom();
	System.out.print(c.check(inteerval))	;
	}

}
