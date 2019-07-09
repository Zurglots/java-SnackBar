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

		// Customer 1 buys 3 of snack 4.
		c1.makePurchase(3, soda);

		// Print c1 cash on hand & snack 4 quantity.
		System.out.println(c1.getCash());
		System.out.println(soda.getQuantity());

		// c1 buys 1 of snack 3.
		c1.makePurchase(1, pretzel);

		// Print c1 cash on hand & snack 3 quantity.
		System.out.println(c1.getCash());
		System.out.println(pretzel.getQuantity());

		// c2 buys 2 of snack 4.
		c2.makePurchase(2, soda);
		// Print c2 cash on hand & snack 4 quantity.
		System.out.println(c2.getCash());
		System.out.println(soda.getQuantity());

		// c1 adds $10.
		c1.addCash(10);

		// Print c1 cash on hand.
		System.out.println(c1.getCash());

		// c1 buys 1 of snack 2.
		c1.makePurchase(1, chocolate);

		// Print c2 cash on hand & snack 2 quantity.
		System.out.println(c2.getCash());
		System.out.println(chocolate.getQuantity());

		// Add 12 snack to snack 3.
		pretzel.setQuantity(12);

		// Print snack 3 quantity.
		System.out.println(chocolate.getQuantity());

		// Customer 2 buys 3 of snack 3.
		c2.makePurchase(3, pretzel);

		// Print c2 cash on hand & quantity of snack 3.
		System.out.println(c2.getCash());
		System.out.println(pretzel.getQuantity());

	}

}