public class Main {

	public static ICar getCar ( String typeOfCar ) {
		ICar car = null;

		switch ( typeOfCar ) {

			case "BMW":
				car = new BMW();
				break;

			case "Audi":
				car = new Audi();
				break;

			case "Maruti":
				car = new Audi();
				break;
			
			default:
				car = new NullCar();
				break;
		}

		return car;

	}

	public static void main ( String args[] ) {

	    try {
		ICar car = getCar ( "" );
		car.drive();
	    }
	    catch( Exception e ) {
		    e.printStackTrace();
	    }

	}

}
