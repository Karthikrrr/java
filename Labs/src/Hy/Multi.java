package Hy;

class one {
    public void pr()
    {
        System.out.println("Geeks");
    }
}
class hello  extends one
{
public  void boss()
{
	System.out.println("hello");
}
}


public class Multi
{

	public static void main(String[] args)
	{
		hello h=new hello();
		h.boss();
		//h.gi();
	h.pr();
		System.out.println("main class");h.pr();
	}
}
