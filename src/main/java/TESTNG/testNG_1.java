package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_1 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void M1() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void M2() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sdsffgkdfh@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("8657654664");
		
	}
	@AfterMethod
	public void M3() {
		driver.close();
	}

}
