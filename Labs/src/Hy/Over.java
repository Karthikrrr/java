	package Hy;
//
//class hi{
//	public void ji()
//	{
//		System.out.print("hii");
//	}
//}
//class hello extends hi{
//	@Overide
//	public void ji()
//	{
//		System.out.print("hii");
//	}
//}
//
//public class Over {
//	public static void main(String[] args)
//	{
//	hello h=new hello();
//	h.ji();
//	hi j=new hi();
//	j.ji();
//	}
//
//}

// A Simple Java program to demonstrate
// method overriding in java

// Base Class
class Parent {
	void show()
	{
		System.out.println("Parent's show()");
	}
}

// Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	void show()
	{
		System.out.println("Child's show()");
	}
}

// Driver class
class Over{
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}

