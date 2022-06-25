package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * This method will initialise the driver based on browser provided
	 * @param browserName
	 * @return driver
	 */
	public WebDriver initDriver(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "fireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		return driver;
	}
	
	/**
	 * This method will return the title of the current page
	 * @return title of the page
	 */
	public String getTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method will return the current page URL
	 * @return URL
	 */
	public String getPageUrl(){
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method will close the browser/driver
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	/**
	 * This method will quit the browser/driver
	 */
	public void quitBrowser() {
		driver.quit();
	}

}
