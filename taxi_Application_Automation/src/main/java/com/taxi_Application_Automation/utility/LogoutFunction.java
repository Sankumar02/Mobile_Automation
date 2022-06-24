package com.taxi_Application_Automation.utility;

import static com.taxi_Application_Automation.utility.LoadProperty.readLocatorString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.taxi_Application_Automation.constants.FilePathConstants;
import com.taxi_Application_Automation.constants.KeyConstants;

public class LogoutFunction extends TestBase {
	public static String logoutPath = FilePathConstants.LOGOUT_PATH;

	public static void logout() {

		WebElement logout = driver.findElement(By.xpath(readLocatorString(logoutPath, KeyConstants.LOGOUT)));
		ElementAction.clickButton(logout);
	}
}
