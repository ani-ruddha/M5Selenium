package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraryOrUtility.BaseClass;
import genericLibraryOrUtility.ExcelUtility;
import objectRepository.AdminPage;
import objectRepository.DashboardPage;

@Listeners(genericLibraryOrUtility.ListenersImplementationClass.class)
public class Ad_01 extends BaseClass {

	@Test(retryAnalyzer = genericLibraryOrUtility.RetryAnalyzerImplementationClass.class)
	public void adminModule() throws Exception {
		ExcelUtility EUTIL = new ExcelUtility();
		String USERNAME = EUTIL.getDataFromExcel("Admin", 1, 1);
		String EMPNAME = EUTIL.getDataFromExcel("Admin", 1, 2);
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnAdmin();
		
		AdminPage AP = new AdminPage(driver);
		AP.provideFields(USERNAME, EMPNAME);

		System.out.println("admin module execution done!!");

	}
}
