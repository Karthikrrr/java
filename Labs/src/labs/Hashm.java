package labs;
import java.util.*;

public class Hashm 
{
	public int add(int x,int y)
	{
		return x+y;
	}
	// Java program illustrating use of HashMap methods -
	// put(), get(), isEmpty() and size()
	
		public static void main(String args[])
		{
			int x=10,y=10;
			Hashm h=new Hashm();
			h.add(x, y);
			System.out.print(h.add(x, y));
		}
	
}}
