import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	static WebDriver driver;
	static String parentId;
	static String childId;
	static String childId1;
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		driver.findElement(By.cssSelector("a[id='opentab']")).click();
		String parentId1 = driver.getWindowHandle();
		driver.switchTo().window(parentId1);
		driver.findElement(By.cssSelector("a[id='opentab']")).click();
		getWindowId();
		getCloseWindow();		
		Thread.sleep(2000);
		driver.quit();		
	}
	public static void getWindowId()
	{
		Set s = driver.getWindowHandles();
		System.out.println(s);
		Iterator it = s.iterator();
		if (it.hasNext())
		{	 parentId = (String) it.next();
			 childId = (String) it.next();
			 childId1 = (String) it.next();
		}
	}
	public static void getCloseWindow()
	{
		driver.switchTo().window(childId1);
		driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
		driver.close();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
		driver.close();
	}
}
