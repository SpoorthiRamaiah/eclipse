package demo;

public class Calculator {
	static int a = 10;
	static int b = 2;
	public static  void add()
	{
	System.out.println("The addition of two numbers is : "+(a+b));	
	}
	public static void subtract()
	{
		System.out.println("The subtraction of two numbers is :" +(a-b));
	}
	public static void div()
	{
		System.out.println("The division of two numbers is :" +(a/b));
	}
	public static void main(String[] args) {
		
	add();
	subtract();
	div();

	}
}
