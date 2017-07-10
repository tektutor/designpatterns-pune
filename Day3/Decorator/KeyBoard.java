public class KeyBoard extends PCAccessory {

	public KeyBoard( IHardware hardware ) {
		super( hardware );
	}

	public String getDescription() {
		return hardware.getDescription() + " Keyboard";
	}

	public double getPrice() {
		return hardware.getPrice() + 500.00;
	}

}
