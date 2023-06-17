package week8.day2.ExtentReport.pages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class EditLead extends ProjectSpecificMethod{
	
	public EditLead(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public FindLead findLead() throws IOException {
		try {
			driver.findElement(By.linkText("Find Leads")).click();
			reportStep("Click Find Lead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click Find Lead is not Sucessfully"+e, "fail");
		}
		return new FindLead(driver,node);
	}
	
	public EditLead clickEditeLead() throws IOException {
		try {
			driver.findElement(By.linkText("Edit")).click();
			reportStep("Click Edit Lead Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click Edit Lead is not Sucessfully"+e, "fail");
		}
		return this;
	}
	
	public EditLead enterCompanyName(String cname) throws IOException {
		try {
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
			reportStep(cname+"CompanyName Entered Sucessfully", "pass");
		} catch (Exception e) {
			reportStep(cname+"CompanyName Entered is not Sucessfully"+e, "fail");
		}
		return this;
	}
	
	public ViewLead clickTocreate() throws IOException {
		try {
			driver.findElement(By.name("submitButton")).click();
			reportStep("Click CreateLead after Edit  Sucessfully", "pass");
		} catch (Exception e) {
			reportStep("Click CreateLead after Edit  is not Sucessfully"+e, "fail");
		}
		return new ViewLead(driver,node);
	}
}
