package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for Admin page
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class AdminPage {

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement empname;

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getEmpname() {
		return empname;
	}
	/**
	 * this is a business library to provide the username and empname
	 * @param uname
	 * @param ename
	 */
	public void provideFields(String uname , String ename)
	{
		getUsername().sendKeys(uname);
		getEmpname().sendKeys(ename);
	}
	/**
	 * this is a business library to provide the username
	 * @param uname
	 */
	public void provideFields(String uname)
	{
		getUsername().sendKeys(uname);		
	}
	/**
	 * this is a business library to provide the empname
	 * @param ename
	 */
	public void provideFieldsWithEname(String ename)
	{
		getEmpname().sendKeys(ename);
	}
	
}
