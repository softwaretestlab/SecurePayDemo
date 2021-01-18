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


public class AT03_FillContactUsForm {
	
			
		@Test
		   public static void AssertContactUsForm() {
			
		//Clickon Contact Us link
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.xpath("//span[contains(text(),'Contact us')]")).click();
		   
		   //Verify contact us page is loaded
		   WebElement ContactUsPage=  OpenBrowserNavToSecurePayWebsite.driver.findElement(By.xpath("//div[contains(text(),'Navigated to Contact our Sales Team')]"));
		   Assert.assertEquals(true, ContactUsPage.isDisplayed());
	}
	@Test
		   public static void FillForm() {
		   //Fill contact details
		   Faker fake = new Faker();
		    //FirstName
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("firstName")).sendKeys(fake.name().firstName());
		   //Last name
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("lastName")).sendKeys(fake.name().lastName());
		   //Work email address
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("email")).sendKeys(fake.name().firstName()+fake.name().lastName()+"@gmail.com");
		   //Phone number
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("phone")).sendKeys("04"+fake.numerify("########"));
		   //Company name
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("company")).sendKeys(fake.company().name());
		   //Website URL
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("website")).sendKeys(fake.internet().url()+".au");
		   
		   //What amount does your business process a year?
		 //  driver.findElement(By.name("amount")).sendKeys("test");
		   Select ProceessYr = new  Select(OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("amount")));
			  //To Select dropdown option through visible text 
		   ProceessYr.selectByVisibleText("$100,000 to $250,000");

		   //Your Message
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.name("message")).sendKeys("Can you please quote me on your services");
		   OpenBrowserNavToSecurePayWebsite.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   //Are you an existing Australia Post customer?
		   OpenBrowserNavToSecurePayWebsite.driver.findElement(By.xpath("//span[contains(text(),'Are you an existing Australia Post customer?')]")).click();
		   //send message
		// driver.findElement(By.name("//button[contains(text(),'Send message')]")).click();
		   
		   }
		   
	}


