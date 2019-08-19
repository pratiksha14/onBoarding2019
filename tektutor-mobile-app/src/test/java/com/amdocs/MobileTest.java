package com.amdocs;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionNormally() {
		//Mocking- creating dummy camera object with no original method
		Camera mockedCamera = Mockito.mock (Camera.class);
		
		//stubbing - hard coding the response of dependent method
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals (expectedResponse, actualResponse);
		
		//Verify the camera.on() method invoking within the startPhotoApp() method
		Mockito.verify(mockedCamera, Mockito.times(1)).on();
	}

}
