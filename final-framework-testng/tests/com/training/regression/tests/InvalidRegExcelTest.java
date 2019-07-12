package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.InvalidRegExcelTestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class InvalidRegExcelTest {

	private static WebDriver driver;
	private static String baseUrl;
	private static InvalidRegExcelTestPOM InvalidRegExcelTestPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

	@BeforeMethod
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		InvalidRegExcelTestPOM = new InvalidRegExcelTestPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void InvalidRegTest(String FirstName, String LastName, String Email, String Telephone, String Company, 
			String Address1, String Address2, String City, String Postcode, String Country, String Zone_id, 
			String Password, String Confirm )throws InterruptedException {
		InvalidRegExcelTestPOM.clickMyAccountBtn();
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.clickRegisterBtn();
		screenShot.captureScreenShot("First");
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendFirstName(FirstName);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendLastName(LastName);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendEmail(Email);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendTelephone(Telephone);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendCompany(Company);
		Thread.sleep(1000);
		screenShot.captureScreenShot("Second");
		InvalidRegExcelTestPOM.sendAddress1(Address1);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendAddress2(Address2);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendCity(City);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendPostcode(Postcode);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendCountry(Country);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendZone_id(Zone_id);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendPassword(Password);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.sendConfirm(Confirm);
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.clickRadioBtn();
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.clickCheckBox();
		Thread.sleep(1000);
		InvalidRegExcelTestPOM.clickContinueBtn();
		screenShot.captureScreenShot("Third");
		Thread.sleep(1000);
		screenShot.captureScreenShot("Fourth");
	   } 

	}



