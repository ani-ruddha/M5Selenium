package genericLibraryOrUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.DashboardPage;
import objectRepository.LoginPage;

/**
 * this is the base class for all the common features
 * 
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class BaseClass {

	public static WebDriver driver = null;
	public PropertiesUtility PUTIL = new PropertiesUtility();

	@BeforeSuite(alwaysRun = true)
	public void connectDatabase() {
		System.out.println("Db connection successfull!!");
	}

	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		String URL = PUTIL.getDataFromProperties("url");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println("browser launched successfully!!");
		Thread.sleep(3000);

	}

	@BeforeMethod(alwaysRun = true)
	public void loginUser() throws Exception {
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		System.out.println("Login successfull!!");

	}

	@AfterMethod(alwaysRun = true)
	public void logoutUser() {
		DashboardPage dp = new DashboardPage(driver);
		dp.logoutOperation();
		System.out.println("logout successfull!!");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed successfully!!");
	}

	@AfterSuite(alwaysRun = true)
	public void closeDbConnection() {
		System.out.println("Db connection closed successfully!!");
	}
}
