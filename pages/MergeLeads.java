package week8.day2.ExtentReport.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class MergeLeads extends ProjectSpecificMethod{
	public MergeLeads(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public MergeLeads clickFromLead() throws IOException {
		try {
			driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			driver.switchTo().window(allhandles.get(1));
			reportStep("Click FromLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click FromLead is notSucessfully"+e, "fail");
		}
		return this;
	}
	
	public MergeLeads enterFirstName(String fname1) throws InterruptedException, IOException {	
				
		try {
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname1);
			reportStep("Enter FirstName for FromLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Enter FirstName for FromLead is not Sucessfully"+e, "fail");
		}
		return this;
	}
	
	public MergeLeads clickFindLeads() throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			reportStep("Click FindLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click FindLead is not Sucessfully"+e, "fail");
		}
		return this;
	}
	
	public MergeLeads clickLeadID() throws InterruptedException, IOException {
		
		try {
			Thread.sleep(3000);
			//String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<String>(allWindows);
			driver.switchTo().window(allhandles.get(0));
			reportStep("Click LeadID Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click LeadID is not Sucessfully"+e, "fail");
		}
		return this;
	}
	public MergeLeads clickTolead() throws IOException {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Set<String> allWindows2 = driver.getWindowHandles();
			List<String> allhandles2 = new ArrayList<String>(allWindows2);
			driver.switchTo().window(allhandles2.get(1));
			reportStep("Click ToLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click ToLead is not Sucessfully"+e, "fail");
		}
		return this;
	}

public MergeLeads enFirstName(String fname2) throws InterruptedException, IOException {
	    	
		try {
			Thread.sleep(5000);		
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname2);
			reportStep("Enter FirstName for ToLead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Enter FirstName for ToLead is not Sucessfully"+e, "fail");
		}
		return this;
	}

public MergeLeads clFindLeads() throws InterruptedException, IOException {
	
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	} catch (Exception e) {
		reportStep("Click FindLead is not Sucessfully"+e, "fail");
	}
	return this;
}

public MergeLeads clLeadID() throws InterruptedException, IOException {
	
	try {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		reportStep("Click LeadID Sucessfully", "pass");
	} catch (Exception e) {
		reportStep("Click LeadID is not Sucessfully"+e, "fail");
	}
	return this;
}
	public VerifyLeadID clickMerge() throws IOException {		
		try {
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			driver.switchTo().alert().accept();
			reportStep("Click Merge Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click Merge is not Sucessfully"+e, "fail");
		}
		return new VerifyLeadID(driver,node);
	}
}
