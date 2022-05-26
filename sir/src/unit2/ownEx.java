package unit2;	

class myownEx extends Exception
{
	public myownEx()
	{
		System.out.println("nodko guru");
	}
}

public class ownEx {
	public static void main(String[] args)
	{
		ownEx  g=new ownEx();
	//	g.myownEx();
		try {
			throw new myownEx();
		}
		catch (myownEx exz)
		{
			System.out.println("caught");
		}
	}

}
