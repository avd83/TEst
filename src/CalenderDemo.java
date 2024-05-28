import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

		static WebDriver driver;
		static String month;
		static String year;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(2000);
		selectDate("24","July","2024");
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void selectDate(String expDate,String expMonth,String expYear)
	{
		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();		
		System.out.println(monthYear);
		month=monthYear.split(" ")[0].trim();
		System.out.println(month);
		year = monthYear.split(" ")[1].trim();
		System.out.println(year);
		
		while(!(month.equals(expMonth) && year.equals(expYear)))
		{
			driver.findElement(By.cssSelector("a[title='Next']")).click();
			 monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();		
			 System.out.println(monthYear);
			 month=monthYear.split(" ")[0].trim();
			 year = monthYear.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[text()='"+expDate+"']")).click();
	}
}