import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 
public class ScientificCalculator extends Calculate
{
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in)); 
	String i="";
	double dblNum=0;
	char cOperator='\0';
	{
		do{
			System.out.println("Enter the number : ");
			try{
				i = inp.readLine();
				if(i.equals("n"))
					break;
				dblNum= Double.parseDouble(i);
				System.out.println("Enter the operator : ");
				cOperator = (char)(inp.readLine()).charAt(0);
				Calculate sc_cl_obj=new Calculate(dblNum, cOperator);
				sc_cl_obj.doCalculation();
				sc_cl_obj.getResult();
			}
			catch (Exception e) {
			 	e.printStackTrace();
				System.out.println("Something went wrong.");
			}
		}while(!i.equals("n")); 
	}
}
