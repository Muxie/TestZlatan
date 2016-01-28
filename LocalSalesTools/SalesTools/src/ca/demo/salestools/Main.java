package ca.demo.salestools;

public class Main 
{
	public static void main(String[] args) 
	{
		Salesdata data = new Salesdata();
		displayGreeting();
		data.display();
	}
	private static void displayGreeting()
	{
		System.out.println("Hello happy sales people!");
		System.out.println("This app shows sales data");
		System.out.println("Test 1");
	}
}
