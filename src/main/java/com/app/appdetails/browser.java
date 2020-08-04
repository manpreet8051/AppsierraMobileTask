package com.app.appdetails;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class browser {
	
	public static AndroidDriver getAndroidDriver() {
		AndroidDriver driver = null;
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName","Android");
			desiredCapabilities.setCapability("platformVersion","7.0");
			desiredCapabilities.setCapability("app","C:\\Users\\Manpreet\\Documents\\APP\\Android-NativeDemoApp-0.2.1.apk");
			URL url = new URL("https://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url,desiredCapabilities); 
			String sessionId = driver.getSessionId().toString();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		
		return driver;
	}

}
