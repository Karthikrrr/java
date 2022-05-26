package jo;

public class Balloon {
	public int check(String str)
	{
		int[] char_count=new int[26];
		for(int i=0;i<str.length();i++)
		{
			System.out.println("now :"+ str.charAt(i));
			char_count[str.charAt(i)-'a']++;
			System.out.println(" char ar "+char_count[i]);
		}
//		for(int i=0;i<str.length();i++)
//		{
//		System.out.println(char_count[i]);
//		}
//		
		int min=char_count[1];//b
		min=Math.min(min,char_count[0]);//a
		min=Math.min(min,char_count[11]/2);//l is 2
		min=Math.min(min,char_count[14]/2);//o
		min=Math.min(min,char_count[13]);//n
		return min;
		
		}
	public static void main(String[] args)
	{
		String str="balloon";
		Balloon b=new Balloon();
		
	System.out.println(b.check(str));
	}

}
