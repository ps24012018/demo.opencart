package demo.opencart.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo.opencart.utility.TestUtils;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
    public static WebDriverWait wait;

	public TestBase() 
	{
		try {
			prop = new Properties();
			String input_path= System.getProperty("user.dir").toString()+"/src/main/java/demo/opencart/config/config.properties";
			FileInputStream iP = new FileInputStream(input_path);
			prop.load(iP);
			
			PageFactory.initElements(driver, this);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void initialization() throws InterruptedException 
	{
		
		String browserName=prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{
			String chromeDriverPath=System.getProperty("user.dir").toString()+"/resources/chromedriver_v109.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			String firefoxDriverPath=System.getProperty("user.dir").toString()+"/resources/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		Thread.sleep(4000);
	    wait=new WebDriverWait(driver,30);
		
	}

	public static void tearDown() {
		driver.close();
	}
	
}
