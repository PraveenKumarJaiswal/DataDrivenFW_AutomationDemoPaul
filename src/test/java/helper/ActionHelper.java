package helper;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Action Hepler for interaction with GUI.
 *
 */
public class ActionHelper {
	WebDriverWait wait;
	Actions action;

	/**
	 * Paramerterize constructor
	 * 
	 * @param driver {@link WebDriver}
	 */
	public ActionHelper(WebDriver driver) {
		wait = new WebDriverWait(driver, 20);
		action = new Actions(driver);
	}

	/**
	 * Drag And Drop The Element
	 * 
	 * @param source {@link WebElement}
	 * @param target {@link WebElement}
	 */
	public void DragAndDrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target);

	}
	/**
	 * Mouse Hover to the element
	 * @param pass element {@link WebElement} to move to element.
	 */
	public void moveToElement(WebElement element) {
		
		action.moveToElement(element).build().perform();
	}
	
	public void clickOn(WebElement target) {
		action.moveToElement(target).click().perform();
	}
	
	
	public void clickOnByOffSet(WebElement Element) {
		Point p= Element.getLocation();

		action.moveToElement(Element).moveByOffset(p.x,p.y).click().perform();
	}
	
	public void waitForElement(WebElement ele) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			System.out.println("wait for element ele value" + ele);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Element doesn't exist verify it...!!!");
		}
	}
}
