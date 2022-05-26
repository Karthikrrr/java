package unit2;

public class Thrw {

	public void check()
	{
		try {
	int x=1;
	if(x<30)
	{
		throw new ArithmeticException("error");
	}
	else
	{
		System.out.print("asdasd");
	}
	}
		catch (Exception e)
		{
			System.out.print("exception");
		}
	}
	
	public static void main(String[] args)
	{
//		try throws ArrayIndexOutOfBoundsException
//		{
//			int[] arr=new int[10];
//			System.out.print(arr[14]);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.print("Asd");
//		}
		Thrw t=new Thrw();
		t.check();
				
	}
}
