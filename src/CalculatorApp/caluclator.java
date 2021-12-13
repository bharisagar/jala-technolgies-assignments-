import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 
public class Calculator
{
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
	String i1="";
	int iFirstNum=0,iSecondNum=0;
	char cOperator='\0';
	{
		do
		{  	
			try{
				System.out.println("Enter the first number : ");
				i1 = inp.readLine();
				if(i1.equals("n"))
					break;
				iFirstNum= Integer.parseInt(i1);
				System.out.println("Enter the operator : ");
				cOperator = (char)inp.read();
				System.out.println("Enter the second number : ");
				String i2=inp.readLine();
				iSecondNum= Integer.parseInt(inp.readLine());
			}
			catch (Exception e) {
		 		e.printStackTrace();
				System.out.println("Something went wrong.");
			}
			Calculate clr_cl_obj=new Calculate(iFirstNum, cOperator,iSecondNum);
			clr_cl_obj.doCalculation();
			clr_cl_obj.getResult();
		}while(!i1.equals( "n"));
	}
}