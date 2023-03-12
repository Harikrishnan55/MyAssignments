package week2.day1;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		
        driver.get("http://WWW.facebook.com");
        
		driver.manage().window().maximize();
		
		driver.close();
		

	}

}
