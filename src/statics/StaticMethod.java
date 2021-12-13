//2. Print instance variables in static methods

package statics;

public class StaticMethod {
	//instance variables
	  int c = 10;
	  int d = 30;

	  static void method1() {
	        System.out.println("Accessing d variable from static method1: "+new StaticMethod().d);
	        System.out.println();
	  }

	 public static void main(String args[]) {
	   
	  StaticMethod obj = new StaticMethod();
	 
	  System.out.println("Accessing c variable from static main method: "+obj.c);
	 
	  //calling static methods
	  method1();
	 }
}
