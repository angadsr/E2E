package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class secondTest extends BaseTest{
	
	@Test
	public static void orderTest() {
		
		driver.findElement(By.xpath(loc.getProperty("order"))).click();
	}

}
