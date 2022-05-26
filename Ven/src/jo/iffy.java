package jo;
import java.util.*;
public class iffy {
	public static void main (String args[])
	{
		int x=0;
		int c=(x==0) ? 100 :1248907;
			System.out.print(c);
			
		Integer[] arr={123464,3466,234};
		 int max = Collections.max(Arrays.asList(arr)); 
			System.out.println("max is"+max);
			// Initializing array of integers
	        Integer[] num = { 2, 4, 7, 5, 9 };
	 
	        // using Collections.min() to
	        // find minimum element
	        // using only 1 line.
	        int min = Collections.min(Arrays.asList(num));
	 
	        // using Collections.max()
	        // to find maximum element
	        // using only 1 line.
	        int msax = Collections.max(Arrays.asList(num));
	 
	        // printing minimum and maximum numbers
	        System.out.println("Minimum number of array is : "
	                           + min);
	        System.out.println("Maximum number of array is : "
	                           + msax);
	}

}
