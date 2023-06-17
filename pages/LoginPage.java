package week8.day2.ExtentReport.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;

import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}

	public LoginPage enterUserName(String uname) throws IOException{
		System.out.println(driver);
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportStep(uname+"UserName entered Sucessfully", "pass");
		} catch (Exception e) {
			
			reportStep(uname+"UserName is not entered Sucessfully" +e, "fail");
		}
		return this;
	}
	
	public LoginPage enterPassWord(String pwd)throws IOException  {
		try {
			driver.findElement(By.id("password")).sendKeys(pwd);
			reportStep(pwd+"Password entered Sucessfully","pass");
		} catch (Exception e) {
			reportStep(pwd+"Password is not entered Sucessfully" +e, "fail");
		}
		return this;
	}
	
	public HomePage clickLogin() throws InterruptedException, IOException  {
		
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login Button clicked Sucessfully","pass");
		} catch (Exception e) {
			reportStep("Login Button not clicked Sucessfully"+e,"fail");
		}
		return new HomePage(driver,node);
	}
	
}