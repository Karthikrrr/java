package labs;
import java.util.*;
public class firspro {
	void student_details(String name,String address,int usn,String emailId,String branch)
	{
		System.out.println("name is "+name);
		System.out.println("addresss is "+address);
		System.out.println("usn "+usn);
		System.out.println("emial is"+emailId);
		System.out.println("branch is"+branch);
		
		
	}
	void calcul(String branch,double praFee,double tFee,double intFee,double adFee)
	{
	String mca="mca";
	String be="be";
	int flag=0;
	double finalFee=0;
		if(branch==mca)
		{
		 flag=1;
		}else if(branch==be)
		{
			flag=2;
		}else {
			flag=3;
		}
		if(flag==1)
		{	
			adFee=adFee*2;
		finalFee = praFee+tFee+intFee+adFee;
		System.out.println("final fee is"+finalFee);
		}
		
		if(flag==2)
		{	
			adFee=adFee*5;
		finalFee = praFee+tFee+intFee+adFee;
		System.out.println("final fee is"+finalFee);
		}
		if(flag==3)
		{	
			adFee=adFee*10;
		finalFee = praFee+tFee+intFee+adFee;
		System.out.println("final fee is"+finalFee);
		}	
	
	}
	
	public static  void main(String[] args)
	{	
		Scanner scn=new Scanner(System.in);

		System.out.println("enter total students");
		int numberOfStudents=scn.nextInt();
		for(int i=0;i<numberOfStudents;i++)
		{
		System.out.println("enter name");
		String name=scn.nextLine();
		System.out.println("enter address");
		String address=scn.nextLine();
//		System.out.println("enter usn");
//		int usn=scn.nextInt();
		System.out.println("enter emailID");
		String emailId=scn.nextLine();
		System.out.println("enter branch");
		String branch=scn.nextLine();
		System.out.println("enter usn");
		int usn=scn.nextInt();

		System.out.println("enter tution fee");
		double tFee=scn.nextDouble();
		System.out.println("enter addmission fee");
		double adFee=scn.nextDouble();
		System.out.println("enter internet fee");
		double intFee=scn.nextDouble();
		System.out.println("enter parking fee");
		double parFee=scn.nextDouble();
		firspro stu=new firspro();
		stu.student_details(name,address,usn,emailId,branch);
//		
//		System.out.println("enter tution fee");
//		double tFee=scn.nextDouble();
//		System.out.println("enter addmission fee");
//		double adFee=scn.nextDouble();
//		System.out.println("enter internet fee");
//		double intFee=scn.nextDouble();
//		System.out.println("enter parking fee");
//		double parFee=scn.nextDouble();
//		firspro fe=new firspro();
		stu.calcul(branch,tFee,adFee,intFee,parFee);
		}
	}
}
