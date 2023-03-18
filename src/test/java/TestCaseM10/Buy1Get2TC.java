package TestCaseM10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.BaseClass;
import pagePanel.AddCartPagePanel;

public class Buy1Get2TC extends BaseClass {

	//@Test(enabled = true, groups = { "regression", "smoke" })
	@Test
	public void verifyBuy1Get2FlowTC() throws Throwable {
		logger.info("Running testcase: ------> Buy1Get2");
		AddCartPagePanel.scrollUntill();
				
		logger.info("Clicking on Buy1 Get2 button");
		AddCartPagePanel.clickOnBuyNowButton();
		logger.info("Click on Buy1 Get2 button");
		
		logger.info("Clicking on Today Only Buy1 Get2 button");
		AddCartPagePanel.clickOnTodayOnlyBuyButton();
		logger.info("Clicked on Today Only Buy1 Get2 button");
		
		logger.info("Clicking on AutoFillt button");
		//AddCartPagePanel.clickOnAutofill();
		AddCartPagePanel.fillForm();
		logger.info("Clicked on AutoFill button");
		
		logger.info("Clicking on Pay Now button");
		Thread.sleep(3000);
		AddCartPagePanel.clickOnPayNowBtn();
		logger.info("Clicked on Pay Now button");
		
		logger.info("Clicking on Redicilous Deal Page Yes button");
		Thread.sleep(3000);
		AddCartPagePanel.clickOnYesBtnOnOurMostRedicilousDealPage();
		logger.info("Clicked on Redicilous Deal Page Yes button");
		
		logger.info("Clicking on First Yes VitaminD button");
		Thread.sleep(3000);
		AddCartPagePanel.clickOnFirstYesBtnVitaminD();
		logger.info("Clicked on First Yes VitaminD button");
		
		logger.info("Clicking On Second Yes Btn Zinc Gap");
		Thread.sleep(3000);
		AddCartPagePanel.clickOnSecondYesBtnZincGap();
		logger.info("Clicked On Second Yes Btn Zinc Gap");
		
		
		logger.info("Verifying on Congrats Screen For B1G2 is displayed");
		Thread.sleep(3000);
		AddCartPagePanel.verifyCongratsScreenForB1G2();
		logger.info("Verified Congrats Screen For B1G2 is displayed");
		
		
		
		
		
		

		
	
	}
}
