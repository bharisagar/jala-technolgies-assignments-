package constructor;

public class Constructor_3 {
	String name,second_name;
    int age;
    Constructor_3()
    {
        System.out.println("Default Access Modifier");
    }
   public Constructor_3(String name)
    {
        this.name=name;
    } 
    private Constructor_3(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    protected Constructor_3(String name,int age,String second_name)
    {
        this.name=name;
        this.age=age;
        this.second_name=second_name;
    }
    public static void main(String[] args) {
        Constructor_3 x=new Constructor_3();
        Constructor_3 y=new Constructor_3("Deepak");
        Constructor_3 z=new Constructor_3("Deepak",22);
        Constructor_3 w=new Constructor_3("Deepak",22,"Yadaw");
        System.out.println("Name:"+x.name+" Age:"+x.age);
        System.out.println("Name:"+y.name+" Age:"+y.age);
        System.out.println("Name:"+z.name+" "+w.second_name+" Age:"+z.age);


    }
}
