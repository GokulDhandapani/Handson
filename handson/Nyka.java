package handson;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nyka {

	public static void main(String[] args) throws InterruptedException 
	{
 EdgeOptions options = new EdgeOptions();
 options.addArguments("--disable-notificaations","start-maximizing");
 
 EdgeDriver driver = new EdgeDriver();
 driver.get("https://www.nykaa.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 // click the brand
 WebElement ele = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
 Actions brand = new Actions(driver);
 brand.pause(20).moveToElement(ele).perform();
 // click the l'oreal parris
 driver.findElement(By.linkText("L'Oreal Paris")).click();
 String title = driver.getTitle();
 System.out.println(title);
 // sort by and select customer top rated
 driver.findElement(By.className("sort-name")).click();
 //driver.findElement(By.xpath("//input[@id='radio_customer top rated_undefined']")).click();
 driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
 // click the category
 driver.findElement(By.xpath("//a[@id='category']")).click();
 Thread.sleep(2000);
 // click hair
 WebElement ele2 = driver.findElement(By.xpath("//a[text()='hair']"));
 Actions shampoo = new Actions(driver);
 shampoo.pause(20).moveToElement(ele2).perform();
 // click the shampoo
 driver.getWindowHandle();
 driver.findElement(By.xpath("//a[text()='Shampoo']")).click();
 Set<String> handles = driver.getWindowHandles();
 for (String newWindow : handles) 
 {
 driver.switchTo().window(newWindow);
 }
 // click the concern
 driver.findElement(By.xpath("//span[text()='Concern']")).click();
 // click the color protection
 driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[6]")).click();
 // search box
 driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']")).sendKeys("L'Oreal Paris Colour Protected Shampoo",Keys.ENTER);
 //driver.findElement(By.xpath("//span[@class='multiline-elpisses css-df23dz']")).click();
 // click the shampoo
 driver.getWindowHandle();
 driver.findElement(By.xpath("//span[text()='₹399']")).click();
 Set<String> handles2 = driver.getWindowHandles();
 //driver.findElement(By.xpath("//button[@class='css-1hemsnh']")).click();
 for (String secondWindow : handles2)
 {
 driver.switchTo().window(secondWindow);
 }
 // click the 180ml
 driver.findElement(By.xpath("//span[text()='180ml']")).click();
 // print the mrp of the product
 String txt2 = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
 System.out.println("MRP of the product is : " + txt2);
 // click add to bag
 driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
 // go to shopping baag
 driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
 // grand total
 driver.switchTo().frame(0);
 Thread.sleep(2000);
 String txt3 = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
	
 System.out.println("The grand total of the product is " + txt3);
 // click proceed
 driver.findElement(By.xpath("(//span[@class='css-1aowomc ehes2bo0'])[6]")).click();
 // final grand total
 String text4 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
 //String text4 = total2.getText();
 System.out.println("The grand total of the product is " + text4);
 // check the condition
 if(txt3.equals(text4)) {
 System.out.println("Both MRP are same");
 }
 // click continue as guest
 driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
 // close all window
 driver.close();

	}
}
