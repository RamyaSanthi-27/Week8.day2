package week8.day2.ExtentReport.testcase;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week8.day2.ExtentReport.base.ProjectSpecificMethod;
import week8.day2.ExtentReport.pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		sheets="Login";
		testName="Login";
		testDescription="Login Test For LeafTap application";
		testAuthor="Ramya";
		tesCategory="Smoke";
		
	}
	@Test(dataProvider = "getData")
	public void loginTest(String uname, String pwd) throws InterruptedException, IOException{
		//Create obj for loginPage
		LoginPage lp = new LoginPage(driver,node);
		lp.enterUserName(uname)
		.enterPassWord(pwd)
		.clickLogin();
		
	}

}
