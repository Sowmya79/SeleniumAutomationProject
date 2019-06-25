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
import com.training.pom.InvalidCredentialsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class InvalidCredentials {

	private static WebDriver driver;
	private static String baseUrl;
	private static InvalidCredentialsPOM invalidcredentialsPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		invalidcredentialsPOM = new InvalidCredentialsPOM(driver); 
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
	// Week2 UNF TestCase1
	@Test ()
	public void ValidLoginFunTest() throws InterruptedException {
		invalidcredentialsPOM.clickMyAccountBtn();
		invalidcredentialsPOM.clickAccLoginBtn();
		screenShot.captureScreenShot("First");
		Thread.sleep(1000);
		invalidcredentialsPOM.sendEmailAdress("sowmya99@gmail.com");
		Thread.sleep(1000);
		invalidcredentialsPOM.sendPassword("sowmy");
		Thread.sleep(1000);
		invalidcredentialsPOM.clickSubmitLoginBtn();
		screenShot.captureScreenShot("Second");
		Thread.sleep(1000);
		//uniformweek2POM.clickLogoutBtn1();
		//screenShot.captureScreenShot("Third");
		} 
	
	
    
    
    
    
}
