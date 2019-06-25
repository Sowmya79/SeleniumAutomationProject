package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniformPOM {

private WebDriver driver; 
	
	public UniformPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//UFM_01 TestCase
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
	
	@FindBy(xpath="//*[@id='column-right']/div/div[2]/a[12]")
	private WebElement LogoutBtn;
	public void clickLogoutBtn() {
	 this.LogoutBtn.click();
	} 
	
	//UFM_02 Test Case
	@FindBy(xpath="//*[@id='column-right']/div/div[2]/a[1]")
	private WebElement LoginBtn;
	public void clickLoinBtn() {
	 this.LoginBtn.click();
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailaddress;
	public void sendEmailAdress(String emailaddress) {
		this.emailaddress.clear();
		this.emailaddress.sendKeys(emailaddress);
	}
	
	@FindBy(id="input-password")
	private WebElement password1;
	public void sendPassword1(String password1) {
		this.password1.clear();
		this.password1.sendKeys(password1);
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn;
	public void clickSubmitLoginBtn() {
	 this.loginBtn.click();
	}
	
	@FindBy(xpath="//*[@id='column-right']/div/div[2]/a[12]")
	private WebElement LogoutBtn1;
	public void clickLogoutBtn1() {
	 this.LogoutBtn1.click();
	} 
	
	// UFM_03 TestCase
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailaddress1;
	public void sendEmailAdress1(String emailaddress1) {
		this.emailaddress1.clear();
		this.emailaddress1.sendKeys(emailaddress1);
	}
	
	@FindBy(id="input-password")
	private WebElement password2;
	public void sendPassword2(String password2) {
		this.password1.clear();
		this.password1.sendKeys(password2);
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement login1Btn;
	public void clickSubmitLogin1Btn() {
	 this.login1Btn.click();
	}
	
	@FindBy(xpath="//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
	private WebElement forgottenPassword;
	public void clickForgottenPassword() {
		this.forgottenPassword.click();
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailaddress2;
	public void sendEmailAdress2(String emailaddress2) {
		this.emailaddress2.clear();
		this.emailaddress2.sendKeys(emailaddress2);
	}
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continueBtn1;
	public void clickContinueBtn1() {
	 this.continueBtn1.click();
	}
	
}
