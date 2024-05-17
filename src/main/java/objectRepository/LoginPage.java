package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//for declaration of webelements
	@FindBy(xpath = "//input[@placeholder='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginBtn;

//initialization of Webelements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//Accessing the webelements
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
/**
 * this is the business library for login operation
 * @param uname
 * @param pass
 */
	public void login(String uname , String pass)
	{
		getUsername().sendKeys(uname);
		getPassword().sendKeys(pass);
		getLoginBtn().click();
		
	}
}
