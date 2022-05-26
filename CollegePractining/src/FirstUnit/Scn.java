package FirstUnit;

public class Scn {
static  final	int xs=0;
	public static void main(String args[])
	{
		int x=0;
	System.out.println(xs);
		Scn f= new Scn();
		f.hi();
		f.hello();
	}
	public void hi()
	{
		xs=xs+123;
		System.out.println(xs);
	}
	public void hello()
	{
		
		System.out.println(xs);
	}
}
