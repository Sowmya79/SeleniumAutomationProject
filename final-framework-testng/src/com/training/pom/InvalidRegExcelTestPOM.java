package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InvalidRegExcelTestPOM {

private WebDriver driver; 
	
	public InvalidRegExcelTestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@title, 'My Account')]")
	private WebElement MyAccountBtn;
	public void clickMyAccountBtn(){
	 this.MyAccountBtn.click();
	}
	
	@FindBy(xpath="//a[contains(@title, 'My Account')]//parent::li//child::li[1]/a")
	private WebElement RegisterBtn;
	public void clickRegisterBtn() {
	 this.RegisterBtn.click();
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	public void sendTelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}
	
	@FindBy(id="input-company")
	private WebElement company;
	public void sendCompany(String company) {
		this.company.clear();
		this.company.sendKeys(company);
	}
	
	@FindBy(id="input-address-1")
	private WebElement address_1;
	public void sendAddress1(String address_1) {
		this.address_1.clear();
		this.address_1.sendKeys(address_1);
	}
	
	@FindBy(id="input-address-2")
	private WebElement address_2;
	public void sendAddress2(String address_2) {
		this.address_2.clear();
		this.address_2.sendKeys(address_2);
	}
	
	@FindBy(id="input-city")
	private WebElement city;
	public void sendCity(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}
	
	@FindBy(id="input-postcode")
	private WebElement postcode;
	public void sendPostcode(String postcode) {
		this.postcode.clear();
		this.postcode.sendKeys(postcode);
	}
	
	@FindBy(id="input-country")
	private WebElement country;
	public void sendCountry(String country) {
		//this.country.clear();
		//this.country.sendKeys();
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
		drpCountry.selectByVisibleText("India");
	}
	@FindBy(id="input-zone")
	private WebElement zone_id;
	public void sendZone_id(String zone_id) {
		//this.zone_id.clear();
		//this.zone_id.sendKeys();
		Select drpZone = new Select(driver.findElement(By.xpath("//*[@id='input-zone']")));
		drpZone.selectByVisibleText("Karnataka");
	}
	
	@FindBy(id="input-password")
	private WebElement password;
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	@FindBy(id="input-confirm")
	private WebElement confirm;
	public void sendConfirm(String confirm) {
		this.confirm.clear();
		this.confirm.sendKeys(confirm);
	}
	
	@FindBy(xpath="//*[@id='content']//fieldset[4]//label[2]//input")
	private WebElement RadioBtn;
	public void clickRadioBtn(){
	 this.RadioBtn.click();
	}
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement checkBox;
	public void clickCheckBox(){
	 this.checkBox.click();
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continueBtn;
	public void clickContinueBtn(){
	 this.continueBtn.click();
	}
	
}