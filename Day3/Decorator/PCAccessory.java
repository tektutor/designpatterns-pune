public abstract class PCAccessory implements IHardware {
	protected IHardware hardware;

	public PCAccessory( IHardware hardware ) {
		this.hardware = hardware;
	}

	public String getDescription() {
		return hardware.getDescription();
	}

	public double getPrice() {
		return hardware.getPrice();
	}
}
