package com.paraBank.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	Properties prop;
	public readConfig() {
		File src=new File("./Configuration/config.properties");
		try {
			if(src.exists()) {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getbaseUrl() {
		String url=prop.getProperty("baseUrl");
		//System.out.println(url);
		return url;
	}
	public String getFirstName() {
		String fn=prop.getProperty("firstname");
		return fn;
	}
	public String getLastName() {
		String ln=prop.getProperty("lastname");
		return ln;
	}
	public String getAddress() {
		String ad=prop.getProperty("address");
		return ad;
	}
	public String getCity() {
		String ci=prop.getProperty("city");
		return ci;
	}
	public String getState() {
		String st=prop.getProperty("state");
		return st;
	}
	public String getZip() {
		String zp=prop.getProperty("zip");
		return zp;
	}
	public String getPhone() {
		String phn=prop.getProperty("phone");
		return phn;
	}
	public String getUsername() {
		String un=prop.getProperty("userName");
		return un;
	}
	public String getPassword() {
		String pw=prop.getProperty("password");
		return pw;
	}
	public String getChromePath() {
		String cm=prop.getProperty("chromePath");
		return cm;
	}
	public String getPayeeName() {
		String pn=prop.getProperty("payeeName");
		return pn;
	}
	public String getPayeeAddress() {
		String ad=prop.getProperty("payeeAddress");
		return ad;
	}
	public String getPayeeCity() {
		String ci=prop.getProperty("payeeCity");
		return ci;
	}
	public String getPayeeState() {
		String st=prop.getProperty("payeeState");
		return st;
	}
	public String getPayeeZip() {
		String zp=prop.getProperty("payeeZip");
		return zp;
	}
	public String getPayeePhone() {
		String phn=prop.getProperty("payeePhone");
		return phn;
	}
	public String getPayeeAccount() {
		String an=prop.getProperty("payeeAccount");
		return an;
	}
	public String getPayeeConfirmAccount() {
		String can=prop.getProperty("payeeConfirmAccount");
		return can;
	}
	public String getPayeeAmount() {
		String amt=prop.getProperty("payeeAmount");
		return amt;
	}
	
}
