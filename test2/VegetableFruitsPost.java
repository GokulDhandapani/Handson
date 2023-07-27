package test2;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VegetableFruitsPost {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://newsupplier.lotsmart.in/login");
		driver.findElement(By.xpath("//*[@id=\"mobile-number\"]")).sendKeys("9566957665");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		//driver.get("https://newsupplier.lotsmart.in/dashboard/post/add");
		//upload file
		//driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[23]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/a[2]/span")).click();
		driver.findElement(By.xpath("//button[@class='blue-btn add-button']")).click();
	   
		WebElement category = driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[1]/select"));
		Select CategoryFV = new Select(category);
		CategoryFV.selectByVisibleText("Fruits");
		
		WebElement fruit = driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[3]/select"));
		Select Products=new Select(fruit);
		Products.selectByValue("c64360b6-90f2-4887-a67b-7d4110700569");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[5]/div/input")).sendKeys("1500");
		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-invalid']")).sendKeys("chennai");
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[9]/textarea")).sendKeys("Fruit is nature's candy. ...\r\n"
				+ "Fruits make you strong.\r\n"
				+ "Hello, fruit.\r\n"
				+ "The day you plant the seed is not the day you eat the fruit. ...\r\n"
				+ "A bad tree cannot bear good fruit");
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[11]/div/input")).sendKeys("100");
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[13]/div/input")).sendKeys("75");
		driver.findElement(By.xpath("//*[@id=\"bookingAmount\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"afterStreaming\"]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[19]/div/input")).sendKeys("80");
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[21]/div/input")).sendKeys("50");
		driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[23]/div/input")).sendKeys("25");
		// image upload
		
		/*WebElement upload_file =*/
	/*	Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[25]/div/label")).click();
	 String file ="C:\\Users\\SYSTEM 02.DESKTOP-UH7J2QT.000\\Desktop\\Images\\Fruits\\download.jpeg";
	 
	 StringSelection Select = new StringSelection(photolink);
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Select, null);
	 Thread.sleep(20);
	 Robot robot = new Robot();
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyRelease(KeyEvent.VK_V);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 
	//pk:\Users\SYSTEM 02.DESKTOP-UH7J2QT.000\Desktop\Images\Fruits
		//upload.sendKeys("C:\\Users\\SYSTEM 02.DESKTOP-UH7J2QT.000\\Desktop\\Images\\Fruits");
		
		
		//*[@id="mobile-number"]
		// TODO Auto-generated method stub*/
	Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Choose File']")).click();
		Thread.sleep(2000);
		String file = "C:\\Users\\SYSTEM 02.DESKTOP-UH7J2QT.000\\Desktop\\Images\\download.jpeg";
		StringSelection Select = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Select, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Choose File'])[2]")).click();
		Thread.sleep(2000);
		String file2 = "C:\\Users\\SYSTEM 02.DESKTOP-UH7J2QT.000\\Downloads\\Tomato videos.mp4";
		StringSelection Select2 = new StringSelection(file2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Select2, null);
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/app-root/div/app-commen/div/app-commom/div/div/div[2]/div/div[2]/main/div/app-createpost/div[2]/form/div/div[28]/button")).click();
		driver.findElement(By.xpath("//button[text()='Post']")).click();		
	}

}
