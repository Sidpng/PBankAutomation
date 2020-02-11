package com.paraBank.testCases;

import org.testng.annotations.Test;
import com.paraBank.PageObjects.SignIn;

import junit.framework.Assert;

public class TC_SignIn_002 extends BaseClass{
	
	@Test
	public void SignIn() {
		SignIn sin=new SignIn(driver);
		sin.setUsername("sid1994");
		sin.setPassword("PassWord");
		sin.clickLogin();
		if(driver.getTitle().equalsIgnoreCase("ParaBank | Accounts Overview")){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
}
