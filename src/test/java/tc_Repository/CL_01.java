package tc_Repository;

import org.testng.annotations.Test;

import genericLibraryOrUtility.BaseClass;
import genericLibraryOrUtility.ExcelUtility;
import objectRepository.ClaimPage;
import objectRepository.DashboardPage;

public class CL_01 extends BaseClass{

	@Test(groups = {"smoke" , "regression"})
	public void claimModule() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String EMPNAME = EUTIL.getDataFromExcel("Claim", 1, 1);
		String REFID = EUTIL.getDataFromExcel("Claim", 1, 2);
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickOnClaim();
		
		ClaimPage cp = new ClaimPage(driver);
		cp.fillTheDetails(EMPNAME, REFID);
		System.out.println("claim module run successfully!!");
	}
}
