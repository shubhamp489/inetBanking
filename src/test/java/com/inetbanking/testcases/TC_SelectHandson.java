package com.inetbanking.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_SelectHandson extends BaseClass {
	int temp =0;
	@Test
	public void selectoptionvalue() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object button = null;
		js.executeScript("arguments[0].click();", button);
	WebElement country=	driver.findElement(By.xpath("//select[@name='country']"));
	
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(baseURL)));
	we.click();
	
	driver.findElement(By.cssSelector(baseURL));
	driver.findElement(By.partialLinkText("text"));
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> itr = handles.iterator();
	while(itr.hasNext()){
		if(itr.next().equals(itr)) {
			
		}
	}
	
	
	Select select = new Select(country);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		int size = options.size();
		
		for (int a= 0 ; a<size ; a++) {
			System.out.println(options.get(a).getText());
			
			if(options.get(a).getText().equals("GREENLAND")) {
				temp=1;
				break;
			}
			
			
		}
		if(temp==1) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
   select.selectByValue("GERMANY");		
	}

	
	
	
}
