import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 
public class UseCalculate 
{
	public static void main(String[] args)
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		{
			System.out.println("Enter the type of calculations to be performed(Basic or Scientific) : ");
			String type_op=new String("Type");
			do
			{
				try{
					type_op = in.readLine();
				}
				catch (Exception e) { 
					e.printStackTrace();
					System.out.println("Something went wrong.");
				}
				if(type_op.equals("Basic")){
					Calculator uc_clr_obj = new Calculator();
				}
				else if(type_op.equals("Scientific")){
					ScientificCalculator uc_sc_obj = new ScientificCalculator();
				}
				else{
					System.out.println("Enter valid calculation");
				}
			}while(!type_op .equals("n"));
		}
	}
}
