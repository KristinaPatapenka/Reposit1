package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

private WebDriver driver1;

private static String URL = "https://github.com";

@FindBy(linkText = "Sign in")
private WebElement signIn1;

public void clickUser() {
	System.out.println(driver1.getTitle());
	signIn1.click();
	
}

}