import java.util.ArrayList;
import java.util.HashMap;

public class TataSky {
	private HashMap<String, ArrayList<ISubscriber>> subscribersMap = null;
	private String name;

	public TataSky(String name) {
		this.name = name;
		subscribersMap = new HashMap< String, ArrayList<ISubscriber> >();

		subscribersMap.put( "Sports Channels", new ArrayList<ISubscriber>() );
		subscribersMap.put ( "HD Channels", new ArrayList<ISubscriber>() );
	}

	public void addSubscriber( Subscriber subscriber, String packageName ) {
		ArrayList<ISubscriber> subscribers =  subscribersMap.get( packageName);
		subscribers.add ( subscriber );
	}

	public void telecast( String packageName ) {
		ArrayList<ISubscriber> subscribers =  subscribersMap.get( packageName);

		for ( ISubscriber subscriber: subscribers) 
			subscriber.update ( packageName ); 
	}
}
