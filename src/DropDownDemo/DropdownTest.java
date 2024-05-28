package DropDownDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTest {
	
	static WebDriver driver;	

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT'")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT'")).sendKeys("pune");
		
		

	}

}
