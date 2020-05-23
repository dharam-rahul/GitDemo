package seleniumautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiturl {
	
	
	public static void main( String[] args ) throws IOException
    {
		String[] urlArray;
		String urls;
		 WebDriver driver;
		 
		 By loginBtnLink = By.cssSelector("[class=' sign-style newsletter'] a.event_profile_login");
			By userName = By.id("phdesktopbody_0_username");
			By pwdUserName = By.cssSelector("[id='phdesktopbody_0_password']");
			By germanSignINBtn = By.cssSelector("[id='phdesktopbody_0_ANMELDEN");
			
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium WebDrivers\\chromedriver_win32\\chromedriver.exe");
			FileInputStream fil = new FileInputStream("C:\\Users\\dharampal\\MavenJava\\src\\test\\java\\config.properties");
			Properties prop = new Properties();
			 prop.load(fil);
			 urls = prop.getProperty("urlassign1");
			 
			 urlArray = urls.split(",");
			 
			 for(String url: urlArray) {
				 driver= new ChromeDriver();		 
				 driver.get(url);
				 driver.findElement(loginBtnLink).click();
				 driver.findElement(userName ).sendKeys("ry380038@gmail.com");
				 driver.findElement(pwdUserName ).sendKeys("Dharam@123");
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", driver.findElement(germanSignINBtn));
				 
				 
			 }
			 
		
    }
	
	

}
