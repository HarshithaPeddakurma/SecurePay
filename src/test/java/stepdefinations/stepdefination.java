package stepdefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import resources.Base;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.ContactUs;
import PageObjects.GoogleSearch;
import PageObjects.SecurePay;

//@RunWith(Cucumber.class)
public class stepdefination extends Base{
	public static Logger Log=LogManager.getLogger(Base.class.getName());
	public static GoogleSearch search;
	public static SecurePay s;
	public static ContactUs contact;

    @Given("^Open Chrome and navigate to \"([^\"]*)\"$")
    public void open_chrome_and_navigate_to_something(String strArg1) throws Throwable {
    	//Open the chrome browser and navigate to google website
    	driver=intializeDriver();
    	driver.get(strArg1);
    }

    @Given("^Click on enter on the google search text box$")
    public void click_on_enter_on_the_google_search_text_box() throws Throwable {
    	//Click on Enter on the google search text box
    	search.GoogleSearch().sendKeys(Keys.RETURN);
    }

    @Given("^point the mouse at support tag$")
    public void point_the_mouse_at_support_tag() throws Throwable {
    	//Click on Contactus link in Support tag
    	driver.manage().window().maximize();
		s=new SecurePay(driver);
		Actions a =new Actions(driver);
		a.moveToElement(s.Support()).build().perform();
		Log.info("Mouse is moved to the support");
    }
    
    @Given("^Generate Random data for FirstName,LastName,Company$")
    public String generate_random_data_for_firstnamelastnamecompany() throws Throwable {
    	//Generate random data
    	return "random-" + UUID.randomUUID().toString() + "";
    }
    
    @When("^The google website text box is enabled$")
    public void the_google_website_text_box_is_enabled() throws Throwable {
    	//Check if the google text box is enabled
    	search=new GoogleSearch(driver);
    	Assert.assertTrue(search.GoogleSearch().isEnabled());
    	Log.info("Google search text box is enabled");
    	
    }

    @When("^Click the SecurePay link$")
    public void click_the_securepay_link() throws Throwable {
    	//Check if the SecurePay link is clicked
    	search.SecurePayLink().click();
    	Log.info("Sucessfully Clicked on Secure Pay Link");
    }

    @When("^Click on contactus$")
    public void click_on_contactus() throws Throwable {
    	//Click on ContactUs link
    	s.Contactus().click();
    }
    
    @When("^Enter Random data in ContactUs Page and donot click on submit button$")
    public void enter_random_data_in_contactus_page_and_donot_click_on_submit_button() throws Throwable {
    	//Enters random data in contactus page
    	final String randomFirstName = generate_random_data_for_firstnamelastnamecompany();
		final String randomEmail = generate_random_data_for_email();
		final String phonenumber = generate_random_data_for_phonenumber();
		final String randomURL = generate_random_data_for_url();
		contact.FirstName().sendKeys(randomFirstName);
		Log.info("Successfully Entered a random first name");
		contact.LastName().sendKeys(randomFirstName);
		Log.info("Successfully Entered a random Last name");
		contact.Email().sendKeys(randomEmail);
		Log.info("Successfully Entered a random Email");
		contact.WebsiteURL().sendKeys(randomURL);
		Log.info("Successfully Entered a random URL");
		contact.PhoneNumber().sendKeys(phonenumber);
		Log.info("Successfully Entered a random PhoneNumber");
		contact.Company().sendKeys(randomFirstName);
		Log.info("Successfully Entered a random Company");
		Select select =new Select(contact.ReasonforEnquiry());
		select.selectByIndex(1);
		Log.info("Successfully Selected a the firstindex");
    }

    @Then("^Enter SecurePay on google website$")
    public void enter_securepay_on_google_website() throws Throwable {
    	//Enter the secure pay in the google search text box
    	search.GoogleSearch().sendKeys(prop.getProperty("Website"));
    	Log.info("Sucessfully entered text in searchedit box");
    }

    @Then("^Successfully able to navigate to the SecurePay Website$")
    public void successfully_able_to_navigate_to_the_securepay_website() throws Throwable {
    	SecurePay s=new SecurePay(driver);
    	Assert.assertTrue(s.SecurePayWebsite().isDisplayed());
    	Log.info("Sucessfully navigated to SecurePay Website");
    }
    
    @Then("^Successfully able to navigate to ContactUs page$")
    public void successfully_able_to_navigate_to_ContactUs_page() throws Throwable {
        contact=new ContactUs(driver);
        Assert.assertTrue(contact.Contactus().isDisplayed());
    }
    
    @Then("^submit button not clicked and browser is closed$")
    public void submit_button_not_clicked_and_browser_is_closed() throws Throwable {
    	Assert.assertTrue(contact.Submit().isEnabled());
    	driver.close();
		driver=null;
    }
    
    @And("^Generate Random data for Email$")
    public String generate_random_data_for_email() throws Throwable {
    	return "random-" + UUID.randomUUID().toString() + "@example.com";
    }
    
    @And("^Generate Random data for Phonenumber$")
    public String generate_random_data_for_phonenumber() throws Throwable {
    	return UUID.randomUUID().toString();
    }

    @And("^Generate Random data for URL$")
    public String generate_random_data_for_url() throws Throwable {
    	return "https://" + UUID.randomUUID().toString() + ".com";
    }

}