package jo;

public class seprate
{
	public void check(String str)
	{
		char[] ch=str.toCharArray();
		int x=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
//				int y=Integer.parseInt(ch[i]);
				x=+ch[i];
			}
			
		}
		System.out.print(x);
	}
public static void main(String[] args)
{
String str="!23ads123sad";
seprate s=new seprate();
s.check(str);
}
}
