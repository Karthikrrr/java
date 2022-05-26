package jo;

public class StringCount
{
		public int check(String str)
		{
			//balloon
			int b=0,a=0,l=0,o=0,n=0;
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			switch(ch[i]) 
			{
			case 'b':
				++b;
				break;
			case 'a':
				++a;
				break;
				
			case 'l':
				++a;
				break;
			case 'o':
				++a;
				break;
			case 'n':
				++a;
				break;
			}
			
		}
		//balloon
//		int m=Math.min(b,a);
//		m=Math.min(l/2,o/n);
//		m=Math.min(m, n);
		int m=Math.min(Math.min(Math.min(b,a),n),Math.min(l/2,o/n));
		return m;
			
		}
		public static void main(String[] args)
		{
			String str="balloon";
			Balloon b=new Balloon();

		System.out.println(b.check(str));
		}



}
