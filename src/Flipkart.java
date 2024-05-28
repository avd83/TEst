
import java.util.Set;
		import java.util.concurrent.TimeUnit;
		 
		import java.util.Iterator;
		 
		//import javax.swing.text.html.HTMLDocument.Iterator;
		 
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
public class Flipkart {

	static WebDriver driver;
	static String parentId;
	static String childId;
	static String childId1;
	static Set s;
 
	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);		
		driver.get("https://www.flipkart.com/");
		
		
		WebElement sr=driver.findElement(By.cssSelector("input[class='Pke_EE']"));
		sr.click();
		sr.sendKeys("fan",Keys.ENTER);
		String parentId1 = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[normalize-space(text())='BAJAJ Crest Neo 1200 mm Ultra High Speed 3 Blade Ceiling Fan']")).click();
		driver.switchTo().window(parentId1);		
		driver.findElement(By.xpath("//div[normalize-space(text())='BAJAJ Esteem 400 mm 3 Blade Table Fan']")).click();
		//Thread.sleep(3000);
		getWindowId();
		getCloseWindow();	
		
		/*Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		java.util.Iterator<String> it = s.iterator();
		if (it.hasNext())
		{	
			 parentId = (String) it.next();
			 childId = (String) it.next();
			 childId1 = (String) it.next();
			
		}
		
		 driver.switchTo().window(childId1);
	  	   driver.findElement(By.cssSelector("[class='_2KpZ6l _2U9uOA _3v1-ww\']")).click();
			driver.close();
			driver.switchTo().window(childId);
			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			 driver.close();  */
		
		//Thread.sleep(2000);
		//driver.quit();		
	}
	public static void getWindowId()
	{
		s = driver.getWindowHandles();
		System.out.println(s);
		Iterator<String> it = s.iterator();
		//it.next();
		if (it.hasNext())
		{	
			 parentId = (String) it.next();
			 childId = (String) it.next();
			 childId1 = (String) it.next();
			
		}
		
		
	}
	
	public static void getCloseWindow()
	{
		driver.switchTo().window(childId1);
  	    driver.findElement(By.cssSelector("[class='_2KpZ6l _2U9uOA _3v1-ww\']")).click();
		driver.close();
		driver.switchTo().window(childId);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 driver.close();
	}    
 
	}

