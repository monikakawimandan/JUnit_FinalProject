package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class TestPage1 {
	
	WebDriver driver;
	
	public TestPage1(WebDriver driver) {
		driver = BrowserFactory.init();
		this.driver = driver;	
				
	}
	
	
//	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@name=\"data\"]") WebElement ADD_CHECKBOX_ITEM_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@value=\"Add\"]") WebElement ADD_BUTTON;
	
	@FindBy(how = How.CSS, using = "input[name=\"allbox\"]") WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
	@FindBy(how = How.CSS, using = "input[name=\"data\"]") WebElement ADD_CHECKBOX_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=\"Add\"]") WebElement ADD_BUTTON;
	
	
	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNO = rnd.nextInt(boundaryNumber);
		return randomNO;	
	}
	
	
	

public void validateToglleAllcheckboxIsChecked() {
	TOGGLE_ALL_CHECKBOX_ELEMENT.click();
	
}

public void addingCheckboxItem(String addItem) {
	ADD_CHECKBOX_ITEM_ELEMENT.sendKeys(addItem + randomGenerator(999));
	
}

public void addButton() {
	ADD_BUTTON.click();
}







}
