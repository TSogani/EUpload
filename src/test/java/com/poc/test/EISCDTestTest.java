package com.poc.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.poc.service.EISCDService;


public class EISCDTestTest {

	static EISCDService eiscdServiceMock;
	String sourcePath ="D:/FOLDER_TASK/STSEclipsPOC/DTU";
	EISCDTest eiscdController;

	@Before
	public void setup() {

		eiscdController = new EISCDTest();
		//eiscdServiceMock = mock(EISCDService.class);
		// jsonWriter = mock(JsonWriter.class);

		//ReflectionTestUtils.setField(eiscdController, "eiscdService",eiscdServiceMock);

		// ReflectionTestUtils.setField(journalsController, "jsonWriter",
		// jsonWriter)
	}
	
	@Test
	public void validationAndLoad(){
		// validate zero byte file 
		// validate wellformedness xml
		// validate file available or not at DTU location 
		// get lateset ISCD .xml file from STU location
		
		boolean load = eiscdController.validationAndLoad(sourcePath);
		
		Assert.assertEquals(load,true);
		
	}
}
