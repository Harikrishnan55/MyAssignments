package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafTapLogin {

	public static void main(String[] args) throws InterruptedException {
		
          ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		//EdgeDriver driver = new EdgeDriver();
		driver.get("http://Leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.close();
 }

}
