import java.util.Scanner;

public class VendingMachine {

	private int choice = 0;

	public VendingMachine() {

            while ( choice != 3 ) {
		displayMenu();
		acceptChoice();
		prepareDrink();
	    }
	}

	private void displayMenu() {
		System.out.println ( "Menu");
		System.out.println ("--------");
		System.out.println ( "Coffee ---> 1");
		System.out.println ( "Tea ---> 2");
		System.out.println ( "Exit --> 3");
	}

	private void acceptChoice() {
		System.out.println ("Choose your drink : ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();

		if ( choice == 3 )
			System.exit(0);
	}

	private void prepareDrink() {
		Drink drink = DrinkFactory.getDrink( choice );
		drink.prepareDrink();
	}

	public static void main ( String args[] ) {
		VendingMachine vendingMachine = new VendingMachine();
	}

}
