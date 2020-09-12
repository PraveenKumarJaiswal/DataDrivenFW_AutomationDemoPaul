package testCases;

import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pagePanel.AddCartPagePanel;

public class AddCartTC extends BaseClass {


	@Test()
	public void addToCart() throws InterruptedException {
		AddCartPagePanel.scrollDown();
		AddCartPagePanel.mouseHoverToProduct();
		Thread.sleep(3000);
		AddCartPagePanel.clickOnAddToCartButton();
		Thread.sleep(3000);
		AddCartPagePanel.clickOnContinueShippingBtn();
		Thread.sleep(3000);
		
		AddCartPagePanel.mouseHoverToProduct();
		Thread.sleep(3000);
		AddCartPagePanel.clickOnAddToCartButton();
		Thread.sleep(3000);
		AddCartPagePanel.clickOnContinueShippingBtn();
		Thread.sleep(3000);	
		
		AddCartPagePanel.cartSize();
		
		
		
		
		/*
		WebElement productCard = driver.findElement(By.xpath("(//*[@class = 'product-image-container'])[1]"));
		WebElement addCartBtn = driver.findElement(By.xpath("(//*[contains(text(),'Add to cart')])[1]"));
		WebElement continueShipping = driver.findElement(By.xpath("//*[@class= 'icon-chevron-left left']"));
		WebElement cart = driver.findElement(By.xpath("//*[@class = 'shopping_cart']"));
		WebElement cartCount = driver.findElement(By.xpath("//*[@class = 'ajax_cart_quantity unvisible']"));
		
		Thread.sleep(2000);
		if(!addCartBtn.isDisplayed()) {
			System.out.println("Scrolling down....");
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveToElement(productCard).build().perform();
			addCartBtn.click();
			continueShipping.isDisplayed();
			continueShipping.isEnabled();
			continueShipping.click();
			System.out.println("Scrolling up....");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(800,0)");
			Thread.sleep(2000);
			System.out.println("Scrolled to top");
			//System.out.println("Cart sizr is : "+cartSize);
			Thread.sleep(2000);
			System.out.println("Scrolling down....");
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
			Thread.sleep(2000);
			
			act.moveToElement(productCard).build().perform();
			addCartBtn.click();
			continueShipping.isDisplayed();
			continueShipping.isEnabled();
			continueShipping.click();
			System.out.println("Scrolling up....");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(800,0)");
			Thread.sleep(2000);
			System.out.println("Scrolled to top");
			String cartSize = cartCount.getText();
			System.out.println("Cart sizr is : "+cartSize);
			
		
		}
		else {
			productCard.isDisplayed();
			System.out.println("Card is displayed");
		}
	}
	*/
	}

}
