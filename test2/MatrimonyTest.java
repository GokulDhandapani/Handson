package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyTest {
	public static void main(String[] args)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.tamilmatrimony.in/");
	WebElement matrimony = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
	Select SelectFor = new Select(matrimony);
	SelectFor.selectByVisibleText("Myself");
	
	driver.findElement(By.xpath("//input [@name='NAME']")).sendKeys("GD");
	driver.findElement(By.xpath("//input[@id='gendermale']")).click();
	
	WebElement religion = driver.findElement(By.xpath("//select[@class='selectfield']"));
	Select SubReligion = new Select(religion);
	SubReligion.selectByIndex(5);

	WebElement date = driver.findElement(By.xpath("//select[@name='DOBDAY']"));
	Select DateDate = new Select(date);
	DateDate.selectByValue("3");
	
	WebElement month = driver.findElement(By.xpath("//select[@name='DOBMONTH']"));
	Select MonthDate = new Select(month);
	MonthDate.selectByValue("2");
	
	WebElement year = driver.findElement(By.xpath("//select[@name='DOBYEAR']"));
	Select YearDate = new Select(year);
	YearDate.selectByVisibleText("1996");
	
WebElement lang = driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']"));
Select LangLang = new Select(lang);
LangLang.selectByIndex(1);

WebElement Caste = driver.findElement(By.xpath("//select[@name='CASTE_NORMAL']"));
Select CasteText = new Select(Caste);
CasteText.selectByValue("294");

WebElement Country = driver.findElement(By.xpath("//select[@name='COUNTRY']"));
Select CountryText = new Select(Country);
CountryText.selectByVisibleText("Singapore");

WebElement code = driver.findElement(By.xpath("//select[@name='M_COUNTRYCODE']"));
Select CodeText = new Select(code);
CodeText.selectByVisibleText("+91");

driver.findElement(By.xpath("//input[@name='MOBILENO']")).sendKeys("9994130741");
driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("gokooolraj@gmail.com");
driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("123456");
driver.findElement(By.xpath("//input[@class='hp-button txtupper hp-regbtn']")).click();




	//WebElement date = driver.findElement(By.xpath("//select[@class='selectfield']"));
	//Select SubReligion = new Select(religion);
//	SubReligion.selectByIndex(5);
	}

}


