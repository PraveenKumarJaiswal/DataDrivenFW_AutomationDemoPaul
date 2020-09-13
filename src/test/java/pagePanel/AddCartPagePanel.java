package pagePanel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AddCartPage;
import pageObjects.BaseClass;

public class AddCartPagePanel extends BaseClass {
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
		// BaseClass.waitForElement(AddCartPage.productCard);
		WebElement ele = driver.findElement(By.xpath("(//*[@class = 'product-image-container'])[1]"));
		Actions act = new Actions(driver);
		System.out.println("Action class...");
		act.moveToElement(ele).build().perform();
		System.out.println("Mouse hovering ends...");
	}

	public static void clickOnAddToCartButton() {
		BaseClass.waitForElement(AddCartPage.addCartBtn);
		System.out.println("Clicking on add cart button");
		// AddCartPage.addCartBtn.click();
		driver.findElement(By.xpath("(//*[contains(text(),'Add to cart')])[1]")).click();
		System.out.println("Clicked on add cart button");
	}

	public static void clickOnContinueShippingBtn() {
		driver.findElement(By.xpath("//*[@class= 'icon-chevron-left left']")).click();
		System.out.println("Clicked on back cart button");
	}

	public static void cartSize() {
		System.out.println("Getting size of cart");
		String s = driver.findElement(By.xpath("//*[@class = 'ajax_cart_quantity unvisible']")).getText();
		System.out.println("Size of cart is :" + s);
	}

	public static void proceedToCart() {
		System.out.println("Navigate To Cart...");
		WebElement proceed = driver.findElement(By.xpath("//*[@class = 'btn btn-default button button-medium']"));
		proceed.click();
	}

	public static void getProductDetailsInCart() throws Throwable {
		WebElement cartTitle = driver.findElement(By.xpath("//*[@id='cart_title']"));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", cartTitle);

		List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowCount = ele.size();
		System.out.println("No. of rows available in Table is: " + rowCount);
		for (int i = 0; i < rowCount; i++) {
			WebElement productName = driver
					.findElement(By.xpath("(//table/tbody/tr/td[@class='cart_description']/p/a)[1]"));
			WebElement productQuantity = driver.findElement(By.xpath(
					"(//table/tbody/tr/td[@class='cart_quantity text-center']/input[@class='cart_quantity_input form-control grey'])[1]"));
			String pName = productName.getText();
			String pQuantity = productQuantity.getAttribute("value");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("You have : " + pName + " in you cart with quantity: " + pQuantity);
			System.out.println("---------------------------------------------------------------------");
		}
	}

}
