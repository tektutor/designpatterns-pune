public class Visitor implements IVisitor {
	private Item item = null;

	public void visit ( Item item ) {
		this.item = item;
	}

	public double getPrice( ) {
		return (item.getPrice() * 0.18) + item.getPrice(); 
	}

}
