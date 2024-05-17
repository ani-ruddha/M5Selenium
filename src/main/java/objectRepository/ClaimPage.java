package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for claim page
 * @author Aniruddha Das
 * @version 5.1.1
 */
public class ClaimPage {	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement empname;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	private WebElement refId;

	public ClaimPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getEmpname() {
		return empname;
	}

	public WebElement getRefId() {
		return refId;
	}
	/**
	 * this is the business library to fill the details
	 * @param ename
	 * @param refId
	 */
	public void fillTheDetails(String ename , String refId)
	{
		getEmpname().sendKeys(ename);
		getRefId().sendKeys(refId);
	}
}
