package com.qa.project.selenium.ProjectSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sonia.ali.MercuryProject.FourthPage;
import com.sonia.ali.MercuryProject.SecondPage;
import com.sonia.ali.MercuryProject.ThirdPage;

public class AppTest {
	ChromeDriver driver;
	WebElement checkElement;
	ExtentReports extent; 
	ExtentTest test;
	
	@Before
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Report.html",true);
	}
	
	@After 
	public void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(5000);
	}
	
	@Test
	public void mthodTest() throws InterruptedException {
		test = extent.startTest("Verify application Title");
		test.log(LogStatus.INFO, "Browser started");
		test.log(LogStatus.PASS, "Verify Title of the page");
		driver.manage().window().maximize();
		driver.get(Constants.websiteURL);
		HomePage page1 = PageFactory.initElements(driver, HomePage.class);
		page1.discover();
		page1.logo();
		page1.dream();
		page1.plan();
		page1.book();
		SecondPage page2 = PageFactory.initElements(driver, SecondPage.class);
		page2.searchFor();
		ThirdPage page3 = PageFactory.initElements(driver, ThirdPage.class);
		page3.searchFor();
		FourthPage page4 = PageFactory.initElements(driver, FourthPage.class);
		page4.searchFor();
		}
	
	
	}
	
