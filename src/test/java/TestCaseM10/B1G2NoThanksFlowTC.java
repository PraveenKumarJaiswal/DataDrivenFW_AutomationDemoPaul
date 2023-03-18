package TestCaseM10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pagePanel.AddCartPagePanel;

public class B1G2NoThanksFlowTC extends BaseClass {

	//@Test(enabled = true, groups = { "regression", "smoke" })
	@Test
	public void addToverifyB1G2NoThanksFlowTC() throws Throwable {
		logger.info("Running testcase: ------> B1G2NoThanksFlow");
		AddCartPagePanel.scrollUntill();
		//Thread.sleep(8000);
		//AddCartPagePanel.clickOnPopUpBtn();
		
		
		logger.info("Clicking on BuyNow button");
		AddCartPagePanel.clickOnBuyNowButton();
		logger.info("Click on BuyNow button");
		
		logger.info("Clicking on Today Only  button");
		AddCartPagePanel.clickOnTodayOnlyBuyButton();
		logger.info("Clicked on Today Only  button");
		
		logger.info("Clicking on AutoFillt button");
		//AddCartPagePanel.clickOnAutofill();
		AddCartPagePanel.fillForm();
		logger.info("Clicked on AutoFill button");
		
		logger.info("Clicking on Pay Now button");
		Thread.sleep(3000);
		AddCartPagePanel.clickOnPayNowBtn();
		logger.info("Clicked on Pay Now button");
		

		
		logger.info("Clicking on No Additional Shipping Charges button");
		AddCartPagePanel.clickOnDeclineBtn();
		logger.info("-------1---------");
		AddCartPagePanel.clickOnDeclineBtn6Bottles();
		Thread.sleep(3000);
		logger.info("-------2---------");
		AddCartPagePanel.clickOnDeclineBtnVitaminD();
		Thread.sleep(3000);
		logger.info("-------3---------");
		AddCartPagePanel.clickOnDeclineBtnFinalOpportunity();
		Thread.sleep(3000);
		logger.info("-------4---------");
		logger.info("Clicked on No Additional Shipping Charges button");
	
		
		logger.info("Clicking on No Additional Shipping Charges button..............");
		AddCartPagePanel.clickOnNoAdditionalShippingChargesBtn();
		logger.info("Clicked on No Additional Shipping Charges button.............");
	
		logger.info("Clicking on Decline button");
		Thread.sleep(3000);
		AddCartPagePanel.clickOnDeclineBtn();
		logger.info("Clicked on Decline button");
				
	
		logger.info("Clicking on No Additional Shipping Charges button ");
		AddCartPagePanel.clickOnNoAdditionalShippingChargesBtn();
		logger.info("Clicked on No Additional Shipping Charges button ");
	
	
	}
}
