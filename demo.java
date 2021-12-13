package ACCESSMODIFIERS;

public class Demo {
	private int data=40;
	private void msg()
	{
	System.out.println("Hello java");}
	}

	public class Demo
	{
	public static void main(String args[])
	{
	 Demo obj=new Demo();
	 System.out.println(obj.data);//Compile Time Error
	 obj.msg();//Compile Time Error
	 } 
}
