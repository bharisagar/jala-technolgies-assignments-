package ACCESSMODIFIERS;

public class A {
	 protected void msg(){System.out.println("Hello");}  
}  


class eight3 extends A{  
    public static void main(String args[]){  
     eight3 obj = new eight3();  
     obj.msg();  
    }  
}
