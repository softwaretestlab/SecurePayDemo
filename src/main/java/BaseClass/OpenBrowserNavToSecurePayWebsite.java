package BaseClass;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PropertiesFIle.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class OpenBrowserNavToSecurePayWebsite {
	public static WebDriver driver;

	public static void NavSecaPayWeb(String url) throws IOException {
		
	    WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
       
		   driver.get(ReadPropertiesFile.PropFile(url));
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	}

	public static void CloseBrowser() throws IOException {
		driver.close();
		driver.quit();
	}
}
