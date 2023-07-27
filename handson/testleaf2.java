package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testleaf2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// launch the website
		driver.get("http://leaftaps.com/opentaps/control/main");
		// max the window size
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// username field box
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// password field box
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// login functionality
		driver.findElement(By.className("decorativeSubmit")).click();
		// click the crmsfa hyper link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click the lead link
		driver.findElement(By.linkText("Leads")).click();
		// click the find lead
		driver.findElement(By.linkText("Find Leads")).click();
		// search the first name field
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("ABC");
		// click the find lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// click the lead
		driver.findElement(By.xpath("//a[text()='ABC']")).click();
		// get the title page
		System.out.println("The title is " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// click edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// clear the company name
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 // enter the new company name
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		 // click the update
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 // Change the  company name appears
		 System.out.println("Changed company name is : " + driver.findElement(By.id("viewLead_companyName_sp")).getText());
				
	}

}
