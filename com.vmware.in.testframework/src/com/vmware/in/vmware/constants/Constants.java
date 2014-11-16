package com.vmware.in.vmware.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import com.thoughtworks.selenium.Selenium;
import com.vmware.in.testframework.util.PropertyReader;

public class Constants {
	
	private static PropertyReader propertyReader = new PropertyReader();
	public static final  String TEST_URL = propertyReader.getPropertyValue("test.url");
	
	public static WebDriver webdriver ;
	public static Selenium rcdriver ;
	public static ProfilesIni profiles;
	public static FirefoxProfile currentProfile;
	
	
	public final static String JSON_FILE = "input.json";

}
