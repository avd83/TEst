import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownUsingSelectClass {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//List<WebElement>count = driver.findElements(By.xpath("//option[contains(text(),'Select')]"));
		//	System.out.println(count.size());
			Select s = new Select((WebElement) driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
			//s.selectByVisibleText("Option1");
			//s.selectByIndex(1);
			s.selectByValue("option3");
		}

}
