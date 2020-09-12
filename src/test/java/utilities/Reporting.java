package utilities;

//Listener class used to generate Extent reports

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import helper.DynamicName;

public class Reporting extends TestListenerAdapter {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	DynamicName name;
	WebDriver driver;

	public void onStart(ITestContext testContext) {
		name = new DynamicName();
		driver = (WebDriver) testContext.getAttribute("WebDriver");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String repName = "Test-Report-" + timeStamp + ".html";
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + repName); // report
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");

		extent = new ExtentReports();
		extent.setReportUsesManualConfiguration(false);
		extent.attachReporter(htmlReporter);
		extent.setReportUsesManualConfiguration(true);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", System.getProperty("user.name"));
		htmlReporter.config().setDocumentTitle("MessageStudio Test Project"); // Tile of report
		htmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM); // location of the chart
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	public void onTestSuccess(ITestResult tr) {
		extent.setReportUsesManualConfiguration(false);
		File des = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(des, new File(
					System.getProperty("user.dir")+"/Screenshots/" + tr.getName() + name.getName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger = extent.createTest(tr.getName()); // create new entry in th report
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN)); // send the passed
																							// information to the report
																							// // with GREEN color
																							// highlight
		String screenshotPath = System.getProperty("user.dir")+"/Screenshots/" + tr.getName() + name.getName() + ".png";
		

		File f = new File(screenshotPath);
	
		if (f.exists()) {
			try {
				logger.pass("Screenshot is below:" + logger.addScreenCaptureFromPath("../Screenshots/" + tr.getName() + name.getName() + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void onTestFailure(ITestResult tr) {
		extent.setReportUsesManualConfiguration(false);
		File des = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {

			FileUtils.copyFile(des, new File(
					System.getProperty("user.dir")+ "/Screenshots/" + tr.getName() + name.getName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger = extent.createTest(tr.getName()); // create new entry in th report
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED)); // send the passed information
		logger.log(Status.FAIL, "Error Details :- \n" + tr.getThrowable().getMessage()); // to the report with GREEN
		// color highlighted

		String screenshotPath = "/Screenshots/" + tr.getName() + name.getName()
				+ ".png";

		File f = new File(screenshotPath);

		if (f.exists()) {
			try {
				logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath("../Screenshots/" + tr.getName() + name.getName() + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void onTestSkipped(ITestResult tr) {
		driver.navigate().refresh();
//		logger = extent.createTest(tr.getName()); // create new entry in th report
//		logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}

	public void onFinish(ITestContext testContext) {
		extent.flush();
	}
}
