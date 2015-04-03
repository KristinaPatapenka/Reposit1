package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRepository {

	private WebDriver driver1;

	@FindBy(name = "Settings")
//	@FindBy(xpath = "//span[@class='full-word']")
	private WebElement settings;

	//@FindBy(xpath = "//button[@class='btn btn-danger boxed-action']")
	@FindBy(linkText = "Delete this repository")
	private WebElement deleteRep;
	
	@FindBy(name = "verify")
	private WebElement verifName;

	@FindBy(xpath = "//button[@class='btn btn-block btn-danger']")
	private WebElement deRepostry;

	public void deleteReposit(String name,WebDriver driver1) {
		this.driver1=driver1;
		PageFactory.initElements(driver1, this);
		
		System.out.println(driver1.getTitle());
		settings.click();
		deleteRep.click();
		verifName.sendKeys(name);
		deRepostry.click();
	}
	
}
