//package practice;
//	
//interface Vehicle {
//		
//		// all are the abstract methods.
//		void changeGear(int a);
//		void speedUp(int a);
//		void applyBrakes(int a);
//	}
//
//	class Bicycle implements Vehicle{
//		
//		int speed;
//		int gear;
//		
//		// to change gear
//		
//		public void changeGear(int newGear){
//			
//			gear = newGear;
//		}
//		
//		// to increase speed
//		
//		public void speedUp(int increment){
//			
//			speed = speed + increment;
//		}
//		
//		// to decrease speed
//		
//		public void applyBrakes(int decrement){
//			
//			speed = speed - decrement;
//		}
//		
//		public void printStates() {
//			System.out.println("speed: " + speed
//				+ " gear: " + gear);
//		}
//	}
//
//	class Bike implements Vehicle {
//		
//		int speed;
//		int gear;
//		
//		// to change gear
//		
//		public void changeGear(int newGear){
//			
//			gear = newGear;
//		}
//		
//		// to increase speed
//		
//		public void speedUp(int increment){
//			
//			speed = speed + increment;
//		}
//		
//		// to decrease speed
//		
//		public void applyBrakes(int decrement){
//			
//			speed = speed - decrement;
//		}
//		
//		public void printStates() {
//			System.out.println("spsdasdasdeed: " + speed
//				+ " gear: " + gear);
//		}
//		
//	}
//	class InterFace {
//		
//		public static void main (String[] args) {
//		
//			// creating an inatance of Bicycle
//			// doing some operations
//			Bicycle bicycle = new Bicycle();
//			bicycle.changeGear(2);
//			bicycle.speedUp(3);
//			bicycle.applyBrakes(1);
//			
//			System.out.println("Bicycle present state :");
//			bicycle.printStates();
//			
//			// creating instance of the bike.
//			Bike bike = new Bike();
//			bike.changeGear(121);
//			bike.speedUp(4);
//			bike.applyBrakes(3);
//			
//			System.out.println("Bike present state :");
//			bike.printStates();
//		}
//	
//
//
//}

// An example to show that interfaces can
// have methods from JDK 1.8 onwards


// A class that implements the interface.
class InterFace implements In1


{
	
	interface In1
	{
		final int a = 10;
		static void display()
		{
			System.out.println("hello");
		}
	}
	// Driver Code
	public static void main (String[] args)
	{
		In1.display();
	}
}

