package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	WebDriver driver;

//By Login=By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	@FindBy(xpath="//*[@id='section-heading']/div/h1")
	WebElement ContactUs;
	@FindBy(xpath="//input[@name='first-name']")
	WebElement FirstName;
	@FindBy(xpath="//input[@name='last-name']")
	WebElement LastName;
	@FindBy(xpath="//input[@type='email']")
	WebElement Email;
	@FindBy(xpath="//input[@name='phone-number']")
	WebElement PhoneNumber;
	@FindBy(xpath="//input[@name='website-url']")
	WebElement WebsiteURL;
	@FindBy(xpath="//input[@name='business-name']")
	WebElement Company;
	@FindBy(xpath="//select[@name='reason-for-enquiry']")
	WebElement ReasonforEnquiry;
	@FindBy(xpath="//input[@value='Submit']")
	WebElement Submit;
	
public ContactUs(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//driver.findElements(By.className(className))
}

public WebElement Contactus() {
 return ContactUs;
}
public WebElement FirstName() {
	 return FirstName;
	}
public WebElement Email() {
	 return Email;
	}
public WebElement LastName() {
	 return LastName;
	}
public WebElement PhoneNumber() {
	 return PhoneNumber;
	}
public WebElement WebsiteURL() {
	 return WebsiteURL;
	}
public WebElement Company() {
	 return Company;
	}
public WebElement ReasonforEnquiry() {
	 return ReasonforEnquiry;
	}
public WebElement Submit() {
	 return Submit;
	}

}

