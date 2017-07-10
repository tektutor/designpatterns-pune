import java.util.ArrayList;
import java.util.Iterator;

public class Bajaj implements Iterator {
	private String [] customers = null;
	private int index;

	public Bajaj() {
		index = 0;
		customers = new String[6];
		customers[index++] =  "Bajaj - Customer1" ;
		customers[index++] =  "Bajaj - Customer2" ;
		customers[index++] =  "Bajaj - Customer3" ;
		customers[index++] =  "Bajaj - Customer4" ;
		customers[index++] =  "Bajaj - Customer5" ;
		customers[index++] =  "Bajaj - Customer6" ;

		index = 0;
	}

	public boolean hasNext() {
		return ( index < customers.length-1 );
	}

	public Object next() {
		return customers[index++];
	}

}
