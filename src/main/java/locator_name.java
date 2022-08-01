import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_name {
//lecture4,+java madhe project kasa create karacha he sagitlay if any problem occure in maven 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//locator=name
		WebElement emailAddress= driver.findElement(By.name("email"));
		emailAddress.sendKeys("asdf@gmail.com");
		
		//locator=id
		WebElement password= driver.findElement(By.id("pass")); 
		password.sendKeys("78674647698797");
		//locator=name
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//no such element exception 
		
		

	}

}
