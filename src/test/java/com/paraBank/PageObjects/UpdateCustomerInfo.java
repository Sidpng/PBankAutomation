package com.paraBank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateCustomerInfo {
	WebDriver ldriver;
	public UpdateCustomerInfo(WebDriver rdriver){
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
}
