package vendingApp;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private String vendID;

	public Snack(String name, int quantity, double cost, String vendID)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendID = vendID;
	}

	public int getId()
	{
		return id;
	}

	public int setId(int id) // is this independent from maxId? What is this specific ID for?
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity) // add new quanitity to current quantity
	{
		this.quantity = this.quantity + quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public double getTotalCost(int quantity)
	{
		return quantity * cost;
	}

	public String getVendID()
	{
		return vendID;
	}

	public void setVendID(String vendID)
	{
		this.vendID = vendID;
	}

	public double buySnack(int quantity)
	{
		this.quantity - quantity
		return getTotalCost(quantity)
	}


}


