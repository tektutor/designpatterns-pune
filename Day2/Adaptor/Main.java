public class Main {

	public static void main ( String args[] ) {

		Adaptor paymentGateway = new Adaptor();

		System.out.println("Amount payable in INR is " + paymentGateway.pay ( 400 ) );

	}

}
