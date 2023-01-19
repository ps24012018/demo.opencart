package demo.opencart;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.opencart.base.TestBase;
import demo.opencart.pages.RegisterPage;

public class TC_RegisterPage extends TestBase
{

	RegisterPage register;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		TestBase.initialization();
		register=new RegisterPage();
		
	}
	
	@Test
	public void registerTest() throws InterruptedException {
		register.Register();
	}
	
	
	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
	
}
