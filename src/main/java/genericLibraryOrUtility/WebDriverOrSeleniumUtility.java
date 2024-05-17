package genericLibraryOrUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
/**
 * this is a WebDriver utility class to use all the selenium WebDriver methods
 */

public class WebDriverOrSeleniumUtility {
/**
 * this method is to capture screenshot
 * @param name
 * @throws Exception
 */
	public void captureScreenshot(String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
	File src =	ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(".\\ScreenshotFolder\\"+name+".png");
	Files.copy(src, dest);
	}
	/**
	 * this method is to maximize the window
	 * @param driver
	 */
	public void windowMaximization(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is for implicit wait
	 * @param driver
	 * @param sec
	 */
	public void implicitWait(WebDriver driver , int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	/*Select class methods*/
	/**
	 * this method is to handle dropdown with index
	 * @param element
	 * @param indexNo
	 */
	public void selectWithIndex(WebElement element , int indexNo)
	{
		Select s = new Select(element);
		s.selectByIndex(indexNo);
	}
	/**
	 * this method is to handle dropdown with visible text
	 * @param element
	 * @param text
	 */
	public void selectWithVisibleText(WebElement element , String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * this method is to handle dropdown with value
	 * @param element
	 * @param value
	 */
	public void selectWithValue(WebElement element , String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is perform de-select operation by index
	 * @param element
	 * @param indexNo
	 */
	public void deSelectWithIndex(WebElement element , int indexNo)
	{
		Select s = new Select(element);
		s.deselectByIndex(indexNo);
	}
	/**
	 * this method is perform de-select operation by visible text
	 * @param element
	 * @param text
	 */
	public void deSelectWithVisibleText(WebElement element , String text)
	{
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	/**
	 * this method is perform de-select operation by value
	 * @param element
	 * @param value
	 */
	public void deSelectWithValue(WebElement element , String value)
	{
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	
	/*Actions class methods/Mouse action methods*/
	/**
	 * this method is to move mouse towards an element
	 * @param driver
	 * @param element
	 */
	public void moveTowardsElement(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element);		
	}
	/**
	 * this method is to perform right click on an Element
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element);		
	}
	/**
	 * this method we use to click on an element
	 * @param driver
	 * @param element
	 */
	public void clickOnElement(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.click(element);
	}
	/**
	 * this method is use to double click on an element
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element);		
	}
	/**
	 * this method is use to drag an element and drop it to another point
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDropOperation(WebDriver driver , WebElement src
			,WebElement dest)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest);
	}
	/**
	 * this methos is use to handle slider
	 * @param driver
	 * @param src
	 * @param x
	 * @param y
	 */
	public void sliderHandling(WebDriver driver , WebElement src , int x , int y )
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, x, y);	
	}
	/**
	 * this method is use to perform mouse action
	 * @param driver
	 */
	public void toPerformMouseAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.perform();
	}
	/**
	 * this method is use to scroll to an element
	 * @param driver
	 * @param element
	 */
	public void scrollUptoAnelement(WebDriver driver , WebElement element)
	{
		Actions act = new Actions(driver);
		act.scrollToElement(element);	
	}
	
	/*Alert popUp methods*/
	/**
	 * this method is use to accept the alert
	 * @param driver
	 */
	public void acceptTheAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * this method is use cancel the alert
	 * @param driver
	 */
	public void dismissTheAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is to fetch the alert message
	 * @param driver
	 * @return
	 */
	public String fetchAlertMsg(WebDriver driver)
	{
	String alertMsg =	driver.switchTo().alert().getText();
	return alertMsg;
	}
	/**
	 * this method is to send the alert message
	 * @param driver
	 * @param value
	 */
	public void sendAlertMsg(WebDriver driver , String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
}
