import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_Down {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_country= driver.findElement(By.xpath("//select['@name=country']"));
		Select sel=new Select(drp_country);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByIndex(2);//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		 Thread.sleep(2000);
		 sel.selectByValue("ANDORRA");
		 Thread.sleep(2000);
		 sel.selectByVisibleText("ANTIGUA AND BARBUDA");
		 System.out.println(sel.getFirstSelectedOption().getText());
		 
		 List <WebElement> list=sel.getOptions();
		 
		 for(int i=0;i<list.size();i++) {
			 Thread.sleep(3000);
			 String value=list.get(i).getText();
			 System.out.println(value);
			 
			 if(value.equals("ANTIGUA AND BARBUDA")) {
				 
				 sel.selectByVisibleText("ANTIGUA AND BARBUDA");
				 break;
			 }
		 }
		 
		 //public static  void custom_handleDropdown (WebElement element, String text) 
		// {
		//	 Select sel1=new Select(element);
		//	 sel1.selectByVisibleText(text);
		// }
		 
	}

}
