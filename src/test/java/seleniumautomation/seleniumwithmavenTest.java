package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumwithmavenTest {
	
	@Test
	public void testingMaven()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Testing Maven");
	}
	
	@Test
	public void testingMaven1()
	{
		System.out.println("Testing maven2");
	}

}
