package FirstUnit;


public class Staticing {
	static {
		System.out.println("asd");
		String x="Sad";
	}
	
	Staticing(){
		System.out.println(x);

		System.out.println("con");
	}
	public static void main(String[] args)
	{
		Staticing s= new Staticing();
		System.out.println(x);

	}


}
