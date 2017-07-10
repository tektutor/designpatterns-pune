public class NullCar implements ICar {

	public void drive() throws Exception {
		System.out.println ("Null Object");
		System.out.println ("Perform error handling logic here");
		throw new Exception("Invalid car");
	}
}
