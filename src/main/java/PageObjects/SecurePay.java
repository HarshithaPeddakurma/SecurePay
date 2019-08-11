package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePay {
	WebDriver driver;

//By Login=By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	@FindBy(xpath="//a/img[@alt='SecurePay']")
	WebElement SecurePayWebsite;
	@FindBy(xpath="//*[@id='menu-item-179']/a")
	WebElement Contactus;
	@FindBy(xpath="//*[@id='menu-item-3367']/a")
	WebElement Support;
	
public SecurePay(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//driver.findElements(By.className(className))
}
public WebElement SecurePayWebsite() {
	 return SecurePayWebsite;
	}
public WebElement Contactus() {
 return Contactus;
}
public WebElement Support() {
	 return Support;
	}
}

