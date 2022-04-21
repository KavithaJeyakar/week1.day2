package week1.day2;

public class LearnMethods {
	
	public static void main(String[]args)
	{
	LearnMethods LM = new LearnMethods();
	LM.getCarName();
	
	
	
	int getCarRegNumber = LM.getCarRegNumber();
	System.out.println(getCarRegNumber);
	
	String getcarVarient = LM.getcarVarient();
	System.out.println(getcarVarient);
	
	int multiplyTwoNumbers = LM.multiplyTwoNumbers(5,2);
	
	System.out.println(multiplyTwoNumbers);
	
	}

	
	public void getCarName()
	{
		System.out.println("Hyundai Creta");	
		
	}
	
	public int getCarRegNumber()
	{
		int Regnumber = 7382;
		
		return Regnumber;		
		
	}
	
	public String getcarVarient()
	{
		return "Hyundai Creta VX";		
		
	}
	
	public int multiplyTwoNumbers (int a,int b)
	{
		
		return a*b;		
		
	}
	
}
