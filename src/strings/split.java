package strings;

public class split {
	public static void main(String args[])
    {
        String str = "bhari@sagar";
        String[] arrOfStr = str.split("@", 2);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }

}
