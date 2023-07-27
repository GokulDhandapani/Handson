package test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassTest1 {
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[ @class = '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("GD");
		driver.findElement(By.name("lastname")).sendKeys("DK");
		driver.findElement(By.xpath("//div [text()='Mobile number or email address']")).sendKeys("9566957665");
		//driver.findElement(By.xpath("(//input [@class = 'inputtext _58mg _5dba _2ph-']) [3]")).sendKeys("gokoolraj@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345");
		// dropdown method 1 slecte by index method
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select birthDayDate = new Select(date);
		birthDayDate.selectByIndex(30);
		// select by value method
		WebElement month = driver.findElement(By.id("month"));
		Select monthDate = new Select(month);
		monthDate.selectByValue("10");
		//select by 
	WebElement year = driver.findElement(By.id("year"));
	Select yearDate = new Select(year);
	yearDate.selectByVisibleText("2012");
	
	driver.findElement(By.xpath("(//input[@name ='sex'])[3]")).click();
	//driver.findElement(By.name("websubmit")).click();
	
		
		
		
	}
	
	

}
