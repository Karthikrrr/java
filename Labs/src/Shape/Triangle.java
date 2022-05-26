package Shape;
import java.util.*;


public class Triangle {

	public double calTri(double base,double height)
	{
//		Scanner scn=new Scanner(System.in);
//		System.out.println("enter base and height");
//		double base=scn.nextDouble();
//		double height=scn.nextDouble();
//		
		double areaT=base*height;
	
		return areaT;
	}
	
	public static void main(String[] args)
	{
		Triangle t=new Triangle();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter base and height");
		double base=scn.nextDouble();
		double height=scn.nextDouble();
		t.calTri(base, height);
	}
	
}
