package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TestPage2;
import util.BrowserFactory;


public class Test2 {
	
	WebDriver driver;
	
	public void userIsAbleToremoveSingleListItem() throws InterruptedException {
		driver = BrowserFactory.init();
	
	
	TestPage2 t2 = PageFactory.initElements(driver, TestPage2.class);
	
	t2.clickOnSingleCheckBoxFromList();
	t2.clickingOnRemoveButton();
	
	System.out.println("Single List item IS Removed");
	
	Thread.sleep(2000);
	
	BrowserFactory.tearDown();
	
	}

	
}
