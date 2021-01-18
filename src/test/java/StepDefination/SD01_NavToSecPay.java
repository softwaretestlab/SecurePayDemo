package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.OpenBrowserNavToSecurePayWebsite;
import SecurePayWebsite.AT01_SearchGoogleForSecurePay;
import SecurePayWebsite.AT02_NavigateToSecurePay;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD01_NavToSecPay {
	
	@Given("^Navigate to Google site$")
	public void navigate_to_Google_site() throws IOException  {
		AT01_SearchGoogleForSecurePay.SearchGoogle();
	}

	@Then("^search for securePay and navigate to homepage of SecurePay$")
	public void search_for_securePay_and_navigate_to_homepage_of_SecurePay() throws IOException, InterruptedException {
		AT02_NavigateToSecurePay.NavSecPayHomepage();
	}




}
