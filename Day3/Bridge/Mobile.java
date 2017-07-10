public abstract class Mobile {
	private String model; 
	private ISIM sim;

	public Mobile( String model, ISIM sim ) {
	       this.model = model;	
	       this.sim = sim;
	}

	public void call ( int mobileNo ) {
		sim.call ( mobileNo );
	}

}
