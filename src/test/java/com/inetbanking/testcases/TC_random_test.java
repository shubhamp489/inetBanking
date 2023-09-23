package com.inetbanking.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_random_test extends BaseClass{

	
	@Test
	public void randtest(){
		
		List<WebElement> web = driver.findElements(By.tagName("li"));
		int sije = web.size();
		for(int a = 0 ; a< sije; a++) {
			System.out.println(web.get(a).getText());
			
			Assert.assertEquals("sbsb", "sbsb");
		}
		
	}
	
	
}
