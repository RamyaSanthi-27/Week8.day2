package week8.day2.ExtentReport.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class HomePage  extends ProjectSpecificMethod{
	
	public HomePage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public MyHomePage clickCRMSFA() throws InterruptedException{
		driver.findElement(By.linkText("CRM/SFA")).click();	
		return new MyHomePage(driver, node);
	}

}
