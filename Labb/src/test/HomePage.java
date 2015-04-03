package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver1;

public static String URL = "https://github.com";

@FindBy(linkText = "Sign in")
public WebElement signIn1;

public HomePage clickUser(WebDriver driver1) {
	this.driver1=driver1;
	PageFactory.initElements(driver1, this);
	System.out.println(driver1.getTitle());
	signIn1.click();
	
	return this; 
}

}