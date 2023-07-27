package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testleaf {

	public static void main(String[] args) {
		// syntax of chrome driver
				ChromeDriver driver = new ChromeDriver();
				// launch the  website
				driver.get("http://leaftaps.com/opentaps/control/main");
				// max the window size
				driver.manage().window().maximize();
				// username field box
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				// password field box
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// login functionality
				driver.findElement(By.className("decorativeSubmit")).click();
				// click the crmsfa hyper link
				driver.findElement(By.linkText("CRM/SFA")).click();
				// click the lead option
				driver.findElement(By.linkText("Leads")).click();
				// click the create lead
				driver.findElement(By.linkText("Create Lead")).click();
				// create name field box
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC COMPANY");
				//  create parent account
				driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("2423546433534");
				// create the first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathish");
				// create the last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
				// salutation field box
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
				// title field box
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Testing");
				// department field box
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
				// annual revenue  field box
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7,50,000");
				// employee field box
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
				// sic code field box
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6021");
				// description field box
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Nothing.....");
				// important notes
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("There is no important points are there");
				// phone number field box
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9878888874");
				// email id field box
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
				// address field box
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Thillai Nagar");
				// city field box
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
				// postal  code field box
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
				// click the create lead button
				//driver.findElement(By.name("submitButton")).click();
	}

}
