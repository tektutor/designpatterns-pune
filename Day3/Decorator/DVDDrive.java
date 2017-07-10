public class DVDDrive extends PCAccessory {

	public DVDDrive( IHardware hardware ) {
		super( hardware );
	}

	public String getDescription() {
		return hardware.getDescription() + " 32x DVD Drive";
	}

	public double getPrice() {
		return hardware.getPrice() + 1000.00;
	}

}
