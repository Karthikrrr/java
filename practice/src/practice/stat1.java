package practice;
import java.util.*;

	public class stat1{
		static String studentName="asdasd";
		static int studentAge;
		//constructor
		stat1(String nam, int age){
		this.Name = nam;
		this.age = ag;
		}
		
//		stat1(String name, int age,int c){
//			studentName = name;
//			studentAge = age;
//			}
//			
		
		void display(){
		System.out.println(studentName+ " "+studentAge);
		}
		public static void main(String args[])
		{
			System.out.println("enter ca");

		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
			stat1 myObj = new stat1("Asd" , x);
		myObj.display();
		stat1 myObj1 = new stat1("Asd" , x,x);
		myObj1.display();
		}
		

}
