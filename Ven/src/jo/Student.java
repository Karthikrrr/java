package jo;
import java.util.*;



public class Student {
	String name,address,phoneNumber,emailID,branch;
	Double tutionFee,AddmissionFee,Donatation;

	Student(String name,String address,String phoneNumber,String emailID,String branch)
	{
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.emailID=emailID;
		this.branch=branch;
		System.out.println("5 parameter constructer");
	}
	
	Student(String name,String address,String branch)
	{

		this.name=name;
		this.address=address;
		this.branch=branch;
		System.out.println("3 parameter constructer");

	}
	public  void fee(double tutionFee,double AddmissionFee,double Donatation)
	{
		this.tutionFee=tutionFee;
		this.AddmissionFee=AddmissionFee;
		this.Donatation=Donatation;
		double total =tutionFee+AddmissionFee+Donatation;
		System.out.println("total is"+total);
	}
	
	public static void display() {
		System.out.println("all good");
	}
	
public void display(String branch) {
		System.out.println("branch is"+branch);
	}
	

public void display(double tutionFee) {
	System.out.println("fee is"+tutionFee);
}

	
	public static void main(String[] args) {
	
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter number of students");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			
		System.out.println("enter name");
		
		String name=scn.nextLine();
		
		System.out.println("enrer address");
		String address=scn.nextLine();
		
		System.out.println("enter phone number");
		String phoneNumber=scn.nextLine();
		
		System.out.println("enter email id ");
		String emailID=scn.nextLine();
		
		System.out.println("enter branch");
		String branch=scn.nextLine();
		
		System.out.println("enter tution fee");
		Double tutionFee=scn.nextDouble();
		
		System.out.println("enter donation fee");
		Double Donatation=scn.nextDouble();

		
		System.out.println("enter Donation");
		Double AddmissionFee=scn.nextDouble();
		
		Student s=new Student(name,address,phoneNumber,emailID, branch)	;
		
    Student s1=new Student(name,address,branch)	;
    	
    s.fee(tutionFee,Donatation,AddmissionFee);
    s.display();
    s.display(branch);
    s.display(tutionFee);
    
    
		}
	}

}
