package org.tektutor;

public class Mobile {
	private ICamera camera = null;

	//Dependency Injection or Dependency Inversion or
	//Inversion of Control(IOC)
	public Mobile( ICamera camera ) {
		this.camera = camera;
	}

	public boolean powerOn() {
		System.out.println ( "Mobile powerOn method invoked" );

		if ( camera.ON() ) {
			System.out.println( "Perform power on logic related to success scenario ...");
			return true;
		}

		System.out.println( "Perform power on logic related to failure scenario ...");

		return false;

	}

}
