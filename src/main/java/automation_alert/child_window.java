package automation_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class child_window {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		driver.findElement(By.xpath("name=\"emailid\"")).sendKeys("assdfsjfhk@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin'")).click();
		

	}

}
