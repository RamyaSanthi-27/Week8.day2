package week8.day2.ExtentReport.testcase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;
import week8.day2.ExtentReport.pages.LoginPage;

public class DuplicateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="DuplicateLead";
		testName="DuplicateLead Test";
		testDescription="DuplicateLead Test For LeafTap application";
		testAuthor="Ramya";
		tesCategory="Regression";
	}
	@Test(dataProvider = "getData")
	public void dplicateLeadTest(String uname,String pwd,String pnum) throws InterruptedException, IOException{
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
		.clickLeadIDForDup()
		.clickDuplicateLead()
		.clickCreateLeads()
		.clickFindLID()
		.enterLeadId()
		.clickfindLID()
		.verifyLeadId();
	
		
	}
}
