package test2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/cameras/dslr-mirrorless/pr?sid=jek%2Cp31%2Ctrv&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&p%5B%5D=facets.type%255B%255D%3DMirrorless&param=179&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJTaG9wIE5vdyEiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19LCJ0aXRsZSI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ0aXRsZSIsImluZmVyZW5jZVR5cGUiOiJUSVRMRSIsInZhbHVlcyI6WyJUb3AgTWlycm9ybGVzcyBDYW1lcmFzIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiRExMR0ZZN1hZRzhZRk1RVCIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX19fX0%3D&fm=neo%2Fmerchandising&iid=M_62704bee-5ae2-461d-b0ea-041c19479a0a_3.Q5LU1U8PHMK6&ssid=z130u3sy340000001685355144278&otracker=hp_omu_Best%2Bof%2BElectronics_1_3.dealCard.OMU_Q5LU1U8PHMK6_3&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Best%2Bof%2BElectronics_NA_dealCard_cc_1_NA_view-all_3&cid=Q5LU1U8PHMK6");
		driver.findElement(By.xpath("//img [@class='_396cs4']")).click();
		//Window handless second window actionnnnn
		Set<String> windowhandle = driver.getWindowHandles();
		for (String Camara : windowhandle) 
		{
			driver.switchTo().window(Camara);
		}
		
 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
		// TODO Auto-generated method stub

	}

}