package vendingApp;

public class Main
{
	public static void main(String[] args)
	{
		// Current Customers
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		//Current Vending Machines
		Vendingmachine m1 = new Vendingmachine("Food");
		Vendingmachine m2 = new Vendingmachine("Drink");
		Vendingmachine m3 = new Vendingmachine("Office");

		// Snacks in Vending Machine 1
		Snack chips = new Snack("Chips", 36, 1.75, m1.getId());
		Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, m1.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, m1.getId());

		// Snacks in Vending Machine 2
		Snack soda = new Snack("Soda", 24, 2.50, m2.getId());
		Snack water = new Snack("Water", 20, 2.75, m2.getId());

		//Processing Vending Requests
		// soda.buySnack(3);

		c1.makePurchase(3, soda);


	}

}