package Hy;

class one
{
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


class bye extends hello
{
void ji()
{
System.out.println("bye");	
}
}

public class King
{

	public static void main(String[] args)
	{
		bye h=new bye();
		h.boss();
		//h.gi();
	h.pr();
	h.ji();
		System.out.println("main class");h.pr();
	}
}
