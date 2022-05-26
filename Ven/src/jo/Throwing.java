package jo;
import java.io.*;  

//public class Throwing {
//public static void main(String[] args)
//{
//	
//}
//	
//}

class M{  
 void method() {  
  System.out.print("device error");  
 }  
}  
public class Throwing{  
   public static void main(String args[]){  
    try{  
     M m=new ();  
     m.method();  
    }finally{System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
}  