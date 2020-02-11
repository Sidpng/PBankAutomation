package com.paraBank.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.paraBank.PageObjects.SignUp;
import com.paraBank.utilities.readConfig;

public class TC_SignUp_001 extends BaseClass {
	readConfig rc=new readConfig();
	@Test
	public void signUpNewUser() {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		SignUp su=new SignUp(driver);
		su.setFirstName(rc.getFirstName());
		su.setLastName(rc.getLastName());
		su.setAddress(rc.getAddress());
		su.setCity(rc.getCity());
		su.setState(rc.getState());
		su.setZip(rc.getZip());
		su.setPhone(rc.getPhone());
		su.setSSN("44551");
		su.setUsername(rc.getUsername());
		su.setPassword(rc.getPassword());
		su.cnfrmPassword(rc.getPassword());
		su.btnRegister();
		
		//String test=driver.findElement(By.partialLinkText("Welcome")).getText();
//		if(driver.getTitle().equalsIgnoreCase("ParaBank | Register for Free Online Account Access")){
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertTrue(false);
//		}
	}
}
