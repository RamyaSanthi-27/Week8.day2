package week8.day2.ExtentReport.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod{
	
	public ViewLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	
	public ViewLead VerifyFirstName() {
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("LeadName : "+firstName);
		return this;
	}
	
}
