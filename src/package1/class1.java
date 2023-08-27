package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class class1 {
          @Test
	public  void  m1() throws InterruptedException, IOException {
  
        	  
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      
       driver.get("https://www.google.com/");
        
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("iphone");
        
        Thread.sleep(4000);
        
      List<WebElement> allop = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
                   Thread.sleep(2000);
              //parent to child jump
   for(WebElement op:allop)
   {
	   if(op.getText().contains("iPhone 11"))
	   {
		   op.click();
		   break;
	   }
   }
       
}
}












