package com.paraBank.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.paraBank.PageObjects.SignIn;
import com.paraBank.PageObjects.UpdateCustomerInfo;

import junit.framework.Assert;

//import junit.framework.Assert;

public class TC_UpdateCustomer_004 extends BaseClass {
	
	@Test
	public void SignIn() {
		SignIn sin=new SignIn(driver);
		sin.setUsername(rc.getUsername());
		sin.setPassword(rc.getPassword());
		sin.clickLogin();
		if(driver.getTitle().equalsIgnoreCase("ParaBank | Accounts Overview")){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=1)
	public void updateCustomer() {
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Update Contact")).click();
		UpdateCustomerInfo su=new UpdateCustomerInfo(driver);
		su.setFirstName(rc.getFirstName());
		su.setLastName(rc.getLastName());
		su.setAddress(rc.getAddress());
		su.setCity(rc.getCity());
		su.setState(rc.getState());
		su.setZip(rc.getZip());
		su.setPhone(rc.getPhone());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")));
//		if(driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText().equalsIgnoreCase("Profile Updated")) {
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertTrue(false);
//		}
	}
}
