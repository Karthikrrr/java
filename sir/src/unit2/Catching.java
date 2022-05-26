package unit2;

public class Catching 
{
public static void main(String[] args)
{
//try {
//	int x=0;
//	System.out.print("ASD");
//	int y=0;
//	System.out.print("asda");
//}
//catch (Exception e){
//	e.printStackTrace();
//	}
	try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[2]);
	      try {
	      System.out.println(myNumbers[4]);
	      }
	      catch (Exception e){
	    	  e.printStackTrace();
	    	  System.out.println("Aall ok");
	      }
//	      System.out.println(myNumbers[2]); System.out.println(myNumbers[2]);
//	      System.out.println(myNumbers[2]); System.out.println(myNumbers[2]); System.out.println(myNumbers[2]);
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");
	    }
//	  System.out.println("myNumbers[10]");
	  finally
	  {
		  System.out.println("ok biss");
	  }
	
}	
	
}
