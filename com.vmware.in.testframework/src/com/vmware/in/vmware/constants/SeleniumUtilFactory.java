package com.vmware.in.vmware.constants;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtilFactory {

	public static void openTestUrl(String url) {
		try {
			Constants.webdriver.get(url);

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}





	}


	public static void maximizeWindow() {
		try {
			Constants.webdriver.manage().window().maximize();

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	


	}

	public static void pauseTime(Long delay) {
		try {
			Thread.sleep(delay);

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	


	}

	public static boolean isAlertPresent() {
		try {
			if(Constants.webdriver.getTitle() != null) {
				return false;
			}

			else {
				return true;
			}

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return false;

	}


	public static String getAlert() {
		try {

			Alert alert = Constants.webdriver.switchTo().alert();
			alert.accept();
			return alert.getText();

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return "";

	}


	public static String getHtmlSource() {
		try {

			return Constants.webdriver.getPageSource();

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return "";

	}


	public static void refreshPage() {
		try {

			Constants.webdriver.navigate().refresh();


		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	



	}


	public static String takeScreenShot(String filename) {
		try {



			OutputType<Object> fielname = null;
			((TakesScreenshot)Constants.webdriver).getScreenshotAs(fielname);

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return "";

	}

	public static String getText(WebElement element) {
		try {

			if(element.getText().isEmpty()) {
				return element.getAttribute("value");
			}

			else {
				element.getText();
			}

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return "";

	}


	public static String getBackGroundColor(WebElement element) {
		try {

			return element.getAttribute("bground-color");

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return "";

	}


	public static boolean isTextPresnt(String text) {
		try {

			if(Constants.rcdriver.isTextPresent(text)) {
				return true;
			}

			else {
				return false;
			}

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return false;

	}


	public static boolean waitForText(String text) {
		try {
			boolean checker = false;
			int i =0;
			while(i>=10000) {
				checker = Constants.rcdriver.isTextPresent(text);
				if(checker) {
					return true;
				}
				i = i+10;
				pauseTime(10l);
			}
			return false;

		}

		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return false;

	}


	public static WebElement getElementOfId(String id) {

		try {
			WebElement element = Constants.webdriver.findElement(By.id(id));
			WebDriverWait wait = new WebDriverWait(Constants.webdriver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		}
		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return null;

	}


	public static WebElement getElementOfXapth(String xpath) {

		try {
			WebElement element = Constants.webdriver.findElement(By.xpath(xpath));
			WebDriverWait wait = new WebDriverWait(Constants.webdriver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		}
		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return null;

	}


	public static boolean idClickable(String id) {

		try {

			WebDriverWait wait = new WebDriverWait(Constants.webdriver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
			return true;
		}
		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return false;

	}


	public static boolean isFramePresent(String frame) {

		try {
			if(Constants.webdriver.switchTo().frame(frame) != null) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}	

		return false;

	}


	public static void selectFrame(String frame) {

		try {

			WebDriverWait wait = new WebDriverWait(Constants.webdriver, 60);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		}
		catch(NoSuchElementException ex) {
			System.out.println("Open URL NoSuchElementException");
			System.out.println(ex.getMessage());
		}

		catch(TimeoutException ex) {
			System.out.println("Open URL TimeoutException");
			System.out.println(ex.getMessage());
		}
		catch(NoAlertPresentException ex) {
			System.out.println("Open URL NoAlertPresentException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchFrameException ex) {
			System.out.println("Open URL NoSuchFrameException");
			System.out.println(ex.getMessage());
		}

		catch(NoSuchWindowException ex) {
			System.out.println("Open URL NoSuchWindowException");
			System.out.println(ex.getMessage());
		}

		catch(NotFoundException ex) {
			System.out.println("Open URL NotFoundException");
			System.out.println(ex.getMessage());
		}

		catch(Exception ex) {
			System.out.println("Open URL Exception");
			System.out.println(ex.getMessage());
		}
		
		
		
		
		


	}











}
