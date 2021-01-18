package SecurePayWebsite;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import BaseClass.OpenBrowserNavToSecurePayWebsite;
import PropertiesFIle.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AT01_SearchGoogleForSecurePay {
//	public static WebDriver driver;
	@Test
	public static void SearchGoogle() throws IOException {
		   //Navigate to google 
		    OpenBrowserNavToSecurePayWebsite.NavSecaPayWeb("GoogleUrl");
		   
		   //Assert on GoogleHomePage
		   WebElement GoogleImage=  OpenBrowserNavToSecurePayWebsite.driver.findElement(By.xpath("//img[@alt='Google']"));
		   Assert.assertEquals(true, GoogleImage.isDisplayed());
		   		   
		   // Search for SecurePay on Google
		   OpenBrowserNavToSecurePayWebsite.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   WebElement GoogleInput = OpenBrowserNavToSecurePayWebsite.driver.findElement(By.xpath("//input[@name='q']"));
		   GoogleInput.sendKeys("SecurePay");
		   OpenBrowserNavToSecurePayWebsite.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   GoogleInput.sendKeys(Keys.RETURN);
		   
		   
		   
		   

		 
	}

}
