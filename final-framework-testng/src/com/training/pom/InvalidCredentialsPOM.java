package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InvalidCredentialsPOM {
private WebDriver driver; 
	
	public InvalidCredentialsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Week2 UNF TestCase1
  @FindBy(xpath="//a[contains(@title, 'My Account')]")
	private WebElement MyAccountBtn;
	public void clickMyAccountBtn(){
	 this.MyAccountBtn.click();
	}

	@FindBy(xpath="//a[contains(@title, 'My Account')]//parent::li//child::li[2]/a")
	private WebElement AccLoginBtn;
	public void clickAccLoginBtn() {
	 this.AccLoginBtn.click();
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailaddress;
	public void sendEmailAdress(String emailaddress) {
		this.emailaddress.clear();
		this.emailaddress.sendKeys(emailaddress);
	}
	
	@FindBy(id="input-password")
	private WebElement password;
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn;
	public void clickSubmitLoginBtn() {
	 this.loginBtn.click();
	}
	
 	@FindBy(xpath="//*[@id='column-right']/div/div[2]/a[12]")
	private WebElement LogoutBtn;
	public void clickLogoutBtn() {
	 this.LogoutBtn.click();
	}  
	
}
