import java.util.ArrayList;
import java.util.Iterator;

public class HeroHonda implements Iterator {
	private ArrayList<String> customers = null;
	private int index;

	public HeroHonda() {
		customers = new ArrayList<String>();
		customers.add ( "Hero Honda - Customer1" );
		customers.add ( "Hero Honda - Customer2" );
		customers.add ( "Hero Honda - Customer3" );
		customers.add ( "Hero Honda - Customer4" );
		customers.add ( "Hero Honda - Customer5" );
		customers.add ( "Hero Honda - Customer6" );
		index = 0;
	}

	public boolean hasNext() {
		return ( index < customers.size()-1 );
	}

	public String next() {
		return customers.get(index++);	
	}
}
