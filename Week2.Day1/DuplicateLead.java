package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	     /* Assignment 3:Duplicate Lead
	      
         1. Launch URL "http://leaftaps.com/opentaps/control/login"
 2. Enter UserName and Password Using Id Locator
 3. Click on Login Button using Class Locator
 4. Click on CRM/SFA Link
 5. Click on Leads Button
 6. Click on Create Lead 
 7. Enter CompanyName Field Using id Locator
 8. Enter FirstName Field Using id Locator
 9. Enter LastName Field Using id Locator
 10. Enter FirstName(Local) Field Using id Locator
 11. Enter Department Field Using any Locator of Your Choice
 12. Enter Description Field Using any Locator of your choice 
 13. Enter your email in the E-mail address Field using the locator of your choice
 14. Select State/Province as NewYork Using Visible Text
 15. Click on Create Button
         16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
         17. Click on Duplicate button
         18. Clear the CompanyName Field using .clear() And Enter new CompanyName
         19.Clear the FirstName Field using .clear() And Enter new FirstName
         20.Click on Create Lead Button
         21. Get the Title of Resulting Page(refer the video)  using driver.getTitle() */

	public static void main(String[] args) {
		 //Method- ClassName object = new ClassName ();
		
        ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("http://Leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
      driver.findElement(By.id("username")).sendKeys("DemoCSR");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hari & Co");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari Krishnan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("selvaraj");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("HariKrish");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Automation _Selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating test automation script in leaftaps");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("s.harikrishnan55@gmail.com");
		
		WebElement stateprov = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sp = new Select (stateprov);
		//sp.selectByIndex(20);
		//sp.selectByValue("IN");
		  sp.selectByVisibleText("Indiana");
		
		  driver.findElement(By.name("submitButton")).click();
		  
		  String Title = driver.getTitle();
		
		System.out.println(Title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();        
        
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hari Krishnan Consultancy" );
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari Krishnan Selvaraj");
		
		  driver.findElement(By.name("submitButton")).click();
		  
		  String Title1 = driver.getTitle();
			
			System.out.println(Title1);
		
	}

}
