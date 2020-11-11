package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SwipeToElement {
	
	
	
public void swiping(AndroidDriver<MobileElement> androidDriver, String input) {
	try {
		androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+input+"\"))")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public Boolean elementIsDisplayed(AndroidDriver<MobileElement> androidDriver, String input) {
	boolean flag = true;
	try {
		WebDriverWait ww = new WebDriverWait(androidDriver, 30);
		ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='"+input+"']")));
	} catch (Exception e) {
		flag=false;
		e.printStackTrace();
	}
	return flag;
}


}
