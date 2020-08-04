package com.android.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.base.BaseClass;

import io.appium.java_client.android.AndroidDriver;

public class ApplicationTest extends BaseClass {
	
	public ApplicationTest(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@BeforeMethod
	public void setup() {

	}
	
	
	@AfterMethod
	public void tearDown() {
	}
	
	@Test
	public void testApplicationMethod() {
		
	}

}
