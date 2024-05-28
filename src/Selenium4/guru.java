package Selenium4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class guru {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("cart")).click();
		driver.findElement(By.id("exampleInputEmail")).clear();
		driver.findElement(By.id("exampleInputEmail")).sendKeys("2");
		
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);  //to create object for LogEntries
		
		List<LogEntry> logs = entry.getAll();  // to retrun all logs in list
		for(LogEntry e : logs) //Iterating through the list and print each message
		{
			System.out.println(e.getMessage());
		}
	}

}
