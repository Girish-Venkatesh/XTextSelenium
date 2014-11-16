package com.vmware.in.testframework.wrapper;


import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.vmware.in.vmware.constants.Constants;

public class ServerManager {
	
	public void startServer() {
		System.out.println("Initialization of server variables");
		
		//Using desired capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		//false => event execution faster, keyboard has to be locked
		//true => event execution slower, keyboard need not be locked, other parallel action can be performed
		capability.setCapability("nativeevents", false);
		Constants.webdriver = new FirefoxDriver(capability);
		
		
		//Using currentprofile
		/*Constants.profiles = new ProfilesIni();
		Constants.currentProfile = Constants.profiles.getProfile("JTable");
		Constants.currentProfile.setAcceptUntrustedCertificates(true);
		Constants.currentProfile.setEnableNativeEvents(false);
		Constants.webdriver = new FirefoxDriver(Constants.currentProfile);*/
		
		
		
		//Using remote webdriver
		
		
		Constants.rcdriver = new WebDriverBackedSelenium(Constants.webdriver, Constants.TEST_URL);
		System.out.println("Initialization of server variables completed");
		
		
	}
	
	public void loadURL() {
		System.out.println("Loading the url "+Constants.TEST_URL);
		Constants.webdriver.get(Constants.TEST_URL);
	}
	
	public void destroyServer() {
		System.out.println("Destroying server variables");
//		Constants.rcdriver.stop();
		Constants.webdriver.close();
		Constants.webdriver.quit();
		System.out.println("Destryoing server variables completed");
	}

}
