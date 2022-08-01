package automation_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_handle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("21323434545");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//submit_button.click();
		//1st program of automation in that we learn how to open browser and close.
		
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(4000);
		alt.accept();
		 Thread.sleep(4000);
		alt.accept();
		// Thread.sleep(8000);
		// driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("987654321");
		//alt.dismiss();
		
		
		
		
	}

}