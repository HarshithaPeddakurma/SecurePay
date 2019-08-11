package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	WebDriver driver;

//By Login=By.xpath("/html/body/header/div[1]/div/nav/ul/li[4]/a/span");
	
	@FindBy(xpath="//input[@title='Search']")
	WebElement GoogleSearch;
	@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")
	WebElement SearchButton;
	@FindBy(xpath="//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3")
	WebElement SecurePayLink;
public GoogleSearch(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement GoogleSearch() {
 return GoogleSearch;
}
public WebElement SearchButton() {
	 return SearchButton;
	}
public WebElement SecurePayLink() {
	 return SecurePayLink;
	}
}
