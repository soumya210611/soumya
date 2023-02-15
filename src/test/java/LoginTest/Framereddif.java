package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framereddif {
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soumy\\OneDrive\\Desktop\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	/*@Test
	public void frames() {
	driver.get("http://rediff.com");
		//by name
	driver.switchTo().frame("moneyiframe");
		String nsdString= driver.findElement(By.id("nseindex")).getText();
		System.out.println(nsdString);		
	} */
/*	@Test
	public void frames() {
		driver.get("http://rediff.com");
	//by index
		driver.switchTo().frame(0);
		String nsdString= driver.findElement(By.id("nseindex")).getText();
		System.out.println(nsdString);		
	}*/
/*	@Test
	public void frames() {
		driver.get("http://rediff.com");
		
		driver.switchTo().frame(0);
		String nsdString= driver.findElement(By.id("nseindex")).getText();
		System.out.println(nsdString);		
	}*/
	@Test
	public void frames() {
		driver.get("http://rediff.com");
		//by webElement
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
		String nsdString= driver.findElement(By.id("nseindex")).getText();
		System.out.println(nsdString);		
		} 
}
