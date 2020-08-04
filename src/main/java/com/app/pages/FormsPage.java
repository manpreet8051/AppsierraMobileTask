package com.app.pages;

import com.app.base.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FormsPage extends BaseClass {
	
	public FormsPage(AndroidDriver driver) {
		super(driver);
		
	} 
	
	@AndroidFindBy(xpath ="")
	AndroidElement links;

}
