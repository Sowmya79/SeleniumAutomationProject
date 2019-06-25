package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CheckOutPOM;
import com.training.pom.OrderPlacePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class OrderPlace {

	private static WebDriver driver;
	private static String baseUrl;
	private static OrderPlacePOM orderplacePOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		orderplacePOM = new OrderPlacePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformPOM = new UniformPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl); 
	} */
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	//Week2 Uniform TestCase3
	   @Test()
	    public void OrderPlaceTest() throws InterruptedException {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,1000)");
	    	screenShot.captureScreenShot("Ninth");
	    	Thread.sleep(1000);
	    	orderplacePOM.clickShopUniforms();
	    	js.executeScript("window.scrollBy(0,500)");
	    	orderplacePOM.clickSportsTShirt();
	    	screenShot.captureScreenShot("Tenth");
	    	orderplacePOM.SelectChestSize();
	    	orderplacePOM.ClickAddToCartBtn();
	    	screenShot.captureScreenShot("Eleventh");
	    	Thread.sleep(1000);
	    	orderplacePOM.ClickCartBtn();
	    	screenShot.captureScreenShot("Twelve");
	    	Thread.sleep(1000);
	    	orderplacePOM.ClickViewCartBtn();
	    	screenShot.captureScreenShot("Thirteen");
	    	orderplacePOM.ClickCheckOutBtn();
	    	orderplacePOM.sendEmail("sowmya99@gmail.com");
	    	orderplacePOM.sendPassword1("sowmya");
	    	orderplacePOM.clickLoginBtn();
	    	screenShot.captureScreenShot("Fourteen");
	    	Thread.sleep(1000);
	    	orderplacePOM.clickContinueBtn();
	    	screenShot.captureScreenShot("Fifteen");
	    	Thread.sleep(1000);
	    	orderplacePOM.clickShipContinueBtn();
	    	Thread.sleep(1000);
	    	orderplacePOM.sendTextInCommentBox("Please Deliver the Order between 7AM to 10PM");
	    	Thread.sleep(1000);
	    	orderplacePOM.clickShipMContinueBtn();
	    	screenShot.captureScreenShot("Sixteen");
	    	Thread.sleep(1000);
	    	orderplacePOM.clickCheckBox();
	    	Thread.sleep(1000);
	    	orderplacePOM.clickPayContinueBtn();
	    	Thread.sleep(1000);
	    	orderplacePOM.clickConfirmOrderBtn();
	    	screenShot.captureScreenShot("Seventeen");
	    	Thread.sleep(3000);
	    } 

}
