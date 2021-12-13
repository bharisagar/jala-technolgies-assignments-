public class Calculate implements iCalc
{
	double result;
	double dblNum;
	int iFirstNum;
	int iSecondNum;
	char cOperator;
	Calculate(){}	
	Calculate(double dblNum, char cOperator)
	{
		this.dblNum=dblNum;
		this.cOperator=cOperator;
	}
	Calculate(int iFirstNum, char cOperator, int iSecondNum)
	{
		this.iFirstNum=iFirstNum;
		this.cOperator=cOperator;
		this.iSecondNum=iSecondNum;
	}
	public void doCalculation()
	{
		switch (cOperator) 
		{
     			 case '+' :  result = iFirstNum + iSecondNum;
				break;
      			case '-' : result = iFirstNum - iSecondNum;
  				 break;
      			case '*' : result = iFirstNum * iSecondNum;
        				break;
      			case '/' : result = iFirstNum / iSecondNum;
        				break;
			case 's' :  result = Math.toRadians(Math.sin(dblNum));
				break;
      			case 'c' : result = Math.toRadians(Math.cos(dblNum));
  				break;
      			case 't' : result = Math.toRadians(Math.tan(dblNum));
        				break;
			case 'l' : result = Math.log(dblNum);
        				break;
			default : System.out.println("Invalid operator!");
        				break;
    		}
	}
	public void getResult()
	{
		System.out.println(result);
	}
}