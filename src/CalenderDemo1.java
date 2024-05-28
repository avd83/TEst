import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo1 {

	static WebDriver driver;
	static String monthYearVal;
	static String month;
	static String year;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		Thread.sleep(2000);
		selectDate("24","September","2024");
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void selectDate(String expDate,String expMonth,String expYear) throws InterruptedException
	{
		String monthYearVal = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
		
		System.out.println(monthYearVal);
		month = monthYearVal.split(" ")[0].trim();
		System.out.println(month);
		year = monthYearVal.split(" ")[1].trim();
		System.out.println(year);
		
		while(!(month.equals(expMonth) && year.equals(expYear)))
		{
			 driver.findElement(By.xpath("//*[local-name()='g' and @fill='none' and @transform='translate(1 1)']")).click();
			 monthYearVal = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']")).getText();
			 System.out.println(monthYearVal);
			 month = monthYearVal.split(" ")[0].trim();
			 year = monthYearVal.split(" ")[1].trim();				
		}
		driver.findElement(By.xpath("//div[text()='"+expDate+"']")).click();
	}
}