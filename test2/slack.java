package test2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class slack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 ChromeDriver gokul = new ChromeDriver();
 gokul.manage().window().maximize();
 //gokul.get("https://slack.com/intl/en-in");
 //gokul.findElement(By.xpath("(//span[text()='Launch Slack'])[2]")).click();
 gokul.get("https://www.flipkart.com/audio-video/headphones/pr?sid=0pm%2Cfcn&otracker=categorytree&p%5B%5D=facets.connectivity%255B%255D%3DBluetooth&fm=neo%2Fmerchandising&iid=M_3cde6057-5397-40e3-8746-2eee3d25f661_1_372UD5BXDFYS_MC.R08R6GB1Q1BI&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Electronics~Audio~Bluetooth%2BHeadphones_R08R6GB1Q1BI&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=R08R6GB1Q1BI");
gokul.findElement(By.xpath("//img[@class='_396cs4']")).click();
//Add to cart click new tab open
/*Set<String> windowHandles = gokul.getWindowHandles(); 
for (String handle : windowHandles) {
gokul.switchTo().window(handle);
}*/

//Set<String> windowHandles = gokul.getWindowHandles();

Set<String> windowHandles2 = gokul.getWindowHandles();
for (String each : windowHandles2) {
	gokul.switchTo().window(each);
}
	 

gokul.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
 gokul.quit();
 
	}

}
