package strings;

public class matchingstring {
	 public static void main(String args[]) {
	      String Str = new String("one day all will get sucess");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)sucess(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("get"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("alll(.*)"));
	   }
	}


