package FirstUnit;

public class Thising {
	 
		int rollno;  
		String name;  
		float fee; 
		
		Thising(int rollno,String name,float fee)
		{  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		}  
		void display()
		{
			System.out.println(rollno+" "+name+" "+fee);}  
		}  
		  
		class TestThis2{  
		public static void main(String args[]){  
			Thising s1=new Thising(111,"ankit",5000f);  
		Thising s2=new Thising(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		}}  

