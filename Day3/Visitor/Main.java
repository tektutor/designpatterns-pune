public class Main {

	public static void main ( String args[] ) {

		Item pen = new Item ("Parker Pen", 100.00 );

		IVisitor visitor = new Visitor();
		pen.accept ( visitor );
		double costOfPen = visitor.getPrice();

		Item iPhone6S = new Item ("IPhone 6S 32GB Space Grey", 65000.00 );
		iPhone6S.accept ( visitor );
		double costOfIPhone6S = visitor.getPrice();

		double totalAmount = costOfPen + costOfIPhone6S;

		System.out.println ( "Total Amount payable is " + totalAmount );

	}

}
