public class Subscriber implements ISubscriber {

	private String name;

	public Subscriber( String name ) {
		this.name = name;
	}

	public void update ( String packageName ) {
		System.out.println ( name + " received => " + packageName );
	}

}
