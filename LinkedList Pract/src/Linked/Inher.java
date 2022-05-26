package Linked;

//public class Vehi
//{
//	
//}
//
//public class Inher extends vehi{
//
//}

/* Base class vehicle */
class Vehicle
{
	int maxSpeed = 120;
}

/* sub class Car extending vehicle */
class Car extends Vehicle
{
	int maxSpeed = 180;

	void display()
	{
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " + maxSpeed);
	}
}

/* Driver program to test */
class Inher
{
	public static void main(String[] args)
	{
		Vehicle small = new Vehicle();
	System.out.print(small.maxSpeed);
	Car c= new Car();
	c.display();
//		small.display();
	}
}
