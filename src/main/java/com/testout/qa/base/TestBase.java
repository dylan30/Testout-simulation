package com.testout.qa.base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	

	
	public static void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_project\\Testout-simulation\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("http://testoutlivecontent.blob.core.windows.net/netpro2018v5-en-us/en-us/sims/typescriptv1/netpro2018v5/simstartup_webpack.html?package=netpro2018v5windowspackage&sim=ipademail_np5&dev=true&automation=true");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void clickSettingIcon() {
		
		driver.findElement(By.xpath("//div[@id='wpDesktop.DesktopIcon15.Grid.tbText']")).click();
		
	}
	
	

}
