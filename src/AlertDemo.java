import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("abhay");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		alert.accept();
		
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		String alertMessage1 = alert.getText();
		System.out.println(alertMessage1);
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.quit();		
	}
}