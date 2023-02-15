package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestParent1 {
	WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"})
	public void openChromeBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver\", \"C:\\\\Users\\\\soumy\\\\OneDrive\\\\Desktop\\\\New folder\\\\chromedriver.exe", browser);
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
			else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\soumy\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		
			}
}
}
