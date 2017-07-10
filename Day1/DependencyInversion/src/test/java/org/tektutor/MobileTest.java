package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


class MockedCamera implements ICamera {

	public boolean ON() {
		System.out.println("Fake camera");
		return true; //Stubbing - hard coding response
			     //of dependent method
	}

}



public class MobileTest {

	@Test
	public void testPowerOn() {
		
		//Mocking
		ICamera mockedCamera = mock ( ICamera.class );

		//Stubbing - hard code response of camera ON method
		when(mockedCamera.ON()).thenReturn ( true );

		Mobile mobile = new Mobile( mockedCamera );
		assertEquals ( true, mobile.powerOn() );
	}

}
