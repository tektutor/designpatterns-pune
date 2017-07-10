public class Mouse extends PCAccessory {

	public Mouse( IHardware hardware ) {
		super( hardware );
	}

	public String getDescription() {
		return hardware.getDescription() + " Mouse";
	}

	public double getPrice() {
		return hardware.getPrice() + 1000.00;
	}

}
