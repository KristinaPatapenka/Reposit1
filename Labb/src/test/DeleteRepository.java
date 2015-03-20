package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteRepository {

	private WebDriver driver1;

	private static String URL = "https://github.com";

	@FindBy(name = "Settings")
	private WebElement settings;

	@FindBy(linkText = "Delete this repository")
	private WebElement deleteRep;
	
	@FindBy(name = "verify")
	private WebElement verifName;

	@FindBy(xpath = "//button[@class='button button-block danger']")
	private WebElement deRepostry;

	public void deleteReposit(String name) {
		System.out.println(driver1.getTitle());
		settings.click();
		deleteRep.click();
		verifName.sendKeys(name);
		deRepostry.click();
	}
	
}
