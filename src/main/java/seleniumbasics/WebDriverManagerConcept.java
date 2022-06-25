package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		String browser = "Edge";
		WebDriver driver = null;
		
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currentURL);
		
		if(title.equals("Google") && currentURL.equals("https://www.google.com/"))
		{
			System.out.println("Title and URL are correct.");
		}
		else
		{
			System.out.println("Title and URL are incorrect");
		}
		
		//driver.close();
		driver.quit();
	}

}
