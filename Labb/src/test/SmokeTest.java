package test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;


public class SmokeTest {
	
	private static final String username="kris-pat@tut.by";
	private static final String password="qazWSXedc12345";

	public WebDriver getDriver(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", "172.16.0.101");
		profile.setPreference("network.proxy.http_port", 3128);
		FirefoxBinary binary = new FirefoxBinary(
				new File(
						"c:\\Users\\student\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));

	WebDriver driver = new FirefoxDriver(binary, profile);
	
	return driver;
	}
	
	
	 @Test 
	public void oneCanOpenGithub() {
		
		WebDriver driver;
		driver=getDriver();
		
		String URL = "https://github.com";
		driver.get(URL);
		
		HomePage homePage = new HomePage();
		homePage.clickUser(driver);
		
		LoginPage loginPage = new LoginPage();
		loginPage.loginUser(username, password,driver);
		
		CreateNewREpostoryPage createRep = new CreateNewREpostoryPage();
		createRep.createReposit("NEW11",driver);
		
		DeleteRepository deleteRep = new DeleteRepository();
		deleteRep.deleteReposit("NEW11",driver);
		
	}
}
