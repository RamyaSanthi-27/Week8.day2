package week8.day2.ExtentReport.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class FindLead extends ProjectSpecificMethod{

	public FindLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	public FindLead clickPhoneNum() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLead enterPhoneNum(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		return this;
	}
	
	public FindLead clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLead clickLeadIDforCreate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLead(driver,node);
	}
			
	public DuplicateLead clickLeadIDForDup() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DuplicateLead(driver,node);
	}
	
    public DeleteLead clickLeadIDForDel() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DeleteLead(driver,node);
	}
    
    public EditLead clickLeadIDForEdit() throws InterruptedException {
    	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new EditLead(driver,node);
	}
}
