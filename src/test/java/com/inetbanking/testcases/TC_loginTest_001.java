package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;



public class TC_loginTest_001 extends BaseClass {

	
	@Test
	public void loginTest() throws IOException
	{
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered user name");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
			
			
		}
		else {
			captureScreen(driver,"Login Test");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			
		
		
		}
	}
	
	
	
}
