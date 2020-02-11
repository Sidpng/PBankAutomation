package com.paraBank.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillPay {
	WebDriver ldriver;
	public BillPay(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[4]/a")
	@CacheLookup
	WebElement link;
	
	@FindBy(name="payee.name")
	@CacheLookup
	WebElement payeeName;
	
	@FindBy(name="payee.address.street")
	@CacheLookup
	WebElement payeeAddress;
	
	@FindBy(name="payee.address.city")
	@CacheLookup
	WebElement payeeCity;
	
	@FindBy(name="payee.address.state")
	@CacheLookup
	WebElement payeeState;
	
	@FindBy(name="payee.address.zipCode")
	@CacheLookup
	WebElement payeeZip;
	
	@FindBy(name="payee.phoneNumber")
	@CacheLookup
	WebElement payeePhone;
	
	@FindBy(name="payee.accountNumber")
	@CacheLookup
	WebElement payeeAccount;
	
	@FindBy(name="verifyAccount")
	@CacheLookup
	WebElement payeeConfirmAccount;
	
	@FindBy(name="amount")
	@CacheLookup
	WebElement payeeAmount;
	
	@FindBy(name="fromAccountId")
	@CacheLookup
	WebElement select;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")
	@CacheLookup
	WebElement btn_sendPayment;
	
	public void setPayeeName(String pn) {
		payeeName.sendKeys(pn);
	}
	public void setPayeeAddress(String pad) {
		payeeAddress.sendKeys(pad);
	}
	public void setPayeeCity(String city) {
		payeeCity.sendKeys(city);
	}
	public void setPayeeState(String state) {
		payeeState.sendKeys(state);
	}
	public void setPayeeZip(String zip) {
		payeeZip.sendKeys(zip);
	}
	public void setPayeePhone(String phn) {
		payeePhone.sendKeys(phn);
	}
	public void setPayeeAccount(String acc) {
		payeeAccount.sendKeys(acc);
	}
	public void setPayeeConfirmAccount(String cnfrmacc) {
		payeeConfirmAccount.sendKeys(cnfrmacc);
	}
	public void setPayeeAmount(String amt) {
		payeeAmount.sendKeys(amt);
	}
	public void setAccountNumber() {
		Select sl=new Select(select);
		sl.selectByIndex(0);
	}
	public void clickPayment() {
		btn_sendPayment.sendKeys(Keys.RETURN);
	}
}
