package ADT;

public class REv {
	 public boolean isPalindrome(int x) 
	    {
	    String s=Integer.toString(x);
	        char[] c=s.toCharArray();
	        StringBuilder sb=new StringBuilder();
	       int l=s.length();
	        for(int i=l-1;i>=0;i--)
	        {
	            sb.append(c[i]);
	        }
	        String z=sb.toString();
	        int v=Integer.parseInt(z);
	        System.out.print(x);
	        System.out.print(v);
	      
	        if(v==x)
	        {
	            return true;
	        }else{
	            return false;
	        }
	    }
	
	public static void main(String[] args)
	{
		int x=123;
		REv r=new REv();
		System.out.print(r.isPalindrome(x));
	}
  

}
