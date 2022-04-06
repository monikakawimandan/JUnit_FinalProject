package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class TestPage2 {

	WebDriver driver;

	public TestPage2(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li") WebElement CLICKING_SINGLE_CHECKBOX_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@value=\"Remove\"]") WebElement REMOVE_BUTTON_ELEMENT;

	@FindBy(how = How.CSS, using = "//*[id=\"todos-content\"]/form/ul/li")
	WebElement CLICKING_SINGLE_CHECKBOX_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=\"Remove\"]")
	WebElement REMOVE_BUTTON_ELEMENT;

	public void clickOnSingleCheckBoxFromList() {
		CLICKING_SINGLE_CHECKBOX_ELEMENT.click();
	}
	
	
		public void clickingOnRemoveButton() {
			REMOVE_BUTTON_ELEMENT.click();
			
		
	}


	
	
	
	
	
	
}


