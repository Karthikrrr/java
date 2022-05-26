package Shape;
import java.util.*;
public class Rect {
	

		public double calRect(double length,double breadth){
//			Scanner scn=new Scanner(System.in);
//			System.out.println("eneteer length and breadth");
//		double length=scn.nextDouble();
//		double breadth=scn.nextDouble();
			double areaR=length * breadth;
			return areaR;
		}
		
		public static void main(String[] args)
		{
			Rect c=new Rect();
			Scanner scn=new Scanner(System.in);
			System.out.println("eneteer length and breadth");
		double length=scn.nextDouble();
		double breadth=scn.nextDouble();
		c.calRect(length,breadth);
		}
	}


