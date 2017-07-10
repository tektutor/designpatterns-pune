public class Main {

	public static void main ( String args[] ) {

		CustomerFacade sriram = 
			new CustomerFacade ( "Sriram", "", "Jeganathan",
					     "704", "Trillium", "Magarpatta City",
					     "", "Pune", "411 028", "Maharastra");

		System.out.println ( sriram.getName() );
		System.out.println ( sriram.getAddress() );

	}
}
