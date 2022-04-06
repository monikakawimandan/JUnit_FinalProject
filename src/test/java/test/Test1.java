package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TestPage1;
import util.BrowserFactory;



public class Test1 {
	
	WebDriver driver;
	
	@Test
	public void userClickinOnToggleCheckBox(String addItem) throws InterruptedException {
		driver = BrowserFactory.init();
	

	
	TestPage1 t1 = PageFactory.initElements(driver, TestPage1.class);
	
	t1.validateToglleAllcheckboxIsChecked();
	t1.addingCheckboxItem (addItem);
	t1.addButton();
	
	
	
	System.out.println("All checkboxes are checked");
	
	BrowserFactory.tearDown();
	
}
	
	
}
