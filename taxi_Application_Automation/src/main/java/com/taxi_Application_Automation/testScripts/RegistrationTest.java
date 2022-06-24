package com.taxi_Application_Automation.testScripts;

import static com.taxi_Application_Automation.utility.LoadProperty.readLocatorString;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.taxi_Application_Automation.constants.FilePathConstants;
import com.taxi_Application_Automation.constants.KeyConstants;
import com.taxi_Application_Automation.utility.ElementAction;
import com.taxi_Application_Automation.utility.LoginFunction;
import com.taxi_Application_Automation.utility.LogoutFunction;
import com.taxi_Application_Automation.utility.TestBase;
import com.taxi_Application_Automation.utility.UserRegistration;

public class RegistrationTest extends TestBase {

	public static String registrationTestPath = FilePathConstants.REGISTRATION_TEST_PATH;
	public static String menuPagePath = FilePathConstants.MENU_PAGE_PATH;

	@Test
	public static void verifyUserRegistration() {

		UserRegistration.newUserRegistration();
		LoginFunction.login();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement menuSelect = driver
				.findElement(By.xpath(readLocatorString(menuPagePath, KeyConstants.MENU_SCROLL_BAR)));
		ElementAction.clickButton(menuSelect);

		WebElement profileButton = driver
				.findElement(By.xpath(readLocatorString(registrationTestPath, KeyConstants.PROFILE_BUTTON)));
		ElementAction.clickButton(profileButton);

		WebElement verifyElement = driver
				.findElement(By.id(readLocatorString(registrationTestPath, KeyConstants.GET_MOBILE_NUMBER)));
		String verifyUser = ElementAction.Element_text(verifyElement);
		Assert.assertEquals(verifyUser, readLocatorString(registrationTestPath, KeyConstants.VERIFY_REGISTRATION));

		WebElement backButton = driver.findElement(By.xpath(readLocatorString(menuPagePath, KeyConstants.BACK_BUTTON)));
		ElementAction.clickButton(backButton);

		ElementAction.clickButton(menuSelect);

		LogoutFunction.logout();

	}
}
