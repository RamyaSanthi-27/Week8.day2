package week8.day2.ExtentReport.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class MergeLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="MergeLead";
	}
	@Test(dataProvider = "getData")
	public void mergeLeadTest(String uname, String pwd, String fname1,String fname2) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.mergeLead()
		.clickFromLead()
		.enterFirstName(fname1)
		.clickFindLeads()
		.clickLeadID()
		.clickTolead()
		.enFirstName(fname2)
		.clFindLeads()
		.clLeadID()
		.clickMerge()
		.clickFindLID()
		.enterLeadId()
		.clickfindLID()
		.verifyLeadId();
		
		
		
	}
}
