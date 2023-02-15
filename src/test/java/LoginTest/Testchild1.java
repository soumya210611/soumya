package LoginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import demoGuru.TestBase1;
import demoGuru.TestDemo;

public class Testchild1 extends TestParent1{
	//@Test
	public void logedin() {
		 
			 //driver.get("https://demo.guru99.com/test/newtours/");
			  //driver.findElement(By.name("userName")).sendKeys("username");
			  //driver.findElement(By.name("password")).sendKeys("password");
			 // driver.findElement(By.name("submit")).click();  
		  }
	
	//@Test
	public void logindemo() {
		
		TestDemo signin=new TestDemo(driver);
		signin.Login();
	}
	/*@Test
	public void newsignup() {
		 driver.get("https://demo.guru99.com/test/newtours/");
		TestBase1 logupBase1=new TestBase1(driver);
		logupBase1.signup();
	}*/
	@Test
	public void newsignup() {
		 driver.get("https://demo.guru99.com/test/newtours/");
		TestBase1 logupBase1=new TestBase1(driver);
		logupBase1.signup("soumya","passrd22");
	}
	@Test
	public void setuplog() {
		 driver.get("https://demo.guru99.com/test/newtours/");
		TestBase1 logupBase1=new TestBase1(driver);
		logupBase1.signup("demo","guru");
	}
}
	

