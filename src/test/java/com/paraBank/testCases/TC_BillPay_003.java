package com.paraBank.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import junit.framework.Assert;

import com.paraBank.PageObjects.BillPay;
import com.paraBank.PageObjects.SignIn;
import com.paraBank.utilities.readConfig;


public class TC_BillPay_003 extends BaseClass{
	
	readConfig rc=new readConfig();
	@Test(priority=-16)
	public void signIn() {
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
	public void billPay() {
		BillPay bp=new BillPay(driver);
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
		bp.setPayeeName(rc.getPayeeName());
		bp.setPayeeAddress(rc.getPayeeAddress());
		bp.setPayeeCity(rc.getPayeeCity());
		bp.setPayeeState(rc.getPayeeState());
		bp.setPayeeZip(rc.getPayeeZip());
		bp.setPayeePhone(rc.getPayeePhone());
		bp.setPayeeAccount(rc.getPayeeAccount());
		bp.setPayeeConfirmAccount(rc.getPayeeConfirmAccount());
		bp.setPayeeAmount(rc.getPayeeAmount());
		bp.setAccountNumber();
		bp.clickPayment();

		if(driver.getTitle().equalsIgnoreCase("ParaBank | Bill Pay")){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}



	}
}
