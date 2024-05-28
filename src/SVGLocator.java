import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[role='button']")).click();
		Thread.sleep(2000);
		////*[name()='svg']//*[local-name()='path' and @stroke='#717478'][1]
		String tt= null;
		
		WebElement search = driver.findElement(By.xpath("//*[name()='svg'][1]"));
		tt = search.getAttribute("title");
		System.out.println(tt);
		
	
		List<WebElement> path = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='path'and @stroke='#717478']"));
		
		for(WebElement ele : path)
		{
		String text=null;
		
		text = ele.getAttribute("d");
		System.out.println(text);		
	}	
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
