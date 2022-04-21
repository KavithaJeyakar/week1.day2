package week1.day2;

public class Mycalculator {

	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		
		
		System.out.println("Addition : " + c.add(20,30,50));
		
		System.out.println("Subtraction : " + c.sub(100,20));
		
		System.out.println("Multiplication : " + c.multi(20.3,6.5));
		
		System.out.println("Division : " + c.div(1000000020,1000));
		
		
	}
}
