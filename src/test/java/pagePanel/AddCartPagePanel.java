package pagePanel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageObjects.AddCartPage;
import pageObjects.BaseClass;


public class AddCartPagePanel extends BaseClass {
	AddCartPage addCartPage = new AddCartPage();

	public AddCartPagePanel() {
		addCartPage = PageFactory.initElements(driver, AddCartPage.class);
	}

	public static void scrollUntill() throws Throwable {
		WebElement element = driver.findElement(By.xpath("(//span[@class='btnMain funnelBtn'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}

	public static void clickOnPopUpBtn() throws Throwable {
		Thread.sleep(10000);
		logger.info("waiting for popup.....");
		Thread.sleep(10000);
		try {
			AddCartPage.popupTopGeologistReports.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void clickOnBuyNowButton() {
		WebElement ele = driver.findElement(By.xpath("(//div[@class='cta-btn-div funnelBtn'])[2]/a/div"));
		ele.click();

	}

	public static void clickOnAutofill() {
		driver.findElement(By.xpath("//a[@onclick='autoFill();']")).click();
	}
	
	public static void fillForm() {
		WebElement fn = driver.findElement(By.id("firstName"));
		
		fn.click();
		fn.clear();
		fn.sendKeys("Ana");
		
		WebElement ln = driver.findElement(By.id("lastName"));
		
		ln.click();
		ln.clear();
		ln.sendKeys("lodes");
		
		WebElement phone = driver.findElement(By.id("phone"));
		phone.click();
		phone.clear();
		phone.sendKeys("667 555-0151");
		
		WebElement email = driver.findElement(By.id("email"));
		email.click();
		email.clear();
		email.sendKeys("Ana@example.com");
		
		
		WebElement address = driver.findElement(By.id("address"));
		address.click();
		address.sendKeys("754 Nolan Prairie");
		
		WebElement city = driver.findElement(By.id("city"));
		city.click();
		city.sendKeys("Ankeny");
		
		WebElement state = driver.findElement(By.id("state"));
        Select selectState = new Select(state);
        selectState.selectByIndex(2);
        
		
		WebElement zipCode = driver.findElement(By.id("postalCode"));
		zipCode.click();
		zipCode.sendKeys("35005");
		
		
		WebElement cardNumber = driver.findElement(By.id("cardNumber"));
		cardNumber.click();
		cardNumber.sendKeys("4556312207616615");
		
		WebElement cvvNumber = driver.findElement(By.id("cvv"));
		cvvNumber.click();
		cvvNumber.sendKeys("246");
		
		WebElement cardMonth = driver.findElement(By.id("cardMonth"));
        Select selectMonth = new Select(cardMonth);
        selectMonth.selectByIndex(6);
        
        WebElement cardYear = driver.findElement(By.id("cardYear"));
        Select selectYear = new Select(cardYear);
        selectYear.selectByIndex(7);
        
	
		
		
		
		WebElement total = driver.findElement(By.xpath("(//*[contains(text(),'Order Total:')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", total);
	}

	public static void clickOnTodayOnlyBuyButton() {
		driver.findElement(By.xpath("//*[@id='cta2']")).click();
	}

	public static void clickOnPayNowBtn() {
		WebElement payNowBtn = driver.findElement(By.xpath("//span[@class='funnelBtn paynow']"));
		payNowBtn.click();
	}

	public static void clickOnNoAdditionalShippingChargesBtn() {
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement shippingCharges = driver.findElement(By.xpath("(//*[contains(text(),'No additional shipping charges!')])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		shippingCharges.click();
	}
	
	public static void clickOnNoAdditionalShippingChargesBtn2() {
		WebElement shippingCharges = driver.findElement(By.xpath("(//*[contains(text(),'No additional shipping charges!')])"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", shippingCharges);
		shippingCharges.click();
	}
	
	public static void clickOnDeclineBtn() {
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement declineLink = driver.findElement(By.xpath("(//*[contains(text(),'Opportunity to Stock-Up and Save Today')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}
	
	public static void clickOnDeclineBtn6Bottles() {
		WebElement sixBottles = driver.findElement(By.xpath("//h2[contains(text(),'6 Bottles Too Much?')]"));
		sixBottles.isDisplayed();	
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[1]"));
		WebElement declineLink = driver.findElement(By.xpath("//*[contains(text(),'Pass on This One-Time Opportunity to ')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}
	
	
	public static void clickOnDeclineBtnVitaminD() {
		WebElement vitaminDHeadling = driver.findElement(By.xpath("(//h2[contains(text(),'Vitamin D')])[1]"));
		vitaminDHeadling.isDisplayed();		
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement declineLink = driver.findElement(By.xpath("(//*[contains(text(),'Opportunity to Stock-Up and Save Today')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}
	
	public static void clickOnFirstYesBtnVitaminD() {
		WebElement vitaminDHeadling = driver.findElement(By.xpath("(//h2[contains(text(),'Vitamin D')])[1]"));
		vitaminDHeadling.isDisplayed();		
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement yesBtn = driver.findElement(By.xpath("(//*[@class=\"cta-btn funnelBtn ctaContainer\"])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		yesBtn.click();
	}
	
	public static void clickOnSecondYesBtnZincGap() {
		WebElement zincGapHeadline = driver.findElement(By.xpath("//h2[contains(text(),'Zinc Gap')]"));
		zincGapHeadline.isDisplayed();		
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[2]"));
		WebElement yesBtn2 = driver.findElement(By.xpath("(//*[@class=\"cta-btn funnelBtn ctaContainer\"])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		yesBtn2.click();
	}
	
	public static void clickOnDeclineBtnFinalOpportunity() {
		WebElement sixBottles = driver.findElement(By.xpath("//h2[contains(text(),'Final Opportunity to \"Stock Up & Save\"!')]"));
		sixBottles.isDisplayed();
		WebElement bACKGUARANTEE = driver.findElement(By.xpath("(//*[contains(text(),'60-Day Money Back Guarantee*')])[1]"));
		WebElement declineLink = driver.findElement(By.xpath("(//*[contains(text(),'Opportunity to Stock-Up and Save Today ')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bACKGUARANTEE);
		declineLink.click();
	}
	
	//  
			
	public static void clickOnYesBtnOnOurMostRedicilousDealPage() {
		WebElement redicilousDealPage = driver.findElement(By.xpath("//h2[contains(text(),'Our Most Ridiculous Deal Yet!')]"));
		redicilousDealPage.isDisplayed();
		WebElement yesBtn = driver.findElement(By.xpath("(//div[@class=\"cta-btn funnelBtn ctaContainer\"])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesBtn);
		yesBtn.click();
	}

	public static void verifyCongratsScreenForB1G2() {
		WebElement congratulationsLink = driver.findElement(By.xpath("//h2[contains(text(),'Congratulations')]"));
		congratulationsLink.isDisplayed();
	}
	
	
	
	public static void validateBillingItems() {
		// Find the table of items and prices on the page
        WebElement table = driver.findElement(By.xpath("//table[@class=\"base-table\"]/tbody"));

        // Find all the rows in the table except for the last one, which is the total row
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        rows.remove(rows.size() - 1);

        // Calculate the total cost of all items in the table
        double totalCost = 0;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            double price = Double.parseDouble(cells.get(1).getText().replaceAll("[^\\d.]", ""));
            totalCost += price;
        }

        // Find the total row in the table and get the expected total cost
        WebElement totalRow = rows.get(rows.size() - 1);
        double expectedTotalCost = Double.parseDouble(totalRow.findElement(By.tagName("td")).getText().replaceAll("[^\\d.]", ""));

        // Compare the expected and actual total costs and output the result
        if (Math.abs(totalCost - expectedTotalCost) < 0.01) {
            System.out.println("Purchase billing total is valid.");
        } else {
            System.out.println("Purchase billing total is not valid.");
        }
	}
	
	
	
	
	
	
	public static void clickNoThanksToReachCongratsScreen() {

		WebElement declineLink = driver.findElement(By.xpath("//*[@cta-name='Decline']"));
		WebElement congratulationsLink = driver.findElement(By.xpath("//h2[contains(text(),'Congratulations')]"));
		String s = congratulationsLink.getText();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", declineLink);
			
		 while (!congratulationsLink.isDisplayed()) 
		 {
				
			 declineLink.click();
	     }
	}
	
	
	 public static boolean isTextPresent(String text) {
	        try {
	        	WebElement congratulationsLink = driver.findElement(By.xpath("//h2[contains(text(),'Congratulations')]"));
	            return congratulationsLink.getText().contains(text);
	        } catch (Exception e) {
	            return false;
	        }
	    }
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void scrollUp() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(document.body.scrollHeight, 0)");
		logger.info("Scroll up...");
	}

	public static void scrollDown() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
		logger.info("Scroll down...");
	}

	public static void mouseHoverToProduct() {
		logger.info("Mouse hovering started...");
		// BaseClass.waitForElement(AddCartPage.productCard);
		WebElement ele = driver.findElement(By.xpath("(//*[@class = 'product-image-container'])[1]"));
		Actions act = new Actions(driver);
		logger.info("Action class...");
		act.moveToElement(ele).build().perform();
		logger.info("Mouse hovering ends...");
	}

	public static void clickOnContinueShippingBtn() {
		driver.findElement(By.xpath("//*[@class= 'icon-chevron-left left']")).click();
		logger.info("Clicked on back cart button");
	}

	public static void cartSize() {
		logger.info("Getting size of cart");
		String s = driver.findElement(By.xpath("//*[@class = 'ajax_cart_quantity unvisible']")).getText();
		logger.info("Size of cart is :" + s);
	}

	public static void proceedToCart() {
		logger.info("Navigate To Cart...");
		WebElement proceed = driver.findElement(By.xpath("//*[@class = 'btn btn-default button button-medium']"));
		proceed.click();
	}

	public static void getProductDetailsInCart() throws Throwable {
		WebElement cartTitle = driver.findElement(By.xpath("//*[@id='cart_title']"));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", cartTitle);

		List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowCount = ele.size();
		logger.info("No. of rows available in Table is: " + rowCount);
		for (int i = 0; i < rowCount; i++) {
			WebElement productName = driver
					.findElement(By.xpath("(//table/tbody/tr/td[@class='cart_description']/p/a)[1]"));
			WebElement productQuantity = driver.findElement(By.xpath(
					"(//table/tbody/tr/td[@class='cart_quantity text-center']/input[@class='cart_quantity_input form-control grey'])[1]"));
			String pName = productName.getText();
			String pQuantity = productQuantity.getAttribute("value");
			logger.info("---------------------------------------------------------------------");
			logger.info("You have : " + pName + " in you cart with quantity: " + pQuantity);
			logger.info("---------------------------------------------------------------------");
		}
	}

}
