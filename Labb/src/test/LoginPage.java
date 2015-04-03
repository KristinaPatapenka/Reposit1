package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver1;

	@FindBy(name = "commit")
	private WebElement signIn;

	@FindBy(name = "login")
	private WebElement login;

	@FindBy(name = "password")
	private WebElement password;


	public void loginUser(String username, String strngPassword,WebDriver driver1) {
		this.driver1=driver1;
		PageFactory.initElements(driver1, this);
		System.out.println(driver1.getTitle());
		login.sendKeys(username);
		password.sendKeys(strngPassword);
		signIn.click();
	}

}
