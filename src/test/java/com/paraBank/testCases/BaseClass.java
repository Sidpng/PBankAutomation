package com.paraBank.testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.paraBank.utilities.readConfig;



public class BaseClass {
	readConfig rc=new readConfig();

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://Users//SID//Desktop//Automation_Amazon//inetBankingv1//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get(rc.getbaseUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
