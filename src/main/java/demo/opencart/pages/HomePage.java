package demo.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import demo.opencart.base.TestBase;

public class HomePage extends TestBase{
	
	int i;
					
	@FindBy(xpath="//div[@class='col-md-3 col-lg-4']//div[@id='logo']//a//img")
	WebElement logo_home_page;
	
	@FindBy(xpath="//li[@class='nav-item dropdown']//a[@class='nav-link dropdown-toggle' and contains(text(),'Desktops')] ")
	WebElement navigation_bar_desktops;

	@FindBy(xpath="//li[@class='nav-item dropdown']//a[@class='nav-link dropdown-toggle' and contains(text(),'Laptops & Notebooks')] ")
	WebElement navigation_bar_laptops_notebooks;

	@FindBy(xpath="//li[@class='nav-item dropdown']//a[@class='nav-link dropdown-toggle' and contains(text(),'Components')] ")
	WebElement navigation_bar_components;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@class='nav-link' and contains(text(),'Tablets')]")
	WebElement navigation_bar_tablets;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@class='nav-link' and contains(text(),'Software')]")
	WebElement navigation_bar_software;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@class='nav-link' and contains(text(),'Phones & PDAs')]")
	WebElement navigation_bar_phones_pdas;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@class='nav-link' and contains(text(),'Cameras')]")
	WebElement navigation_bar_cameras;
	
	@FindBy(xpath="//li[@class='nav-item dropdown']//a[@class='nav-link dropdown-toggle' and contains(text(),'MP3 Players')] ")
	WebElement navigation_bar_mp3players;
	
	@FindBy(xpath="//div[@id='search']//input[@type='text']")
	WebElement searchField;
	
	@FindBy(xpath="//div[@id='search']//button[@type='button']")
	WebElement searchButton;
	
		
	//Initialization of Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateNavBarDisplayed() {
		
		boolean flag=true;
		
		if(navigation_bar_desktops.isDisplayed()) {
			System.out.println("    >  Desktop Tab displayed.");
			
		}
		
		if(navigation_bar_laptops_notebooks.isDisplayed()) {
			System.out.println("    >  Laptops & notebooks Tab displayed.");
			
		}
		
		if(navigation_bar_components.isDisplayed()) {
			System.out.println("    >  Components Tab displayed.");
			
		}
		
		if(navigation_bar_tablets.isDisplayed()) {
			System.out.println("    >  Tablets Tab displayed.");
			
		}
		
		if(navigation_bar_software.isDisplayed()) {
			System.out.println("    >  Software Tab displayed.");
			
		}
		
		if(navigation_bar_phones_pdas.isDisplayed()) {
			System.out.println("    >  Phones & PDAs Tab displayed.");
			
		}
		
		if(navigation_bar_cameras.isDisplayed()) {
			System.out.println("    >  Cameras Tab displayed.");
			
		}
		
		if(navigation_bar_mp3players.isDisplayed()) {
			System.out.println("    >  MP3Players Tab displayed.");
			
		}
		
		
		else {
			System.out.println("    >  A certain tab is not displayed.");
			flag=false;
		}
		
		return flag;
	}
	
	public HomePage validateDesktopTabOptionLinks() throws InterruptedException {
				
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_desktops));
		navigation_bar_desktops.click();
		Thread.sleep(1000);
		
		int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
		System.out.println("   >  List of options in Desktop tab = " + tab_list_count);		
		
		
		for(i=1;i<=tab_list_count;i++) {
			
			String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
			
			driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
			
			Thread.sleep(2000);
			
			System.out.println("   >  Option" + i + " in the list clicked.");
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			System.out.println("   >  Back to Home Page.");
			
			wait.until(ExpectedConditions.visibilityOf(logo_home_page));
			
			navigation_bar_desktops.click();
			
		}
		
		return new HomePage();
	}
	
	public HomePage validateLaptopNotebookTabOptionLinks() throws InterruptedException {
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_laptops_notebooks));
		navigation_bar_laptops_notebooks.click();
		Thread.sleep(1000);
		
		int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
		System.out.println("   >  List of options in Laptops&Notebooks tab = " + tab_list_count);		
		
		
		for(i=1;i<=tab_list_count;i++) {
			
			String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
			
			driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
			
			Thread.sleep(2000);
			
			System.out.println("   >  Option" + i + " in the list clicked.");
			
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			System.out.println("   >  Back to Home Page.");
			
			wait.until(ExpectedConditions.visibilityOf(logo_home_page));
			
			navigation_bar_laptops_notebooks.click();
			
		}
		
		return new HomePage();
	}
	
	public HomePage validateComponentsTabOptionLinks() throws InterruptedException {
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_components));
		navigation_bar_components.click();
		Thread.sleep(1000);
		
		int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
		System.out.println("    >  List of options in Components tab = " + tab_list_count);		
		
		
		for(i=1;i<=tab_list_count;i++) {
			
			String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
			
			driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
			
			Thread.sleep(2000);
			
			System.out.println("   >  Option" + i + " in the list clicked.");
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			System.out.println("   >  Back to Home Page.");
			
			wait.until(ExpectedConditions.visibilityOf(logo_home_page));
			
			navigation_bar_components.click();
			
		}
		
		return new HomePage();
	}
	
		
		public HomePage validateTabletsTabOptionLinks() throws InterruptedException {
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_tablets));
			navigation_bar_tablets.click();
			Thread.sleep(1000);
			
			int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
			System.out.println("   >  List of options in Tablets tab = " + tab_list_count);		
			
			
			for(i=1;i<=tab_list_count;i++) {
				
				String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
				
				driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
				
				Thread.sleep(2000);
				
				System.out.println("   >  Option" + i + " in the list clicked.");
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				System.out.println("   >  Back to Home Page.");
				
				wait.until(ExpectedConditions.visibilityOf(logo_home_page));
				
				navigation_bar_tablets.click();
				
			}
		
		return new HomePage();
	}
	
		public HomePage validateSoftwareTabOptionLinks() throws InterruptedException {
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_software));
			navigation_bar_software.click();
			Thread.sleep(1000);
			
			int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
			System.out.println("   >  List of options in Software tab = " + tab_list_count);		
			
			
			for(i=1;i<=tab_list_count;i++) {
				
				String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
				
				driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
				
				Thread.sleep(2000);
				
				System.out.println("   >  Option" + i + " in the list clicked.");
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				System.out.println("   >  Back to Home Page.");
				
				wait.until(ExpectedConditions.visibilityOf(logo_home_page));
				
				navigation_bar_software.click();
				
			}
		
		return new HomePage();
	}
	
		public HomePage validatePhonesPDAsTabOptionLinks() throws InterruptedException {
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_phones_pdas));
			navigation_bar_phones_pdas.click();
			Thread.sleep(1000);
			
			int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
			System.out.println("   >  List of options in Phones & PDAs tab = " + tab_list_count);		
			
			
			for(i=1;i<=tab_list_count;i++) {
				
				String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
				
				driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
				
				Thread.sleep(2000);
				
				System.out.println("   >  Option" + i + " in the list clicked.");
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				System.out.println("   >  Back to Home Page.");
				
				wait.until(ExpectedConditions.visibilityOf(logo_home_page));
				
				navigation_bar_phones_pdas.click();
				
			}
		
		return new HomePage();
	}
		
		
		public HomePage validateCamerasTabOptionLinks() throws InterruptedException {
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_cameras));
			navigation_bar_cameras.click();
			Thread.sleep(1000);
			
			int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
			System.out.println("   >  List of options in Cameras tab = " + tab_list_count);		
			
			
			for(i=1;i<=tab_list_count;i++) {
				
				String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
				
				driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
				
				Thread.sleep(2000);
				
				System.out.println("   >  Option" + i + " in the list clicked.");
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				System.out.println("   >  Back to Home Page.");
				
				wait.until(ExpectedConditions.visibilityOf(logo_home_page));
				
				navigation_bar_cameras.click();
				
			}
		
		return new HomePage();
	}
	
		public HomePage validateMp3PlayersTabOptionLinks() throws InterruptedException {
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(navigation_bar_mp3players));
			navigation_bar_mp3players.click();
			Thread.sleep(1000);
			
			int tab_list_count=driver.findElements(By.xpath("//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li")).size();
			System.out.println("   >  List of options in MP3 Players tab = " + tab_list_count);		
			
			
			for(i=1;i<=tab_list_count;i++) {
				
				String navigation_bar_drpdwn_options="//div[@class='dropdown-menu show']//div[@class='dropdown-inner']//ul[@class='list-unstyled']//li["+i+"]";
				
				driver.findElement(By.xpath(navigation_bar_drpdwn_options)).click();
				
				Thread.sleep(2000);
				
				System.out.println("   >  Option" + i + " in the list clicked.");
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				System.out.println("   >  Back to Home Page.");
				
				wait.until(ExpectedConditions.visibilityOf(logo_home_page));
				
				logo_home_page.click();
				
			}
		
		return new HomePage();
	}
	
		
		public boolean validateSearchFieldError() throws InterruptedException {
			
			Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(searchField));
			searchField.click();
			searchField.sendKeys("abc");
			searchButton.click();
			Thread.sleep(1000);
			
			String error_xpath="//*[contains(text(),'Error')]";
			boolean error_flag=driver.findElement(By.xpath(error_xpath)).isDisplayed();
			
			
			driver.navigate().back();
			
		return error_flag ;
	}
		
}


