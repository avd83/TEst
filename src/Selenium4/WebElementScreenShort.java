package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenShort {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement link = driver.findElement(By.xpath("//div/a/picture"));
		WebElement cartButton = driver.findElement(By.xpath("//div/div[3]/div[@class='_38VF5e']"));
		
		getScreenShot(link,"flipkartName");	
		getScreenShot(cartButton,"cartbutton");	
		
		driver.quit();
	}
	
	
	public static void getScreenShot(WebElement element, String fileName) throws IOException 
	{
	
		File srcFile = element.getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile,new File("./target/"+fileName+".png"));
		
	}
	
}
