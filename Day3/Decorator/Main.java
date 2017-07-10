public class Main {

	public static void main ( String args[] ) {

		IHardware pc = new DVDDrive( new KeyBoard( new Mouse(new PC()) ) ) ;
		System.out.println ("PC Configuration");
		System.out.println (pc.getDescription());
		System.out.println ("Price of your PC is : INR " + pc.getPrice() );
	}
}
