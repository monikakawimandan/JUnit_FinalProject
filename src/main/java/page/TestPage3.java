package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage3 {

	WebDriver driver;

	public TestPage3(WebDriver driver) {
		this.driver = driver;

	}

	/*
	 * @FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement
	 * TOGGLEALL_CBHECKBOX_ELEMNT;
	 * 
	 * @FindBy(how =How.XPATH, using = "//input[@value='Remove']") WebElement
	 * REMOVE_BUTTON;
	 */

	@FindBy(how = How.CSS, using = "input[value='on']")
	WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;

	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement REMOVE_BUTTON;

	public void toggleCheckboxElement() {
		TOGGLE_ALL_CHECKBOX_ELEMENT.click();
		

	}
	
	public void clickOnRemoveButton() {
		 REMOVE_BUTTON.click();
	}
	
	
}
