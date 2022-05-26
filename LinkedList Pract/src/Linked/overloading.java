package Linked;

public class overloading 
{
	
//	float add(float a, float b) {
//		float sum = a+b;		
//		return sum;
//	}
static	int add(int a, int b) {
		int sum = a*b;
		return sum;
	}
public static void main(String[ ]args)
{
overloading ov= new overloading();
float sum= overloading.add(20,30);
System.out.print(sum);
}
}
