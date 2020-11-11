package com.generic;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class OpenAppStepGroup {
	public AndroidDriver<MobileElement> androidDriver;//native and hybrid apps
	//public AndroidDriver<WebElement> driver;//web apps
	public AppiumDriverLocalService service;

	@BeforeMethod
	public void appOpen() {
		DesiredCapabilities cap = new DesiredCapabilities();
		/*AppiumServiceBuilder builder = new AppiumServiceBuilder();
	    builder.withIPAddress("127.0.0.1");
	    builder.usingPort(4723);
	    builder.withCapabilities(cap);
	    builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
	    builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

	    //Start the server with the builder
	    service = AppiumDriverLocalService.buildService(builder);
	    service.start();*/
		cap.setCapability("deviceName", "Android emulator");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.justdial.search");
		cap.setCapability("appActivity", ".SplashScreenNewActivity");
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("noReset", "false");
		/*
		 * cap.setCapability("unicodeKeyboard", "true");
		 * cap.setCapability("resetKeyboard", "true");
		 */
		try {
			URL url = new URL("http://localhost:4725/wd/hub");//huburl
			androidDriver=new AndroidDriver<MobileElement>(url,cap);//Creating an Object of Android Driver
			androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void closeApp() {
		androidDriver.quit();
		//service.stop();
	}
}
