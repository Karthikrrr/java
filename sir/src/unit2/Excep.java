package unit2;

public class Excep {
public static void main(String[] args)
{
	try {
		int[]	x= new int[] {1,12314,14,124,41,241,4};
		System.out.print(x[142]);
	}
	catch(Exception e){
		
		System.out.print(e);
	}
	
}}	

