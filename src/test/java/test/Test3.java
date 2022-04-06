package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TestPage3;
import util.BrowserFactory;


public class Test3 {
	
	WebDriver driver;
	
	@Test
	public void userIsAbleToremoveAllTheListItemsWithRemoveButton() throws InterruptedException {
		driver = BrowserFactory.init();
	
	
	TestPage3 t3 = PageFactory.initElements(driver, TestPage3.class);
	
	t3.toggleCheckboxElement();
	
	t3.clickOnRemoveButton();
	
	System.out.println("All list items is removed using the remove button and when Toggle All functionality is on.");
	
	Thread.sleep(2000);
	
	BrowserFactory.tearDown();

}
}
