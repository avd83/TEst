import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		//Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//td[text()='Appium (Selenium) - Mobile Automation Testing from Scratch']"));
		System.out.println(element.getText());
		List<WebElement> price = driver.findElements(By.xpath("//table[@name='courses']//tbody//tr//td[3]"));
		
		//System.out.println(price.size());	
		int sum=0;
		/*for(int i=0;i<price.size();i++)
		{			
			String a =(price.get(i).getText());
			sum = sum + Integer.parseInt(a) ;
			System.out.println(sum);
			//Thread.sleep(1000);
		}
		*/
		for(WebElement number : price)
		{			
			sum=sum+Integer.parseInt(number.getText());
			System.out.println(sum);
		}
		driver.close();
	}
}