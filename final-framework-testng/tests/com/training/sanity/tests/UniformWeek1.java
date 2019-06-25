package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.UniformPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class UniformWeek1 {

	private static WebDriver driver;
	private static String baseUrl;
	private static UniformPOM uniformPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		uniformPOM = new UniformPOM(driver); 
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
	
	//UFM_01 TestCase
	@Test (priority=1)
	public void validRegFunTest() throws InterruptedException {
	uniformPOM.clickMyAccountBtn();
	Thread.sleep(1000);
	uniformPOM.clickRegisterBtn();
	screenShot.captureScreenShot("First");
	Thread.sleep(1000);
	uniformPOM.sendFirstName("Sowmya");
	Thread.sleep(1000);
	uniformPOM.sendLastName("Y");
	Thread.sleep(1000);
	uniformPOM.sendEmail("sowmya99@gmail.com");
	Thread.sleep(1000);
	uniformPOM.sendTelephone("7395903715");
	Thread.sleep(1000);
	uniformPOM.sendCompany("IBM");
	Thread.sleep(1000);
	screenShot.captureScreenShot("Second");
	uniformPOM.sendAddress1("Manyata Tech Park");
	Thread.sleep(1000);
	uniformPOM.sendAddress2("D2 Block");
	Thread.sleep(1000);
	uniformPOM.sendCity("Bangalore");
	Thread.sleep(1000);
	uniformPOM.sendPostcode("560045");
	Thread.sleep(1000);
	uniformPOM.sendCountry("India");
	Thread.sleep(1000);
	uniformPOM.sendZone_id("Karnataka");
	Thread.sleep(1000);
	uniformPOM.sendPassword("sowmya");
	Thread.sleep(1000);
	uniformPOM.sendConfirm("sowmya");
	Thread.sleep(1000);
	uniformPOM.clickRadioBtn();
	Thread.sleep(1000);
	uniformPOM.clickCheckBox();
	Thread.sleep(1000);
	uniformPOM.clickContinueBtn();
	screenShot.captureScreenShot("Third");
	Thread.sleep(1000);
	uniformPOM.clickLogoutBtn();
	Thread.sleep(1000);
	screenShot.captureScreenShot("Fourth");
   } 
	
	//UFM_02 TestCase
	@Test (priority=2)
	public void ValidLoginFunTest() throws InterruptedException {
		screenShot.captureScreenShot("Fifth");
		uniformPOM.clickLoinBtn();
		Thread.sleep(1000);
		uniformPOM.sendEmailAdress("sowmya99@gmail.com");
		Thread.sleep(1000);
		uniformPOM.sendPassword1("sowmya");
		Thread.sleep(1000);
		uniformPOM.clickSubmitLoginBtn();
		screenShot.captureScreenShot("Sixth");
		Thread.sleep(1000);
		uniformPOM.clickLogoutBtn1();
		screenShot.captureScreenShot("Seventh");
		}

	//UFM_03 TestCase
	@Test (priority=3)
	public void ValidRecoverPasswordTest() throws InterruptedException {
		uniformPOM.clickLoinBtn();
		Thread.sleep(1000);
		uniformPOM.sendEmailAdress1("sowmya99@gmail.com");
		Thread.sleep(1000);
		uniformPOM.sendPassword2("sow");
		Thread.sleep(1000);
		uniformPOM.clickSubmitLogin1Btn();
		Thread.sleep(1000);
		screenShot.captureScreenShot("Eigth");
		Thread.sleep(1000);
		uniformPOM.clickForgottenPassword();
		uniformPOM.sendEmailAdress2("sowmya99@gmail.com");
		screenShot.captureScreenShot("Ninth");
		Thread.sleep(1000);
		uniformPOM.clickContinueBtn1();
		screenShot.captureScreenShot("Tenth");
		
		
	}
}




