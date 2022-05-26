package Hy;

import java.util.*;

import Shape.Circle;
//import Shape.Circle;
import Shape.Rect;
//import Shape.Rect.*;
import Shape.Triangle;
//import Shape.Triangle.*;
public class Main {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter choice "
				+ "1 rectangle    2.circle   3.triangle");
		int choice=scn.nextInt();
		if(choice==1)
		{
		Rect q=new Rect();
		System.out.println("enter lenght and breadth");
		double length=scn.nextDouble();
		double breadth=scn.nextDouble();
		System.out.print(q.calRect(length,breadth));
	
		}
		if(choice==2)
		{
			Circle c=new Circle();
			System.out.println("enter radius");
			double r=scn.nextDouble();
			System.out.println(c.calCircle(r));
		}
		if (choice==3){
		Triangle t=new Triangle();
		
		System.out.println("enter base and height");
		double base=scn.nextDouble();
		double height=scn.nextDouble();
		System.out.println(t.calTri(height,base));
		}
	}
}
