package week8.day2.ExtentReport.pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class DeleteLead extends ProjectSpecificMethod{
	public DeleteLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public FindLead findLead() throws IOException {
		try {
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("Click FindLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click FindLead is not Sucessfully"+e, "fail");
		}
		return new FindLead(driver,node);
	}
	
	public VerifyLeadID clickDeleteLead() throws IOException {
		try {
			driver.findElement(By.linkText("Delete")).click();
			reportStep("Click DeleteLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click DeleteLead is not Sucessfully"+e, "fail");
		}
		return new VerifyLeadID(driver,node);
	}
	

}
