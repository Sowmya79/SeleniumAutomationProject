package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.RegDBPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegDBTest {
	private WebDriver driver;
	private String baseUrl;
	private RegDBPOM regdbPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		regdbPOM = new RegDBPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void RegisterDBTest(String FirstName, String LastName, String Email, String Telephone, String Company, 
			String Address1, String Address2, String City, String Postcode, String Country, String Zone_id, 
			String Password, String Confirm) throws InterruptedException {
		// for demonstration 
       // genericMethods.getElement("login", "id"); 
				
		regdbPOM.clickMyAccountBtn();
		Thread.sleep(1000);
		regdbPOM.clickRegisterBtn();
		screenShot.captureScreenShot("Fifth");
		Thread.sleep(1000);
		regdbPOM.sendFirstName(FirstName);
		Thread.sleep(1000);
		regdbPOM.sendLastName(LastName);
		Thread.sleep(1000);
		regdbPOM.sendEmail(Email);
		Thread.sleep(1000);
		regdbPOM.sendTelephone(Telephone);
		Thread.sleep(1000);
		regdbPOM.sendCompany(Company);
		Thread.sleep(1000);
		screenShot.captureScreenShot("Sixth");
		regdbPOM.sendAddress1(Address1);
		Thread.sleep(1000);
		regdbPOM.sendAddress2(Address2);
		Thread.sleep(1000);
		regdbPOM.sendCity(City);
		Thread.sleep(1000);
		regdbPOM.sendPostcode(Postcode);
		Thread.sleep(1000);
		regdbPOM.sendCountry(Country);
		Thread.sleep(1000);
		regdbPOM.sendZone_id(Zone_id);
		Thread.sleep(1000);
		regdbPOM.sendPassword(Password);
		Thread.sleep(1000);
		regdbPOM.sendConfirm(Confirm);
		Thread.sleep(1000);
		regdbPOM.clickRadioBtn();
		Thread.sleep(1000);
		regdbPOM.clickCheckBox();
		Thread.sleep(1000);
		regdbPOM.clickContinueBtn();
		screenShot.captureScreenShot("Seventh");
		Thread.sleep(1000);
		regdbPOM.clickLogoutBtn();
		Thread.sleep(1000);
		screenShot.captureScreenShot("Eight");
	   } 

	}

