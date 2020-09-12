package pagePanel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AddCartPage;
import pageObjects.BaseClass;

public class AddCartPagePanel extends BaseClass{
	AddCartPage addCartPage = new AddCartPage();
	
	public AddCartPagePanel() {
		addCartPage = PageFactory.initElements(driver, AddCartPage.class);
	}
	
	public static void scrollDown() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
		System.out.println("Scroll down...");
	}
	
	public static void scrollUp() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(document.body.scrollHeight, 0)");
		System.out.println("Scroll up...");
	}
	
	public static void mouseHoverToProduct() {
		System.out.println("Mouse hovering started...");
		//BaseClass.waitForElement(AddCartPage.productCard);
		WebElement ele = driver.findElement(By.xpath("(//*[@class = 'product-image-container'])[1]"));
		Actions act = new Actions(driver);
		System.out.println("Action class...");
		act.moveToElement(ele).build().perform();	
		System.out.println("Mouse hovering ends...");
	}
	
	public static void clickOnAddToCartButton() {
		//BaseClass.waitForElement(AddCartPage.addCartBtn);	
		System.out.println("Clicking on add cart button");
		//AddCartPage.addCartBtn.click();
		driver.findElement(By.xpath("(//*[contains(text(),'Add to cart')])[1]")).click();
		System.out.println("Clicked on add cart button");
	}
	
	public static void clickOnContinueShippingBtn() {
		driver.findElement(By.xpath("//*[@class= 'icon-chevron-left left']")).click();
		System.out.println("Clicked on back cart button");
	}
	
	public static void cartSize() {
		//BaseClass.waitForElement(AddCartPage.cartCount);
		System.out.println("Getting size of cart");
		String s = driver.findElement(By.xpath("//*[@class = 'ajax_cart_quantity unvisible']")).getText();
		System.out.println("Size of cart is :"+s);
	}
	
	


}
