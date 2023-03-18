package pageObjects;

import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

import helper.ActionHelper;
import helper.DynamicName;
import helper.JavaScriptExecute;
import helper.SelectHelper;
import utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String org = readconfig.getOrganization();
	public static WebDriver driver;
	public static JavaScriptExecute js;
	public static SelectHelper select;
	public static DynamicName name;
	public static ActionHelper action;
	public static WebDriverWait wait;
	public static DataSource dataSource;
	public static Logger logger;


	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void setup(String br, ITestContext context) {
	logger = Logger.getLogger("https://qa.salesrails.io/");
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
		//wait = new WebDriverWait(driver, 30);
		js = new JavaScriptExecute(driver);
		action = new ActionHelper(driver);
		select = new SelectHelper();
	}

	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		//driver.quit();
	}
	

}
