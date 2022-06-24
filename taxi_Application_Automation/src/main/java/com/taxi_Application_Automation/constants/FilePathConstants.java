package com.taxi_Application_Automation.constants;

/*	
  C:\Users\santhoshkumar.s\eclipse-workspace\taxi_Application_Automation\src\main\resources\locators\hepl.prop
*/

import java.io.File;

public class FilePathConstants {

	public static final String USER_HOME = System.getProperty("user.dir") + File.separator;
	public static final String MAIN_HOME = USER_HOME + "src" + File.separator + "main" + File.separator;
	public static final String RESOURCE_HOME = MAIN_HOME + "resources" + File.separator;
	public static final String LOCATORS_HOME = RESOURCE_HOME + "locators" + File.separator;
	public static final String REGISTRATION_PATH = LOCATORS_HOME + "registeration.properties";
	public static final String REGISTRATION_TEST_PATH = LOCATORS_HOME + "registration-test.properties";
	public static final String LOGIN_PATH = LOCATORS_HOME + "login.properties";
	public static final String LOGOUT_PATH = LOCATORS_HOME + "logout.properties";
	public static final String MENU_PAGE_PATH = LOCATORS_HOME + "menupage.properties";
	public static final String HELP_PATH = LOCATORS_HOME + "helpPage.properties";
	public static final String DELETE_PATH = LOCATORS_HOME + "deleteaccount.properties";
	public static final String TEST_DATA_HOME = RESOURCE_HOME + "testdata" + File.separator;
	public static final String CAPABILITIES_DETAIL = TEST_DATA_HOME + "capabilities.properties";
	public static final String REGISTRATION_DETAIL = TEST_DATA_HOME + "registration-details.properties";
	public static final String LOGIN_DETAIL = TEST_DATA_HOME + "logindetails.properties";

}
