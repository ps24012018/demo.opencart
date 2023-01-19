package demo.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.opencart.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//div[@class='col-md-3 col-lg-4']//div[@id='logo']//a//img")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='dropdown']//a[@class='dropdown-toggle']//i[@class='fas fa-user']")
	WebElement myAccount;
	
	@FindBy(xpath="//div[@class='dropdown']//ul[@class='dropdown-menu dropdown-menu-right show']//li//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath="//div[@class='mb-3']//input[@type='text' and @name='email']")
	WebElement email_field;
	
	@FindBy(xpath="//div[@class='mb-3']//input[@type='password' and @name='password']")
	WebElement password_field;
	
	@FindBy(xpath="//div[@class='card-body']//button[@type='submit']")
	WebElement login_button;
	
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage Login() throws InterruptedException {
		
		myAccount.click();
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
		email_field.sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		password_field.sendKeys("password");
		Thread.sleep(1000);
		login_button.click();
		Thread.sleep(1000);
		
		System.out.println("   >  Back to Home Page.");
		logo.click();
		Thread.sleep(1000);
		
		return new LoginPage();	
	}
	
	
}
