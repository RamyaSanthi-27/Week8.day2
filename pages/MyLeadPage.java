package week8.day2.ExtentReport.pages;

import org.openqa.selenium.By;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;

public class MyLeadPage extends ProjectSpecificMethod{
	
	public MyLeadPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public CreateLead createLead() throws InterruptedException{		
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver,node);
	}
	public FindLead findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLead(driver,node);
	}
	public MergeLeads mergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeads(driver,node);
	}
	
}
