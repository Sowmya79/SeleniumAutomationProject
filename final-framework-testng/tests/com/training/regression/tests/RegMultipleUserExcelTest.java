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
import com.training.pom.RegMultipleUserExcelPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegMultipleUserExcelTest {

	private static WebDriver driver;
	private static String baseUrl;
	private static RegMultipleUserExcelPOM RegMultipleUserExcelPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

	@BeforeMethod
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		RegMultipleUserExcelPOM = new RegMultipleUserExcelPOM(driver);
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
	public void MultipleUserRegTest(String FirstName, String LastName, String Email, String Telephone, String Company, 
			String Address1, String Address2, String City, String Postcode, String Country, String Zone_id, 
			String Password, String Confirm )throws InterruptedException {
		RegMultipleUserExcelPOM.clickMyAccountBtn();
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.clickRegisterBtn();
		screenShot.captureScreenShot("First");
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendFirstName(FirstName);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendLastName(LastName);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendEmail(Email);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendTelephone(Telephone);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendCompany(Company);
		Thread.sleep(1000);
		screenShot.captureScreenShot("Second");
		RegMultipleUserExcelPOM.sendAddress1(Address1);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendAddress2(Address2);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendCity(City);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendPostcode(Postcode);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendCountry(Country);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendZone_id(Zone_id);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendPassword(Password);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.sendConfirm(Confirm);
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.clickRadioBtn();
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.clickCheckBox();
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.clickContinueBtn();
		screenShot.captureScreenShot("Third");
		Thread.sleep(1000);
		RegMultipleUserExcelPOM.clickLogoutBtn();
		Thread.sleep(1000);
		screenShot.captureScreenShot("Fourth");
	   } 

	}



