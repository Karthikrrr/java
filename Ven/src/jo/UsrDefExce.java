package jo;

//
//class Ex extends Exception{
// Ex(String string)
// {
//	 System.out.print("ASD "+string);
// }
//	
//}
//
//
//public class UsrDefExce {
//	public static void main(String[] args)
//	{
//		try {
//			
//		}catch (Ex z)
//		{
//			z.printStackTrace();
//		}
//	}
//}
//
//
class MyException extends Exception{
	MyException(String string){
		System.out.println("you got an exception "+string);
	}
}

public class UsrDefExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("error");
		}catch(MyException me) {
			System.out.print("ASD"+"ASD");
			me.printStackTrace();
		}
	}
}
