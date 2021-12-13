package basic;

public class localandglobalvariables {
	class demo {
		// static variable  
		   static int a = 10;  
		    
		   // non-static or local variable  
		   int b = 20;  
		}  
		  
		public class Main {  
		   public static void main(String[] args) {  
		       demo obj = new demo();  
		  
		       // accessing the non-static variable  
		       System.out.println("Value of non-static variable is: " + (obj.b));  
		  
		       // accessing the static variable  
		       System.out.println("Value of static variable is:" + (demo.a));  
		   }  
		}
	   
	}


