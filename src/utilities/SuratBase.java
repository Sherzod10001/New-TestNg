package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SuratBase {
	
	static String driverPath = "C:\\webdrivers";
	public static WebDriver driver;
	static String browserType = "chrome";
	
	public static WebDriver getBrowser()     {
		switch (browserType) {
		case"chrome":
			System.setProperty("webdriver.chrome.driver", driverPath +"\\chromedriver.exe");
			return driver = new ChromeDriver();
			
		case"firefox":
			System.setProperty("webdriver.gecko.driver", driverPath +"\\geckodriver.exe");
			return driver = new FirefoxDriver();
			
		case"IE":
			System.setProperty("webdriver.ie.driver", driverPath +"\\IEDriverServer.exe");
			return driver = new InternetExplorerDriver();
		default:
			System.out.println("Browser : " + browserType + " is invalid, Launching Chrome as browser of choice..");
			
			
		}
		return driver;
	}

}
