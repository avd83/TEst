import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCountMove {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();
		
		Set<String> windows = driver.getWindowHandles();// (index[0]parentid,index[1]childid)
		System.out.println(windows.size());
		
		Iterator<String> it = windows.iterator();
		String parentid = it.next();// bydefault it contains first index[0]
		String childid = it.next();// after inedx 0 select this step will take index 1
		
		driver.switchTo().window(childid);
		String s = driver.getTitle();
		System.out.println(s);
		driver.switchTo().window(parentid);
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		driver.quit();
	}
}