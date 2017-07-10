import java.lang.ref.WeakReference;

public class Singleton {
	private static WeakReference<Singleton> instance = null;

	private Singleton() { }

	public static synchronized Singleton getInstance() {

		if ( instance == null )
			instance = new WeakReference<Singleton>(new Singleton());

		return instance.get();
	}

	public static void main ( String args[] ) {

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if ( obj1 == obj2 )
			System.out.println ("Objects are same");
		else
			System.out.println ("Objects are not same");

	}

}
