package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GuestUserOrderPOM {

private WebDriver driver; 
	
	public GuestUserOrderPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"banner0\"]/div/a/img")
	private WebElement shopuniforms;
	public void clickShopUniforms() {
	 this.shopuniforms.click();
	}
	
	@FindBy(xpath="//div[@class='product-items']//img[@class='img-responsive']")
	private WebElement sportstshirt;
	public void clickSportsTShirt() {
	 this.sportstshirt.click();
	}
	
	@FindBy(xpath="//*[@id=\"product\"]/div[1]/span")
	private WebElement chestsize;
	public void SelectChestSize() {
		Select drpChestSize = new Select(driver.findElement(By.xpath("//*[@id=\"input-option368\"]")));
		drpChestSize.selectByVisibleText("34");
	}
	
	@FindBy(xpath="//*[@id='button-cart']")
	private WebElement addtocart;
	public void ClickAddToCartBtn() {
		this.addtocart.click();
	}
	@FindBy(xpath="//*[@id='cart']/button")
	private WebElement cart;
	public void ClickCartBtn() {
		this.cart.click();
		
	}
	
	@FindBy(xpath="//div[@id='cart']//div//a[1]")
	private WebElement viewcart;
	public void ClickViewCartBtn() {
		this.viewcart.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement checkout;
	public void ClickCheckOutBtn() {
		this.checkout.click();
	}	
	
	@FindBy(xpath="//*[@id='button-account']")
	private WebElement guestcontinue;
	public void ClickContinueBtn() {
		this.guestcontinue.click();
	}	
	
	@FindBy(xpath="//*[@id='input-payment-firstname']")
	private WebElement firstName;
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}	
	
	@FindBy(xpath="//*[@id='input-payment-lastname']")
	private WebElement lastName;
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}	
	
	@FindBy(xpath="//*[@id='input-payment-email']")
	private WebElement email;
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}	
	
	@FindBy(xpath="//*[@id='input-payment-telephone']")
	private WebElement telephone;
	public void sendTelephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}	
	
	@FindBy(xpath="//*[@id='input-payment-password']")
	private WebElement password;
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}	
	@FindBy(xpath="//*[@id='input-payment-confirm']")
	private WebElement confirm;
	public void sendConfirm(String confirm) {
		this.confirm.clear();
		this.confirm.sendKeys(confirm);
	}	
	
	@FindBy(xpath="//*[@id='input-payment-company']")
	private WebElement company;
	public void sendCompany(String company) {
		this.company.clear();
		this.company.sendKeys(company);
	}	
	
	@FindBy(id="input-payment-address-1")
	private WebElement address_1;
	public void sendAddress1(String address_1) {
		this.address_1.clear();
		this.address_1.sendKeys(address_1);
	}	
	
	@FindBy(id="input-payment-city")
	private WebElement city;
	public void sendCity(String city) {
		this.city.clear();
		this.city.sendKeys(city);
	}	
	
	@FindBy(id="input-payment-postcode")
	private WebElement postcode;
	public void sendPostcode(String postcode) {
		this.postcode.clear();
		this.postcode.sendKeys(postcode);
	}	
	
	@FindBy(id="input-payment-country")
	private WebElement country;
	public void sendCountry(String country) {
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']")));
		drpCountry.selectByVisibleText("India");
	}	
	
	@FindBy(id="input-payment-zone")
	private WebElement zone_id;
	public void sendZoneid(String zone_id) {
		Select drpZone_id = new Select(driver.findElement(By.xpath("//*[@id='input-payment-zone']")));
		drpZone_id.selectByVisibleText("Karnataka");
	}	
	
 	@FindBy(xpath="//*[@id='collapse-payment-address']//div[3]//label//input")
	private WebElement checkBox;
	public void clickCheckBox() { 
		this.checkBox.click(); 
	}
	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]//div[4]//div//input[1]")
	private WebElement checkBox1;
	public void clickTCCheckBox() {
		this.checkBox1.click();
	}	
	
	@FindBy(xpath="//*[@id='button-register']")
	private WebElement continueBtn1;
	public void clickContinueBtn1() {
		this.continueBtn1.click();
	}	
	
	
	@FindBy(css="input#button-shipping-address.btn.btn-primary")
	private WebElement ContinueBtn2;
	public void clickContinueBtn2() {
		this.ContinueBtn2.click();
	}	
	
	@FindBy(name="comment")
	private WebElement addtext;
	public void sendTextInCommentBox(String addtext1) {
	 this.addtext.clear();
	 this.addtext.sendKeys(addtext1);
	}
	
	@FindBy(xpath="//*[@id='button-shipping-method']")
	private WebElement continueBtn3;
	public void clickContinueBtn3() {
		this.continueBtn3.click();
	}	
	
	@FindBy(xpath="//*[@id='collapse-payment-method']//p[3]//textarea")
	private WebElement addtext2;
	public void sendTextInCommentBox1(String addtext2) {
	 this.addtext2.clear();
	 this.addtext2.sendKeys(addtext2);
	}
	@FindBy(xpath="//*[@id='collapse-payment-method']//div[2]//input[1]")
	private WebElement checkbox2;
	public void clickCheckbox2() {
		this.checkbox2.click();
	}	
	
	@FindBy(xpath="//*[@id='button-payment-method']")
	private WebElement continue4;
	public void clickContinueBtn4() {
		this.continue4.click();
	}	
	
	@FindBy(xpath="//*[@id='button-confirm']")
	private WebElement confirmorder;
	public void clickConfirmOrder() {
		this.confirmorder.click();
	}	
	
}



