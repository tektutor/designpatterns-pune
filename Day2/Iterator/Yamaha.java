import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class Yamaha implements Iterator {
	private FileWriter writer;
	private Scanner reader;
	private String line;

	public Yamaha() {
	   line = new String();
           try {
		writer = new FileWriter( "customers.txt" );

		writer.write ( "Yamaha - Customer 1\n" );
		writer.write ( "Yamaha - Customer 2\n" );
		writer.write ( "Yamaha - Customer 3\n" );
		writer.write ( "Yamaha - Customer 4\n" );
		writer.write ( "Yamaha - Customer 5\n" );

		writer.close();

		reader = new Scanner( new FileInputStream("customers.txt") );
	   }
	   catch( Exception e ) {
		   e.printStackTrace();
	   }
	}

	public boolean hasNext() {
		return reader.hasNextLine(); 
	}

	public String next() {
		return reader.nextLine();
	}
}
