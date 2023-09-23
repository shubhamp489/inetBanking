package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author shubh
 *
 */
public class MercuryPage {

WebDriver ldriver;
	
	public MercuryPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@name='firstName']")
	WebElement firstName;
	
	
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@name='userName']")
	WebElement email;
	
	@FindBy(xpath="//*[@name='address1']")
	WebElement address1;
	
	@FindBy(xpath="//*[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//*[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//*[@name='postalCode']")
	WebElement postalCode;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	
	@FindBy(xpath="//*[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@name='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@name='submit']")
	WebElement submit;
	
	
	
	public void setFristname(String name) {
		firstName.sendKeys(name);
	}
	
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void setPhone(String phonenum) {
		phone.sendKeys(phonenum);
	}
	
	public void setemail(String emailinf) {
		email.sendKeys(emailinf);
	}
	
	public void setAddress(String adress) {
		address1.sendKeys(adress);
	}
	
	public void setCity(String cityName) {
		city.sendKeys(cityName);
	}
	
	public void setStateProvince(String statena) {
		state.sendKeys(statena);
	}
	
	public void setPostcode(String pcode) {
		postalCode.sendKeys(pcode);
	}
	
	public void SetCountry(String cname) {
		Select sele = new Select(country);
		sele.selectByValue(cname);
	
	
	}
	
	
	public void setusername(String uname) {
		username.sendKeys(uname);
	}
	
	
	public void setpwd(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void setconfirmpwd(String pwd2) {
		confirmPassword.sendKeys(pwd2);
	}
	
	public void submit() {
		submit.click();
	}
	
	
	
}
