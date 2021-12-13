package exceptions;

public class ThrowsExecp {
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		//throw new IllegalAccessException("demo");
	}
	public static void main(String args[])
	{
			fun();
			System.out.println("caught in main.");
	}
}
