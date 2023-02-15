package demoGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBase1 {
	WebDriver driver;
	@FindBy(name = "userName")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "submit")
	WebElement submit;
	public TestBase1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	//public void signup() {
		//username.sendKeys("username");
		//password.sendKeys("password");
		//submit.click();
		
	//}
	public void signup(String username1,String password1) {
		username.sendKeys(username1);
		password.sendKeys(password1);
		submit.click();
		//trying something new to learn git
	}

}
