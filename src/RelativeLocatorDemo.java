import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement alertButton = driver.findElement(By.cssSelector("input[id='alertbtn']"));
		
		WebElement text = driver.findElement(RelativeLocator.with(By.id("name")).above(alertButton));
		Thread.sleep(2000);		
		text.sendKeys("abhay");
		
		WebElement confirmButton = driver.findElement(RelativeLocator.with(By.id("confirmbtn")).below(text));
		Thread.sleep(2000);
		confirmButton.click();
		driver.switchTo().alert().accept();
		driver.quit();
	}
}