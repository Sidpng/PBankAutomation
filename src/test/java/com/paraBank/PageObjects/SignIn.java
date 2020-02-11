package com.paraBank.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	WebDriver ldriver;
	public SignIn(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	@CacheLookup
	WebElement btn_login;
	
	public void setUsername(String user) { 
		username.sendKeys(user);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		btn_login.sendKeys(Keys.RETURN);
	}
}
