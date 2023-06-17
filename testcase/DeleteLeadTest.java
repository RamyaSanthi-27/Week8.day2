package week8.day2.ExtentReport.testcase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;
import week8.day2.ExtentReport.pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="DeleteLead";
		testName="DeleteLead Test";
		testDescription="DeleteLead Test For LeafTap application";
		testAuthor="Ramya";
		tesCategory="Regression";
	}
	
	@Test(dataProvider = "getData")
	public void deleteLeadTest(String uname,String pwd,String pnum) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver,node);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.findLead()
		.clickPhoneNum()
		.enterPhoneNum(pnum)
		.clickFindLeads()
		.clickLeadIDForDel()
		.clickDeleteLead()
		.clickFindLID()
		.enterLeadId()
		.clickfindLID()
		.verifyLeadId();
	}
	
}
