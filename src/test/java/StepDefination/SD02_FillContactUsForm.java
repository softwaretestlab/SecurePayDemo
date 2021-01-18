package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.OpenBrowserNavToSecurePayWebsite;
import SecurePayWebsite.AT03_FillContactUsForm;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD02_FillContactUsForm {

	@Then("^Verify ContactUs page is loaded$")
	public void verify_ContactUs_page_is_loaded()  {
		AT03_FillContactUsForm.AssertContactUsForm();
	}

	@Then("^Fill ContactUs form$")
	public void fill_ContactUs_form() {
		AT03_FillContactUsForm.FillForm();
	}




}
