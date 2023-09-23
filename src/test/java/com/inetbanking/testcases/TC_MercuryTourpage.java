package com.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.MercuryPage;

public class TC_MercuryTourpage extends BaseClass{
	
	
	
	
	
	@Test
	public void EndtoEndTestcase() {
		
		System.out.println("-------------Test case Started ----------------");
		MercuryPage mp = new MercuryPage(driver);
		mp.setFristname("shubham");
		mp.setLastName("Pandey");
		mp.setPhone("8299845837");
		mp.setemail("shubhamp489@gmail.com");
		mp.setAddress("ramnagar");
		mp.setCity("Varanasi");
		mp.setStateProvince("UttarPradesh");
		mp.setPostcode("221008");
		mp.SetCountry("GAZA STRIP");
		mp.setusername("shubhamp489@gmail.com");
		mp.setpwd("Lovgh5655@1234");
		mp.setconfirmpwd("Lovgh5655@1234");
		mp.submit();
		
		
		System.out.println("--------------Test Case end -------------------");
	}
	
	
	

}
