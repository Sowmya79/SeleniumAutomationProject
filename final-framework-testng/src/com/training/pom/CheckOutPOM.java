package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPOM {

	private WebDriver driver;
	public CheckOutPOM(WebDriver driver) {
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

}
