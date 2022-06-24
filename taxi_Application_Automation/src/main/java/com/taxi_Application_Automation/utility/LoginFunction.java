package com.taxi_Application_Automation.utility;

import static com.taxi_Application_Automation.utility.LoadProperty.readLocatorString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.taxi_Application_Automation.constants.FilePathConstants;
import com.taxi_Application_Automation.constants.KeyConstants;

public class LoginFunction extends TestBase {
	public static String loginDetails = FilePathConstants.LOGIN_DETAIL;
	public static String loginPath = FilePathConstants.LOGIN_PATH;

	public static void login() {
		WebElement loginMobileNumber = driver
				.findElement(By.id(readLocatorString(loginPath, KeyConstants.LOGIN_MOBILE_NUMBER)));
		ElementAction.TextBox(loginMobileNumber, readLocatorString(loginDetails, KeyConstants.MOBILE_NUMBER_TEXT));

		WebElement loginPassword = driver.findElement(By.id(readLocatorString(loginPath, KeyConstants.LOGIN_PASSWORD)));
		ElementAction.TextBox(loginPassword, readLocatorString(loginDetails, KeyConstants.PASSWORD_TEXT));

		WebElement loginButton = driver.findElement(By.id(readLocatorString(loginPath, KeyConstants.LOGIN_BUTTON)));
		ElementAction.clickButton(loginButton);

	}
}
