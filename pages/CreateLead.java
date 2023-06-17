package week8.day2.ExtentReport.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod{
	
	public CreateLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
		public CreateLead enterCompanyName(String cname) throws IOException {
			try {
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
				reportStep(cname+"CompanyName Entered Sucessfully", "pass");
			} catch (Exception e) {
				reportStep(cname+"CompanyName is not Entered Sucessfully"+e, "fail");
			}
			return this;

		}
		public CreateLead enterFirstName(String fname) throws IOException {
			try {
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
				reportStep(fname+"FirstName Entered Sucessfully", "pass");
			} catch (Exception e) {
				reportStep(fname+"FirstName is not Entered Sucessfully"+e, "fail");
			}
			return this;
		}
		
		public CreateLead enterLastName(String lname) throws IOException {
			try {
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
				reportStep(lname+"LastName Entered Sucessfully", "pass");
			} catch (Exception e) {
				reportStep(lname+"LastName Entered Sucessfully"+e, "fail");
			}
			return this;
		}
		public CreateLead enterPhoneNum(String pnum) throws IOException {
			try {
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
				reportStep(pnum+"PhoneNumber Entered Sucessfully", "pass");
			} catch (Exception e) {
				reportStep(pnum+"PhoneNumber is not Entered Sucessfully"+e, "fail");
			}
			return this;
		}
		
		public ViewLead submitCreateLead() throws IOException {
			try {
				driver.findElement(By.name("submitButton")).click();
				reportStep("CreateLead Button clicked Sucessfully","pass");
			} catch (Exception e) {
				reportStep("CreateLead Button is not clicked Sucessfully"+e,"fail");
			}	
			return new ViewLead(driver,node);
		}
		
		
		
		
		
	

	

}
