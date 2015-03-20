package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewREpostoryPage {

	private WebDriver driver1;

	private static String URL = "https://github.com";

	@FindBy(name = "Create a repository")
	private WebElement crRpository;

	@FindBy(name = "repository[name]")
	private WebElement repName;

	@FindBy(xpath = "//button[@class='button primary first-in-line']")
	private WebElement createRepostry;

	public void createReposit(String name) {
		System.out.println(driver1.getTitle());
		crRpository.click();
		repName.sendKeys(name);
		createRepostry.click();
	}
	
}
