package com.inetbanking.testcases;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String  password =readconfig.getpassword();
	public String baseURL2=readconfig.getApplicationURL2();
	
	public static WebDriver driver;
	
	public static Logger logger; 
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j2.properties");
		if(br.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		driver=new ChromeDriver();
		}
		 else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.out.println("No browser present");
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.get(baseURL2);
		driver.manage().window().maximize();
	
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	
}
