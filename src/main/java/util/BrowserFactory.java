package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BrowserFactory {

	static WebDriver driver;
	static String browser;
	static String url;

	@BeforeClass
	public void readConfif() {

		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.Properties");
			Properties prop = new Properties();
			prop.load(input);

			browser = prop.getProperty("browser");
			System.out.println("Browser used" + browser);

			url = prop.getProperty("url");
			System.out.println("url used" + url);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	@BeforeMethod
	public static WebDriver init() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", ".Drivers\\MicrosoftEdge\\msedgedriver.exe");
			driver = new EdgeDriver();	
		}
		
		System.setProperty("webdriver.chrome.driver", ".Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("url");
		
		
		System.setProperty("webdriver.chrome.driver", ".Drivers\\\\MicrosoftEdge\\\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("url");
        return driver;
        
}

	@AfterMethod
	public static void tearDown() {
		driver.close();
		driver.quit();

	}
}
