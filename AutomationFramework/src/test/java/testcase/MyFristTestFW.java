package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFristTestFW extends BaseTest{
	
	@Test 
	public static void LoginTest()  {
		driver.findElement(By.id(loc.getProperty("email"))).sendKeys("happy1@gmail.com");
		driver.findElement(By.id(loc.getProperty("password"))).sendKeys("Happy@123");
		driver.findElement(By.id(loc.getProperty("login_button"))).click();
		

		
		
		
		
	}

}
