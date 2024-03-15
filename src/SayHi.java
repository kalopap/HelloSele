import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SayHi {

	public static void main(String[] args) {

		invokeChrome("https://www.google.com/");
		invokeFirefox("https://github.com/mozilla/geckodriver/releases");
		invokeEdge("https://www.microsoft.com/");
		
	}
	
	static void invokeFirefox(String url) {
		
		//FirefoxDriver driver = new FirefoxDriver();
		//for firefox driver, download geckodriver.the property is 'webdriver.gecko.driver'
		//https://github.com/mozilla/geckodriver/releases
		System.setProperty("webdriver.gecko.driver", "P:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();
	}
	
	static void invokeChrome(String url) {

		//ChromeDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver", "P:\\Selenium\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		

		driver.close(); //also there is another method driver.quit() which closes all other windows the script might have invoked

	}
	
	static void invokeEdge(String url) {
		//SafariDriver driver = new SafariDriver();
		System.setProperty("webdriver.edge.driver", "P:\\Selenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
