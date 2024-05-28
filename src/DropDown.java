import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();		
		
		driver.get("https://www.akbartravels.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='from']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("mat-input-18")).click();
		WebElement element = driver.findElement(By.xpath("//div/input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
		
		Actions act = new Actions(driver);
		act.sendKeys(element,"pune").build().perform();
		Thread.sleep(2000);
		
		List<WebElement> fromList = driver.findElements(By.xpath("//div/ul/li[@class='ng-star-inserted']"));
		System.out.println(fromList.size());
		
		Thread.sleep(2000);	
		for(WebElement option : fromList)
		{
		if(option.getText().contains("PNQ"))
			{
				option.click();
			}
		}
		Thread.sleep(2000);	
		
		WebElement element1 = driver.findElement(By.xpath("//div/input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']"));
		element1.sendKeys("Delhi");
		Thread.sleep(2000);
		List<WebElement> toList = driver.findElements(By.xpath("//div/ul/li[@class='ng-star-inserted']"));
		System.out.println(toList.size());
		Thread.sleep(2000);
		for(WebElement option : toList)
		{
			if(option.getText().contains("DEL"))
			{
				option.click();
				Thread.sleep(2000);
				 driver.findElement(By.xpath("//body[1]/app-root[1]/app-layout[1]/div[2]/flight-home[1]/home-header[1]/header[1]/div[1]/flight-search[1]/section[1]/app-calendar[1]/div[1]/bi-calendar[1]/div[1]/div[2]/bi-month[1]/div[1]/bi-week[3]/div[1]/div[3]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div/ul/li[1]/div/div[2]")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div/button[1]/span[@class='mat-button-wrapper']")).click();
				 Thread.sleep(2000);
		         driver.findElement(By.xpath("//div/ul/li[6]/button/span[@class='mat-button-wrapper']")).click();
		         
		         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='progress-loader']")));
				 //Thread.sleep(5000);
			}					
		}		
	}
}