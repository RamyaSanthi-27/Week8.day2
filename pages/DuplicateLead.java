package week8.day2.ExtentReport.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;


public class DuplicateLead extends ProjectSpecificMethod{
	
	public DuplicateLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public FindLead findLead() throws IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("Click FindLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click FindLead is not Sucessfully"+e, "fail");
		}
		return new FindLead(driver,node);
	}
	
	public DuplicateLead clickDuplicateLead() throws IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.linkText("Duplicate Lead")).click();
			reportStep("Click Duplicate Lead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click Duplicate Lead is not Sucessfully"+e, "fail");
		}
		return this;
	}
	
	public VerifyLeadID clickCreateLeads() throws IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.name("submitButton")).click();
			reportStep("Click CreateLead for Duplicate Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click CreateLead for Duplicate is not Sucessfully"+e, "fail");
		}
		return new VerifyLeadID(driver,node);
	}
	

}
