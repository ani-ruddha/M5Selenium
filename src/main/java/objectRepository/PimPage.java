package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for PIM page
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class PimPage {

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement empname;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empId;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	private WebElement supervisorName;

	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmpname() {
		return empname;
	}

	public WebElement getEmpId() {
		return empId;
	}

	public WebElement getSupervisorName() {
		return supervisorName;
	}
	/**
	 * this is the business library to fill valid credentials for Pim page
	 * @param ename
	 * @param id
	 * @param sname
	 */
	public void fillValidCredentials(String ename , String id , String sname)
	{
		getEmpname().sendKeys(ename);
		getEmpId().sendKeys(id);
		getSupervisorName().sendKeys(sname);
	}
	
}
