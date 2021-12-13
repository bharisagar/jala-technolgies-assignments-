package strings;

public class equal {
	public static void main(String[] args) {
	    String str1 = "sagar";
	    String str2 = "sagar";
	    String str3 = "sag";
	    //returns true
	    System.out.println("str1.equals(str2)-" + str1.equals(str2));
	    //returns false as case is different
	    System.out.println("str1.equals(str3)-" + str1.equals(str3));
	  }
}
