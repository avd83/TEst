package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OldWebElementScreenShort {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement header1 = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
		WebElement header = driver.findElement(By.xpath("//div[@class='_2NhoPJ']"));
		
		takeWebElementScreenShot(header,"header");
		takeWebElementScreenShot(header1,"header1");
		
		driver.quit();		
	}
	
	public static void takeWebElementScreenShot(WebElement element, String fileName) throws IOException
	{
		TakesScreenshot srcShot = ((TakesScreenshot)element);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile,new File("./target/"+fileName+".png"));
	}

}
