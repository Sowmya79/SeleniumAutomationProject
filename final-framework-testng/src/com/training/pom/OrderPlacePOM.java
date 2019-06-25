package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderPlacePOM {

	private WebDriver driver;
	public OrderPlacePOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='cart']")
	private WebElement cart;
	public void ClickCartBtn() {
		Actions action = new Actions(driver);
		WebElement cart = driver.findElement(By.id("cart"));
		action.moveToElement(cart).click().perform();
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

	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email;
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	@FindBy(id="input-password")
	private WebElement password;
	public void sendPassword1(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@id='button-login']")
	private WebElement loginBtn;
	public void clickLoginBtn() {
	 this.loginBtn.click();
	}
	
	@FindBy(xpath="//*[@id='button-payment-address']")
	private WebElement continueBtn;
	public void clickContinueBtn() {
	 this.continueBtn.click();
	}
	
	@FindBy(xpath="//*[@id='button-shipping-address']")
	private WebElement shipcontinueBtn;
	public void clickShipContinueBtn() {
	 this.shipcontinueBtn.click();
	}
	
	@FindBy(name="comment")
	private WebElement addtext;
	public void sendTextInCommentBox(String addtext) {
	 this.addtext.clear();
	 this.addtext.sendKeys(addtext);
	}
	
	@FindBy(xpath="//*[@id='button-shipping-method']")
	private WebElement shipmcontinueBtn;
	public void clickShipMContinueBtn() {
	 this.shipmcontinueBtn.click();
	}
	
	@FindBy(xpath="//*[@id='collapse-payment-method']//div[2]//input[1]")
	private WebElement checkbox;
	public void clickCheckBox() {
	 this.checkbox.click();
	}
	@FindBy(xpath="//*[@id='collapse-payment-method']//div[2]//input[2]")
	private WebElement paycontinueBtn;
	public void clickPayContinueBtn() {
	 this.paycontinueBtn.click();
	}
	
	@FindBy(xpath="//*[@id='button-confirm']")
	private WebElement confirmBtn;
	public void clickConfirmOrderBtn() {
	 this.confirmBtn.click();
	}  
	
}
