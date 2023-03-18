package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPage extends BaseClass {
	
	
	
	@FindBy(xpath = "(//div[@class='cta-btn-div funnelBtn'])[2]")
	public static WebElement buyNowBtn;
	
	@FindBy(xpath = "//*[@class=\"puContent\"]/h6")
	public static WebElement popupTopGeologistReports;
	
	@FindBy(xpath = "//*[@id='cta2']")
	public static WebElement todayOnlyBuyBtn;
	
	@FindBy(xpath = "//a[@onclick='autoFill();']")
	public static WebElement clickAutoFill;
	
	@FindBy(xpath = "//*[@class = 'shopping_cart']")
	public static WebElement cart;
	
	@FindBy(xpath = "//*[@class = 'ajax_cart_quantity unvisible']")
	public static WebElement cartCount;
	
	@FindBy(xpath = "//table/tbody/tr/td[@class='cart_description']")
	public static WebElement cartDesc;	
}
