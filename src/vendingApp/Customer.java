package vendingApp;

public class Customer
{
	private static int maxId = 0;

	public int id;
	public String name;
	public double cash;

	public Customer(String name, double cash)
	{
		maxId++
		this.id = maxId;
		this.name = name;
		this.cash = cash;
	}

}