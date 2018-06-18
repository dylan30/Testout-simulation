package com.testout.qa.assignmenttest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.testout.qa.pages.SettingPage;
import com.testout.qa.base.*;



public class SimulationTests extends TestBase{
	
	public SimulationTests st;
	public SettingPage sp;
	
	
	public SimulationTests() {
		super();
	}
	
	@BeforeMethod	
	public void setUp() throws InterruptedException {
				
		invokeBrowser();
		clickSettingIcon();
		Thread.sleep(2000);
	}
	
	@Test
	public void simulation1() throws InterruptedException {
		sp = new SettingPage();
		
		sp.emailContacts();
		Thread.sleep(2000);
				
		sp.maggieBrown();		
		Thread.sleep(2000);
		
		sp.mbrownGmailAccount();
		Thread.sleep(2000);
		
		sp.advanced();
		Thread.sleep(2000);
		
		sp.sslEnabled();
		Thread.sleep(2000);
		
		
		sp.verifyPort993("993");
		Thread.sleep(2000);

		sp.account();
		Thread.sleep(2000);
		
		sp.done();
		Thread.sleep(2000);
		
		sp.wifi();
		Thread.sleep(2000);
		
		sp.corpnet();
		Thread.sleep(2000);
		
		sp.inputPwd();
		Thread.sleep(2000);
		
		sp.join();
		Thread.sleep(2000);
		
		sp.allDone();
		Thread.sleep(2000);
	
		sp.verifyScore();
		Thread.sleep(2000);
	}
	

			
	@AfterMethod
	public void closeBrowser() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
				
	}
	
	
	
}
