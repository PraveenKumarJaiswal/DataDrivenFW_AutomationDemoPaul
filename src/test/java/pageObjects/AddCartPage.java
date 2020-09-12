package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPage extends BaseClass {
	
	@FindBy(xpath = "(//*[@class = 'product-image-container'])[1]")
	public static WebElement productCard;
	
	@FindBy(xpath = "(//*[contains(text(),'Add to cart')])[1]")
	public static WebElement addCartBtn;
	
	@FindBy(xpath = "//*[@class= 'icon-chevron-left left']")
	public static WebElement continueShipping;
	
	@FindBy(xpath = "//*[@class = 'shopping_cart']")
	public static WebElement cart;
	
	@FindBy(xpath = "//*[@class = 'ajax_cart_quantity unvisible']")
	public static WebElement cartCount;
	
}
