package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ass1 {

	public static void main(String[] args) {

	System.out.println("Hello");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("hello text");
	driver.findElement(By.xpath("//span[@class=\"ytIconWrapperHost\"]/parent::button")).click();
	
	}

}
