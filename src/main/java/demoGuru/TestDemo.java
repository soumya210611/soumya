package demoGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestDemo {
WebDriver driver;
	
	//By username = By.name("userName");
	//By password = By.name("password");
	//By login = By.name("submit");
@FindBy(xpath="//input{contains(@name,'userName')]")
WebElement username;

		public TestDemo(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void Login() {
		//driver.get("https://demo.guru99.com/test/upload/");
		//driver.findElement(username).sendKeys("username");
		//driver.findElement(password).sendKeys("password");
		//driver.findElement(login).click();
		username.click();
		//driver.close();
		
}
	
}
