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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CheckOut {

	private static WebDriver driver;
	private static String baseUrl;
	private static CheckOutPOM checkoutPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		checkoutPOM = new CheckOutPOM(driver); 
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
	
	// Week2 Uniform TestCase2
    @Test()
    public void CheckOutProductTest() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)");
    	screenShot.captureScreenShot("Third");
    	Thread.sleep(1000);
    	checkoutPOM.clickShopUniforms();
    	js.executeScript("window.scrollBy(0,500)");
    	checkoutPOM.clickSportsTShirt();
    	screenShot.captureScreenShot("Fourth");
    	checkoutPOM.SelectChestSize();
    	checkoutPOM.ClickAddToCartBtn();
    	screenShot.captureScreenShot("Fifth");
    	Thread.sleep(1000);
    	checkoutPOM.ClickCartBtn();
    	screenShot.captureScreenShot("Sixth");
    	Thread.sleep(1000);
    	checkoutPOM.ClickViewCartBtn();
    	screenShot.captureScreenShot("Seventh");
    	Thread.sleep(1000);
    	checkoutPOM.ClickCheckOutBtn();
    	screenShot.captureScreenShot("Eigth");
    	Thread.sleep(1000);
    } 

}
