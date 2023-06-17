package week8.day2.ExtentReport.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import week8.day2.ExtentReport.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	public MyHomePage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		ProjectSpecificMethod.node=node;
	}
	
	public MyLeadPage clickLeads() throws InterruptedException{
		driver.findElement(By.linkText("Leads")).click();	
		return new MyLeadPage(driver,node);
	}
	

}
