package testCases;

import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pagePanel.AddCartPagePanel;

public class AddCartTC extends BaseClass {

	@Test()
	public void addToCart() throws Throwable {
		AddCartPagePanel.scrollDown();
		AddCartPagePanel.mouseHoverToProduct();
		Thread.sleep(1000);
		AddCartPagePanel.clickOnAddToCartButton();
		Thread.sleep(1000);
		AddCartPagePanel.clickOnContinueShippingBtn();
		Thread.sleep(1000);

		AddCartPagePanel.mouseHoverToProduct();
		Thread.sleep(1000);
		AddCartPagePanel.clickOnAddToCartButton();
		Thread.sleep(3000);
		AddCartPagePanel.proceedToCart();
		Thread.sleep(1000);
		AddCartPagePanel.getProductDetailsInCart();
	}
}
