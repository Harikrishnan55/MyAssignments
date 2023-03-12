package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class launchEdgeBrowser {

	public static void main(String[] args) {
		
		
		EdgeDriver driver = new EdgeDriver();
		
        driver.get("http://WWW.facebook.com");
        
		driver.manage().window().maximize();
		
		//driver.close();

	}

}
