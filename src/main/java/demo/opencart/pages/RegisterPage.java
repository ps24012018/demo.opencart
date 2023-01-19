package demo.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demo.opencart.base.TestBase;

public class RegisterPage extends TestBase
{
	@FindBy(xpath="//div[@class='col-md-3 col-lg-4']//div[@id='logo']//a//img")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='dropdown']//a[@class='dropdown-toggle']//i[@class='fas fa-user']")
	WebElement myAccount;
	
	@FindBy(xpath="//div[@class='dropdown']//ul[@class='dropdown-menu dropdown-menu-right show']//li//a[contains(text(),'Register')]")
	WebElement register;

	@FindBy(xpath="//div[@class='col-sm-10']//input[@type='text' and @name='firstname']")
	WebElement register_firstname;
	
	@FindBy(xpath="//div[@class='col-sm-10']//input[@type='text' and @name='lastname']")
	WebElement register_lastname;
	
	@FindBy(xpath="//div[@class='col-sm-10']//input[@type='email' and @name='email']")
	WebElement register_email;
	
	@FindBy(xpath="//div[@class='col-sm-10']//input[@type='password' and @name='password']")
	WebElement register_password;
	
	@FindBy(xpath="//div[@class='form-check form-check-inline']//input[@type='radio' and @id='input-newsletter-no']")
	WebElement register_newsletter_no;
	
	@FindBy(xpath="//div[@class='form-check form-check-inline']//input[@type='checkbox' and @name='agree']")
	WebElement register_policy_checkbox;
	
	@FindBy(xpath="//div[@class='float-end text-right']//button[@type='submit']")
	WebElement register_continue_button;
	
	public RegisterPage Register() throws InterruptedException {
		
		myAccount.click();
		Thread.sleep(1000);
		register.click();
		Thread.sleep(1000);
		register_firstname.sendKeys("firstname");
		Thread.sleep(1000);
		register_lastname.sendKeys("lastname");
		Thread.sleep(1000);
		register_email.sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(1000);
		
		register_password.sendKeys("password");
		Thread.sleep(1000);
		register_newsletter_no.click();
		Thread.sleep(1000);
		register_policy_checkbox.click();
		Thread.sleep(1000);
		register_continue_button.click();
		Thread.sleep(1000);
				
		System.out.println("   >  Back to Home Page.");
		logo.click();
		Thread.sleep(1000);

		return null;
	}
	
	
	
	
}
