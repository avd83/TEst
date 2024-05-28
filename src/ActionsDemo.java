import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {
	//contextClick,doubleClick,dragandDrop,clickAndHold,sendKeys,KeyUp,KeyDown

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)","");
		
		WebElement ele = driver.findElement(By.cssSelector("button[id='mousehover']"));
		WebElement top = driver.findElement(By.xpath("//a[text()='Top']"));
		WebElement reload = driver.findElement(By.xpath("//a[text()='Reload']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).click(top).build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)","");
		Thread.sleep(2000);
		//a.moveToElement(ele).click(reload).build().perform();
		a.moveToElement(ele).click().keyDown(reload, Keys.SHIFT).build().perform();
		driver.quit();
		
	}
}