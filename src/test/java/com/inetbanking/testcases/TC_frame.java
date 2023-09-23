package com.inetbanking.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_frame extends BaseClass{
	
	
	@Test
	public void framets() {
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		String s=driver.switchTo().frame(1).getPageSource();
		System.out.println(s);
		
	}

}
