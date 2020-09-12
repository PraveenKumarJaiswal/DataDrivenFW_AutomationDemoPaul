package helper;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/**
 * Select Helper class for Selecting 
 * value from DropDown Menu.
 *
 */
public class SelectHelper {	

	/**
	 * Select by index number Starting from 0 to N
	 * 
	 * @param  element {@link WebElement}
	 * @param index {@literal int}
	 */
	public void selectByIndex(WebElement element, int index) {

		Select select = new Select(element);

		select.selectByIndex(index);

	}

	/**
	 * Select dropdwon option from visible text.
	 * 
	 * @param element {@link WebElement}
	 * @param text {@link String}
	 */
	public void selectByVisibleText(WebElement element, String text) {

		Select select = new Select(element);

		select.selectByVisibleText(text);
	}

	public int getLineNumber() {
		return Thread.currentThread().getStackTrace()[2].getLineNumber();
	}
}
