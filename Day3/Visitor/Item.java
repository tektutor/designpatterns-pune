public class Item implements IVisitable {
	private String name;
	private double price;

	public Item ( String name, double price ) {
		this.name = name;
		this.price = price;
	}

	public double getPrice ( ) {
		return price;
	}

	public void accept ( IVisitor visitor ) {
		visitor.visit( this );
	}
}
