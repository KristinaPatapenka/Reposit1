package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewREpostoryPage {

	private WebDriver driver1;

	@FindBy(linkText = "Create a repository")
	private WebElement crRpository;

	@FindBy(name = "repository[name]")
	private WebElement repName;

	@FindBy(xpath = "//button[@class='btn btn-primary first-in-line']")
	private WebElement createRepostry;

	public void createReposit(String name,WebDriver driver1) {
		this.driver1=driver1;
		PageFactory.initElements(driver1, this);
		System.out.println(driver1.getTitle());
		crRpository.click();
		repName.sendKeys(name);
		createRepostry.click();
		
		
	}
	
}
