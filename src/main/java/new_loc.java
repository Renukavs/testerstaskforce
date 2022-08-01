import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class new_loc {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("asdvg@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234566789");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
