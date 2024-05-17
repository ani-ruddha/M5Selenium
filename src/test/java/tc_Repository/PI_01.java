package tc_Repository;

import org.testng.annotations.Test;

import genericLibraryOrUtility.BaseClass;
import genericLibraryOrUtility.ExcelUtility;
import objectRepository.DashboardPage;
import objectRepository.PimPage;

public class PI_01 extends BaseClass{

	@Test(groups = {"regression"})
	public void pimModule() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String EMPNAME = EUTIL.getDataFromExcel("Pim", 1, 1);
		String EMPID = EUTIL.getDataFromExcel("Pim", 1, 2);
		String SUPERVISOR = EUTIL.getDataFromExcel("Pim", 1, 3);
		
		DashboardPage db = new DashboardPage(driver);
		db.clickOnPim();
		
		PimPage pim = new PimPage(driver);
		pim.fillValidCredentials(EMPNAME, EMPID, SUPERVISOR);	
		
		System.out.println("pim module run successfully!!");
		
	}
}
