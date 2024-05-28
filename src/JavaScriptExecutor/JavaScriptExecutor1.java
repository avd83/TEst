package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {
	static WebDriver driver;
	static WebElement element;
	static JavascriptExecutor js;
	static String url;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");		
		
		js = (JavascriptExecutor) driver;			
		Thread.sleep(1000);			
		getUrlName();
		getElement();	
		getElementBorder();
		getPageDomainUrlTitle();
		getLogin();	
		getElementFlash();
		getPageZoom();
		getPageAlert();		
	  //getPageRefresh();
		tearDown();		
	}	
	public static void getUrlName()
	{
		url="https://rahulshettyacademy.com/loginpagePractise/";
		js.executeScript("window.location = \'"+url+"\'");
	}
	public static void getElement()
	{
		element = driver.findElement(By.id("signInBtn"));		
	}
	public static void getLogin()
	{
		//input text value
				js.executeScript("document.getElementById('username').value='test';");
				js.executeScript("document.getElementById('password').value='a@123';");
				element.click();
	}
	public static void getElementBorder()
	{
		//border draw for element
				js.executeScript("arguments[0].style.border = '3px solid red';",element);
	}
	public static void getElementFlash() throws InterruptedException
	{
		String bgColor = element.getCssValue("backgroundcoclor");		
		for(int i=0;i<50;i++)
		{
		js.executeScript("arguments[0].style.backgroundColor='#000000' ;",element);
		Thread.sleep(100);
		
		js.executeScript("arguments[0].style.backgroundColor= '"+bgColor+ "'" ,element);
		Thread.sleep(100);
		}	
	}
	public static void getPageZoom() throws InterruptedException
	{
		//zoom the page
		js.executeScript("document.body.style.zoom ='70%'");
			Thread.sleep(1000);
			getPageRefresh();
			getPageScroll();
	}
	public static void getPageDomainUrlTitle()
	{
		//fetch domain name
		String domainName = js.executeScript("return document.domain ;").toString();
		System.out.println(domainName);
		
		//fetch title name
		String titleName = js.executeScript("return document.title ;").toString();
		System.out.println(titleName);
		
		//fetch URl name
		String urlName = js.executeScript("return document.URL ;").toString();
		System.out.println(urlName);
	}
	public static void getPageScroll() throws InterruptedException
	{
				//Scroll till End
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(1000);
				//Scroll till Up
				js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				Thread.sleep(1000);
	}
	public static void getPageAlert() throws InterruptedException
	{
		js.executeScript("alert('This is my alert message')");
		Thread.sleep(2000);
	}
	public static void tearDown()
	{
		driver.quit();
	}
	public static void getPageRefresh()
	{
		js.executeScript("history.go(0)");
	}
}
