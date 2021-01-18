package SecurePayWebsite;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BaseClass.OpenBrowserNavToSecurePayWebsite;
import PropertiesFIle.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AT02_NavigateToSecurePay {
	public static WebDriver driver;
	@Test
	public static void NavSecPayHomepage() throws IOException, InterruptedException {
		
		//click on the first link from google and navigate to SecurePay site
		   OpenBrowserNavToSecurePayWebsite.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   List<WebElement> allFilters = OpenBrowserNavToSecurePayWebsite.driver.findElements(By.xpath("//a[@href='https://www.securepay.com.au/']"));
		   int NoOfEle=allFilters.size();
		   for (int i = 0; i < NoOfEle; i++) {
			   allFilters.get(i).click();
			   break;
			   
		   }
		   
		   //Refresh SecurePay homepage
		   OpenBrowserNavToSecurePayWebsite.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.xpath("//img[@alt='SecurePay Logo']")).click();
		   OpenBrowserNavToSecurePayWebsite.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		   
	}

}
