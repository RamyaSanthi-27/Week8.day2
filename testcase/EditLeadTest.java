package week8.day2.ExtentReport.testcase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;
import week8.day2.ExtentReport.pages.LoginPage;

public class EditLeadTest extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
		sheets="EditLead";
		testName="EditLead Test";
		testDescription="EditLead Test For LeafTap application";
		testAuthor="Ramya";
		tesCategory="Regression";
	}
	
	@Test(dataProvider = "getData")
	public void editLeadTest(String uname,String pwd,String pnum,String cname ) throws InterruptedException, IOException{
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
		.clickLeadIDForEdit()
		.clickEditeLead()
		.enterCompanyName(cname)
		.clickTocreate()
		.VerifyFirstName();
	}
}
