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
import com.training.pom.GuestUserOrderPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GuestUserOrder {

	private static WebDriver driver;
	private static String baseUrl;
	private static GuestUserOrderPOM guestuserorderPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		guestuserorderPOM = new GuestUserOrderPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		guestuserorderPOM = new GuestUserOrderPOM(driver); 
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
	
	@Test()
    public void GuestUserTest() throws InterruptedException {
    	guestuserorderPOM.clickShopUniforms();
    	Thread.sleep(3000);
    	guestuserorderPOM.clickSportsTShirt();
    	screenShot.captureScreenShot("Eighteen");
    	Thread.sleep(3000);
    	guestuserorderPOM.SelectChestSize();
    	guestuserorderPOM.ClickAddToCartBtn();
    	screenShot.captureScreenShot("Nineteen");
    	Thread.sleep(3000);
    	guestuserorderPOM.ClickCartBtn();
    	guestuserorderPOM.ClickViewCartBtn();
    	guestuserorderPOM.ClickCheckOutBtn();
    	screenShot.captureScreenShot("Twenty");
    	Thread.sleep(3000);
    	guestuserorderPOM.ClickContinueBtn();
    	Thread.sleep(3000);
    	guestuserorderPOM.sendFirstName("Abhi");
    	guestuserorderPOM.sendLastName("N");
    	Thread.sleep(3000);
    	guestuserorderPOM.sendEmail("abhi223@gmail.com");
    	guestuserorderPOM.sendTelephone("7395903716");
    	Thread.sleep(3000);
    	guestuserorderPOM.sendPassword("abhi");
    	guestuserorderPOM.sendConfirm("abhi");
    	guestuserorderPOM.sendCompany("IBM");
    	screenShot.captureScreenShot("Twenty one");
    	Thread.sleep(3000);
    	guestuserorderPOM.sendAddress1("Manyata");
    	guestuserorderPOM.sendCity("Bangalore");
    	guestuserorderPOM.sendPostcode("560045");
    	Thread.sleep(3000);
    	guestuserorderPOM.sendCountry("India");
    	guestuserorderPOM.sendZoneid("Karnataka");
    	screenShot.captureScreenShot("Twenty two");
    	Thread.sleep(3000);
    	//uniformweek2POM.clickCheckBox();
    	guestuserorderPOM.clickTCCheckBox();
    	screenShot.captureScreenShot("Twenty three");
    	Thread.sleep(3000);
    	guestuserorderPOM.clickContinueBtn1();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,-1000)");
    	Thread.sleep(3000);
    	guestuserorderPOM.clickContinueBtn2();
    	Thread.sleep(3000);
    	guestuserorderPOM.sendTextInCommentBox("Please Deliver the order between 7AM to 10PM");
    	screenShot.captureScreenShot("Twenty Four");
    	Thread.sleep(3000);
    	guestuserorderPOM.clickContinueBtn3();
    	screenShot.captureScreenShot("Twenty Five");
    	Thread.sleep(3000);
    	guestuserorderPOM.sendTextInCommentBox1("Yes");
    	screenShot.captureScreenShot("Twenty Six");
    	Thread.sleep(3000);
    	guestuserorderPOM.clickCheckbox2();
    	guestuserorderPOM.clickContinueBtn4();
    	Thread.sleep(3000);
    	guestuserorderPOM.clickConfirmOrder();
    	screenShot.captureScreenShot("Twenty Seven");
    	Thread.sleep(3000);
    	
    }
    

}


