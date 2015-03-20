package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver1;

	private static String URL = "https://github.com";

	@FindBy(name = "commit")
	private WebElement signIn;

	@FindBy(name = "login")
	private WebElement login;

	@FindBy(name = "password")
	private WebElement password;


	public void loginUser(String username, String strngPassword) {
		System.out.println(driver1.getTitle());
		login.sendKeys(username);
		password.sendKeys(strngPassword);
		signIn.click();
	}

}
