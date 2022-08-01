import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newlocator {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		
		Driver.manage().window().maximize();
		System.out.println(Driver.getCurrentUrl());
		Driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
		Thread.sleep(2000); //2sec
		System.out.println(Driver.getTitle());
		
		System.out.println(Driver.getCurrentUrl());
		Driver.navigate().back();
		Thread.sleep(2000);
		Driver.navigate().forward();
		Thread.sleep(2000);
		Driver.navigate().refresh();

	}

}
