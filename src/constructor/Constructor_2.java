package constructor;

public class Constructor_2 {
	 String name;
	    int age;
	    Constructor_2()
	    {
	        System.out.println("Constructor Called");
	    }
	    Constructor_2(String name)
	    {
	        this.name=name;
	    } 
	    Constructor_2(String name, int age)
	    {
	        this.name=name;
	        this.age=age;
	    }
	}
	 class Child extends Constructor_2
	 {
	    public static void main(String[] args){
	        Constructor_2 x=new Constructor_2();
	        Constructor_2 y=new Constructor_2("Deepak");
	        Constructor_2 z=new Constructor_2("Deepak",22);
	        System.out.println("Name:"+x.name+" Age:"+x.age);
	        System.out.println("Name:"+y.name+" Age:"+y.age);
	        System.out.println("Name:"+z.name+" Age:"+z.age);


	    }
	    
}
