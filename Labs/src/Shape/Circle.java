package Shape;
import java.util.*;

public class Circle {

	public double calCircle(double r){
//		System.out.println("enter base height");
//		Scanner scn=new Scanner(System.in);
//	double r=scn.nextDouble();
		
		double areaC=Math.PI *r;
		return areaC;
		
	}
	
	public static void main(String[] args)
	{
		Circle c=new Circle();
		System.out.println("enter base height");
		Scanner scn=new Scanner(System.in);
	double r=scn.nextDouble();
		c.calCircle(r);
	}
}
