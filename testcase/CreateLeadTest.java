package week8.day2.ExtentReport.testcase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;
import week8.day2.ExtentReport.pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="CreateLead";
		testName="CreateLead Test";
		testDescription="CreateLead Test For LeafTap application";
		testAuthor="Ramya";
		tesCategory="Regression";
	}
	@Test(dataProvider = "getData")
	public void createLeadTest(String uname,String pwd,String cname,String fname,String lname, String pnum) throws InterruptedException, IOException{
		LoginPage lp = new LoginPage(driver, node);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.createLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhoneNum(pnum)
		.submitCreateLead()
		.VerifyFirstName();
	}
	

}




