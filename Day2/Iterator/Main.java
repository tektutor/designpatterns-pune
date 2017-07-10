public class Main {

	public static void printReport() {

		HeroHonda heroHonda = new HeroHonda();
		while ( heroHonda.hasNext() )
			System.out.println ( heroHonda.next() );

		Bajaj bajaj = new Bajaj();
		while ( bajaj.hasNext() )
			System.out.println ( bajaj.next() );

		Yamaha yamaha = new Yamaha();
		while ( yamaha.hasNext() )
			System.out.println ( yamaha.next() );

	}


	public static void main ( String args[] ) {

		printReport();

	}

}
