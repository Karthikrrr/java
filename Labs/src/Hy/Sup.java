package Hy;
//
//class one {
//    one()
//    {
//        System.out.println("Geeks");
//    }
//}
//class hello  extends one
//{
//public  void hello()
//{
//	super();
//	System.out.println("hello");
//}
//}
//
//
//public class Sup
//{
//
//	public static void main(String[] args)
//	{
//		hello h=new hello();
//		//h.boss();
//		//h.gi();
//	//h.pr();
//		System.out.println("main class");//h.pr();
//	}



/* superclass Person */
//class Person
//{
//	Person()
//	{
//		System.out.println("Person class Constructor");
//	}
//}
//
///* subclass Student extending the Person class */
//class Student extends Person
//{
//	Student()
//	{
//		// invoke or call parent class constructor
//		super();
//
//		System.out.println("Student class Constructor");
//	}
//}
//
///* Driver program to test*/
//class Sup
//{
//	public static void main(String[] args)
//	{
//		Student s = new Student();
//	}
//}


/* Base class Person */
class Person
{
	void message()
	{
		System.out.println("This is person class");
	}
}

/* Subclass Student */
class Student extends Person
{
	void message()
	{
		System.out.println("This is student class");
	}

	// Note that display() is only in Student class
	void display()
	{
		// will invoke or call current class message() method
		message();

		// will invoke or call parent class message() method
		super.message();
	}
}

/* Driver program to test */
class Sup
{
	public static void main(String args[])
	{
		Student s = new Student();

		// calling display() of Student
		s.display();
	}
}
