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

	public void fff(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", "172.16.0.101");
		profile.setPreference("network.proxy.http_port", 3128);
		FirefoxBinary binary = new FirefoxBinary(
				new File(
						"c:\\Users\\student\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));

	//	WebDriver driver = new FirefoxDriver(binary, profile);
	}
	
	
	public void oneCanOpenGithub() {
		
		fff();
		
		WebDriver driver = new FirefoxDriver();
		String URL = "https://github.com";
		driver.get(URL);
		
		HomePage homePage = new HomePage();
		homePage.clickUser();
		
		LoginPage loginPage = new LoginPage();
		loginPage.loginUser("kris-pat@tut.by", "qazWSXedc12345");
		
		CreateNewREpostoryPage createRep = new CreateNewREpostoryPage();
		createRep.createReposit("NEW11");
		
		DeleteRepository deleteRep = new DeleteRepository();
		deleteRep.deleteReposit("NEW11");
		
	}

	 @Test 
	 public void oneCanGithub(){ 
		 
	  FirefoxProfile profile = new
	  FirefoxProfile(); profile.setPreference("network.proxy.type", 1);
	  profile.setPreference("network.proxy.http", "172.16.0.101");
	  profile.setPreference("network.proxy.http_port", 3128); FirefoxBinary
	  binary = new FirefoxBinary(new
	  File("c:\\Users\\student\\AppData\\Local\\Mozilla Firefox\\firefox.exe"
	  ));
	  
	  WebDriver driver = new FirefoxDriver(binary, profile);
	  
	  String URL = "https://github.com"; driver.get(URL);
	  
	  
	  WebElement SignIn = driver.findElement(By.linkText("Sign in"));
	  SignIn.click();
	  
	  WebElement login = driver.findElement(By.name("login"));
	  login.sendKeys("kris-pat@tut.by");
	  
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("qazWSXedc12345");
	  
	  
	  WebElement commit = driver.findElement(By.name("commit"));
	  commit.click();
	  
	  WebElement CrRpository =
	  driver.findElement(By.linkText("Create a repository"));
	  CrRpository.click();
	  
	  WebElement RepName = driver.findElement(By.name("repository[name]"));
	  RepName.sendKeys("NEW1");
	  
	  
	  WebElement CreateRepostry =
	  driver.findElement(By.xpath("//button[@class='button primary first-in-line']"
	  )); CreateRepostry.click();
	  
	  WebElement Settings = driver.findElement(By.name("Settings"));
	  Settings.click();
	  
	  WebElement DeleteRep =
	  driver.findElement(By.linkText("Delete this repository"));
	  DeleteRep.click();
	  
	  WebElement VerifName = driver.findElement(By.name("verify"));
	  VerifName.sendKeys("NEW1");
	  
	  WebElement DeRepostry =
	  driver.findElement(By.xpath("//button[@class='button button-block danger']"
	  )); DeRepostry.click(); }
	 
}
