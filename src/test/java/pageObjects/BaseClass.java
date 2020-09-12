package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import helper.ActionHelper;
import helper.DataSource;
import helper.DynamicName;
import helper.JavaScriptExecute;
import helper.SelectHelper;
import utilities.*;

/**
 * Base Class for Initial setup Before starting Test.
 */

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String org = readconfig.getOrganization();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	public static JavaScriptExecute js;
	public static SelectHelper select;
	public static DynamicName name;
	public static ActionHelper action;
	public static WebDriverWait wait;
	public static DataSource dataSource;
	public static Logger logger;


	@Parameters("browser")
	@BeforeSuite
	public void setup(String br, ITestContext context) {
		logger = Logger.getLogger("christianlouboutin");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver = new FirefoxDriver();
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
			driver = new InternetExplorerDriver();
		}
		context.setAttribute("WebDriver", driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		js = new JavaScriptExecute(driver);
		action = new ActionHelper(driver);
		select = new SelectHelper();
	}

	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	public static void waitForElement(WebElement ele) {
		try {
			System.out.println("*********=-----Letting image load successfully-----*********");
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOf(ele));
			System.out.println("wait for element ele value" + ele);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Element doesn't exist verify it...!!!");
		}
	}

}
