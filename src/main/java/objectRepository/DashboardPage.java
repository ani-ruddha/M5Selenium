package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class is the pom class for Dashboard page
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class DashboardPage {

	@FindBy(xpath = "//span[text()='Admi']")
	private WebElement admin;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement claim;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement button;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutButton;

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getPim() {
		return pim;
	}

	public WebElement getClaim() {
		return claim;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	/**
	 * this is the business library to perform the logout operation
	 */
	public void logoutOperation()
	{
		getButton().click();
		getLogoutButton().click();
	}
	/**
	 * this method is to click on Admin button
	 */
	public void clickOnAdmin()
	{
		getAdmin().click();
	}
	/**
	 * this method is to click on Admin and logout
	 */
	public void clickOnAdminAndLogout()
	{
		getAdmin().click();
		logoutOperation();
	}
	
	public void clickOnPim()
	{
		getPim().click();
	}
	
	public void clickOnClaim()
	{
		getClaim().click();
	}
	/**
	 * this method is to click on pim and logout
	 */
	public void clickOnPimAndLogout()
	{
		getPim().click();
		logoutOperation();
	}
	/**
	 * this method is to click on claim and lgout
	 */
	public void clickOnClaimAndLogout()
	{
		getClaim().click();
		logoutOperation();
	}
	
	
}
