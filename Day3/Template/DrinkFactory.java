import java.util.HashMap;

public class DrinkFactory {

	private static HashMap<Integer, String> classNameMap = null;

	static {
		classNameMap = new HashMap<Integer, String>();

		classNameMap.put( 1, "Coffee" );
		classNameMap.put( 2, "Tea" );
	}

	public static Drink getDrink( int choice ) {

		Drink drink = null;
		String className = null;

		try {
			className = classNameMap.get ( choice );
			drink = ( Drink ) Class.forName( className ).newInstance();
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}

		return drink;

	}

}
