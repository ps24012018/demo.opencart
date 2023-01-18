package demo.opencart;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.opencart.base.TestBase;
import demo.opencart.pages.HomePage;


public class TC_HomePage extends TestBase
{
	
	HomePage homepage;
	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		TestBase.initialization();
		homepage=new HomePage();

	}
	
	@Test(priority=0,description="Navigation Bar Test")
	public void NavBarHomePage() {
		System.out.println("TC : Verify all the navigation bar tabs are diplayed on Home Page.");
		Assert.assertTrue(homepage.validateNavBarDisplayed());
	}
	
	@Test(priority=1,description="Desktop Tab Option list Test")
	public void NavBarDesktopOptionList() throws InterruptedException {
		System.out.println("TC : Verify Desktop tab dropdown option hyperlinks");
		homepage.validateDesktopTabOptionLinks();
	}
	
	@Test(priority=2,description="Laptop&Notebooks Tab Option list Test")
	public void NavBarLaptopNotebookOptionList() throws InterruptedException {
		System.out.println("TC : Verify Laptop&Notebooks tab dropdown option hyperlinks");
		homepage.validateLaptopNotebookTabOptionLinks();
	}
	
	@Test(priority=3,description="Components Tab Option list Test")
	public void NavBarComponentsOptionList() throws InterruptedException {
		System.out.println("TC : Verify Components tab dropdown option hyperlinks");
		homepage.validateComponentsTabOptionLinks();
	}
	
	@Test(priority=4,description="Tablets Tab Option list Test")
	public void NavBarTabletsOptionList() throws InterruptedException {
		System.out.println("TC : Verify Tablets tab dropdown option hyperlinks");
		homepage.validateTabletsTabOptionLinks();
	}
	
	@Test(priority=5,description="Software Tab Option list Test")
	public void NavBarSoftwareOptionList() throws InterruptedException {
		System.out.println("TC : Verify Software tab dropdown option hyperlinks");
		homepage.validateSoftwareTabOptionLinks();
	}
	
	@Test(priority=6,description="Phones&PDAs Tab Option list Test")
	public void NavBarPhonesPDAsOptionList() throws InterruptedException {
		System.out.println("TC : Verify Phones&PDAs tab dropdown option hyperlinks");
		homepage.validatePhonesPDAsTabOptionLinks();
	}
	
	@Test(priority=7,description="Cameras Tab Option list Test")
	public void NavBarCamerasOptionList() throws InterruptedException {
		System.out.println("TC : Verify Cameras tab dropdown option hyperlinks");
		homepage.validateCamerasTabOptionLinks();
	}
	
	@Test(priority=8,description="MP3 Players Tab Option list Test")
	public void NavBarMP3PlayerOptionList() throws InterruptedException {
		System.out.println("TC : Verify MP3 Players tab dropdown option hyperlinks");
		homepage.validateMp3PlayersTabOptionLinks();
	}
	
	@Test(priority=9,description="Search field test")
	public void searchTest() throws InterruptedException {
		System.out.println("TC : Verify Search field.");
		Assert.assertFalse(homepage.validateSearchFieldError());
		}
	
	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
	
	
	
}
