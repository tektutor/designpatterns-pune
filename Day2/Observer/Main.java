public class Main {

	public static void main (String args[] ) {
		TataSky tataSky = new TataSky( "Tata Sky" );

		Subscriber sharma = new Subscriber ( "Sharma" );
		tataSky.addSubscriber ( sharma, "Sports Channels" ); 

		Subscriber kumar = new Subscriber( "Kumar" );
		tataSky.addSubscriber ( kumar, "HD Channels" );
		tataSky.addSubscriber ( kumar, "Sports Channels" );

		tataSky.telecast( "Sports Channels" );
		tataSky.telecast( "HD Channels" );

	}
}
