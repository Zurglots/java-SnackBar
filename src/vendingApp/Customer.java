package vendingApp;

public class Customer
{
	private static int maxId = 0;

	public int id;
	public String name;
	public double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.cash = cash;
	}

	public String getName()
	{
		return name;
	}

	public void addCash(double cash)
	{
		this.cash = this.cash + cash;
	}

	public double getCash()
	{
		return cash;
	}

	public void makePurchase(int quantity, Snack snack)
	{
		this.cash = this.cash - snack.buySnack(quantity);
	}

	// public void newCash()
	// {
	// 	this.cash = makePurchase();
	// }

}