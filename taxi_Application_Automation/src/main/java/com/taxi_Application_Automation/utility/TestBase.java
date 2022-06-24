package com.taxi_Application_Automation.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.taxi_Application_Automation.constants.FilePathConstants;
import com.taxi_Application_Automation.constants.KeyConstants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	public static AppiumDriver driver;
	public static URL appUrl = null;
	static String testPath = FilePathConstants.CAPABILITIES_DETAIL;
	public static JavascriptExecutor executor;

	@BeforeSuite
	public static void setup() {

		String appServerURL = LoadProperty.readLocatorString(testPath, KeyConstants.LAUNCH_APP_URL);

		try {
			appUrl = new URL(appServerURL);
		} catch (MalformedURLException malformedURLException) {
			malformedURLException.printStackTrace();
		}

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				LoadProperty.readLocatorString(testPath, KeyConstants.PLATFORM_NAME));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				LoadProperty.readLocatorString(testPath, KeyConstants.PLATFORM_VERSION));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				LoadProperty.readLocatorString(testPath, KeyConstants.DEVICE_NAME));
		capabilities.setCapability("appPackage", LoadProperty.readLocatorString(testPath, KeyConstants.APP_PACKAGE));
		capabilities.setCapability("appActivity", LoadProperty.readLocatorString(testPath, KeyConstants.APP_ACTIVITY));

		if (appUrl != null) {
			driver = new AndroidDriver(appUrl, capabilities);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		} else {
			System.out.println("Failed to load the Taxi App!!");
		}

	}

	@AfterSuite
	public static void terminate() {
		driver.quit();
	}

}
