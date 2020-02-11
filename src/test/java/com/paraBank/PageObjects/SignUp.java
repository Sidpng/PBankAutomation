package com.paraBank.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	WebDriver ldriver;
	public SignUp(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="customer.firstName")
	@CacheLookup
	WebElement fn;
	
	@FindBy(name="customer.lastName")
	@CacheLookup
	WebElement ln;
	
	@FindBy(name="customer.address.street")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="customer.address.city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="customer.address.state")
	@CacheLookup
	WebElement state;
	
	@FindBy(name="customer.address.zipCode")
	@CacheLookup
	WebElement zip;
	
	@FindBy(name="customer.phoneNumber")
	@CacheLookup
	WebElement phone;
	
	@FindBy(name="customer.ssn")
	@CacheLookup
	WebElement SSN;
	
	@FindBy(name="customer.username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="customer.password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="repeatedPassword")
	@CacheLookup
	WebElement cnfrmpassword;
	
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement btn_register;
	
	public void setFirstName(String firstName) {
		fn.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		ln.sendKeys(lastName);
	}
	public void setAddress(String add) {
		address.sendKeys(add);
	}
	public void setCity(String ci) {
		city.sendKeys(ci);
	}
	public void setState(String st) {
		state.sendKeys(st);
	}
	public void setZip(String zp) {
		zip.sendKeys(zp);
	}
	public void setPhone(String phn) {
		phone.sendKeys(phn);
	}
	public void setSSN(String sn) {
		SSN.sendKeys(sn);
	}
	public void setUsername(String user) { 
		username.sendKeys(user);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void cnfrmPassword(String cnpwd) {
		cnfrmpassword.sendKeys(cnpwd);
	}
	public void btnRegister() {
		btn_register.sendKeys(Keys.RETURN);
	}
}	
