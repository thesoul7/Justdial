package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generic.OpenAppStepGroup;
import com.generic.SwipeToElement;

import io.appium.java_client.MobileBy;

public class GetAddress extends OpenAppStepGroup {
	@Test
	public void test1() {
		try {
			String resourceID="";
			androidDriver.findElementById("com.justdial.search:id/terms_accept_btn").click();
			/*WebDriverWait ww = new WebDriverWait(androidDriver, 45);
			ww.until(ExpectedConditions.elementToBeClickable(By.id("com.justdial.search:id/button_skip")));
			androidDriver.findElementById("com.justdial.search:id/button_skip").click();
			WebDriverWait ww1 = new WebDriverWait(androidDriver, 45);
			ww1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.justdial.search:id/change_lang_text_view")));
			SwipeToElement sl = new SwipeToElement();
			sl.swiping(androidDriver, "Maybe later");
			androidDriver.findElementById("com.justdial.search:id/search_edit_text_home").click();
			androidDriver.findElementById("com.justdial.search:id/search_edit_text").sendKeys("Qspiders");
			WebDriverWait ww2 = new WebDriverWait(androidDriver, 45);
			ww2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='KPHB Colony hyderabad']/preceding::android.widget.TextView[contains(@text,'Software')]")));
			androidDriver.findElementByXPath("//*[@text='KPHB Colony hyderabad']/preceding::android.widget.TextView[contains(@text,'Software')]").click();
			String address=androidDriver.findElement(MobileBy.AndroidUIAutomator("new Uiselector().resourceID(\"com.justdial.search:id/address\").arguments(0)")).getText();
			System.out.println(address);*/
			
			
			//sl.swiping(androidDriver, "2nd Floor, No. 222/MIG, Rd Number 2 KPHB Phase 1, KPHB Colony, Hyderabad - 500085 (Near KPHB Metro Station, Above Taruni Silks)");
			
			
			
			
			
			//androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Maybe later\"))")).click();
			/*androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\""+resourceID+"\").instance(0)"));
			//sf.searchForCategory(androidDriver, "Qspiders");
			WebDriverWait ww2 = new WebDriverWait(androidDriver, 45);
			ww2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name'])[1]")));
			androidDriver.findElementByXPath("(//android.widget.TextView[@resource-id='com.justdial.search:id/comp_name'])[1]").click();*/

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public Boolean readingElementFromRepo(WebElement input) {
		Boolean flag = false;
		try {
			if (input.isDisplayed()) {
			    flag=true;
			} else {
				flag=false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
