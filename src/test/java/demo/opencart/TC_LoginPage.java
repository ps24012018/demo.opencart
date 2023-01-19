package demo.opencart;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.opencart.base.TestBase;
import demo.opencart.pages.HomePage;
import demo.opencart.pages.LoginPage;

public class TC_LoginPage extends TestBase {
	
	LoginPage login;
	
	public TC_LoginPage() {
	super();
	}
	
	@BeforeTest
	public void setup() throws InterruptedException {
		TestBase.initialization();
		login = new LoginPage();
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("TC : Verify login.");
		login.Login();
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		tearDown();
	}

}
