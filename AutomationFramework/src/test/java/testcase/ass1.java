package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ass1 {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.tenforce.com/");
	Thread.sleep(2000);
	WebElement about= driver.findElement(By.xpath("//ul[@class=\"tf-navbar__main-nav tf-navbar__main-nav--main\"]//child::span[text()='About Us']"));
	Actions act=new Actions(driver);
	act.moveToElement(about);
	Thread.sleep(55000);
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.tf-navbar__inner-nav a[href='/career']")));
	//driver.findElement(By.xpath("//a[text()='Career']")).click();
	driver.findElement(By.cssSelector("ul.tf-navbar__inner-nav a[href='/career']")).click();
	driver.findElement(By.xpath("//a[@data-type=\"people\"]")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//span[text()='Life of two interns']")).click();
//	JavascriptExecutor js = new (JavascriptExecutor) driver;
//	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	act.sendKeys(Keys.END).perform();
	
	act.moveToElement(about);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Career']")).click();
	
	
	String expected=driver.findElement(By.xpath("Feel free to send your CV to")).getText();
	String actual="Feel free to send your CV to job";
	if (expected.equalsIgnoreCase(actual)) {
		System.out.println("Test case pased");
		
	}
	else{
		System.out.println("Test case failed");
		
	}
	
	
	}

}
