package com.testout.qa.pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.testout.qa.base.*;

public class SettingPage extends TestBase {

	SettingPage settingPage;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@FindBy(xpath = "//div[@id='siMailContactsCalendars.Grid.tbText']")
	WebElement emailContacts;
	
	@FindBy(xpath = "//div[contains(text(), 'Maggie Brown')]")
	WebElement maggieBrown;
	
	@FindBy(xpath = "//div[contains(text(), 'mbrown@gmail.com')]")
	WebElement mbrownGmailAccount;	
	
	@FindBy(xpath = "//div[contains(text(), 'Advanced')]")
	WebElement advanced;	
	
	@FindBy(xpath = "//div[@id='siUseSSL.Grid.tbOnOff']/div[@id='siUseSSL.Grid.tbOnOff.Grid.SwitchRoot']/div[@id='siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchThumb']")
	WebElement sslEnabled;
	
	@FindBy(xpath = "//div[contains(text(), 'Server Port')]")
	WebElement serverPort;
	
	@FindBy(xpath = "//input[@id='tbServerPort']")	
	WebElement serverPortText;
	
	@FindBy(xpath = "//div[@id='btnAccount']/div[contains(text(), 'Account')]")
	WebElement account;
	
	@FindBy(xpath = "//div[@id='btnDone']/div[contains(text(), 'Done')]")
	WebElement done;
	
	@FindBy(xpath = "//div[@id='siWiFi']/div[contains(text(), 'Wi-Fi')]")
	WebElement wifi;
	
	@FindBy(xpath = "//div[@data-typename='SettingsItemNetwork']/div[contains(text(), 'CorpNet')]")
	WebElement corpNet;
	
	@FindBy(xpath = "//div[@id='tbPassword']/input[@id='psbx']")
	WebElement passwordBox;
	
	@FindBy(xpath = "//div[@id='btnJoin']/div[contains(text(), 'Join')]")
	WebElement join;
	
	@FindBy(xpath = "//div[@id='bDone']/div[contains(text(), 'Done')]")
	WebElement buttonDone;
	

	public SettingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void waitOutElement(WebElement element) {
		wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
	
	
	public void emailContacts() {
		
		emailContacts.click();
	}
	
	public void maggieBrown() {
		
		maggieBrown.click();
	}
	
	public void mbrownGmailAccount() {
		
		mbrownGmailAccount.click();
	}
	
	
	public void advanced() {
		
		advanced.click();
	}	

	
	public void sslEnabled() {		

		waitOutElement(sslEnabled);
		
		Actions c = new Actions(driver);
		c.moveToElement(sslEnabled).moveByOffset(18, 0).click().perform();

	}
	
		
	public void verifyPort993(String port) {		

		String portText = serverPortText.getAttribute("value");
		Assert.assertEquals(portText, port);
		
	}

	
	public void account() {
		
		account.click();
	}
	
	public void done() {
		
		done.click();
	}
	
	public void wifi() {
		
		wifi.click();
	}
	
	public void corpnet() {
		
		corpNet.click();
	}
	
	public void inputPwd() {
		
		passwordBox.sendKeys("@CorpNetWeRSecure!&");
	}
	
	public void join() {
		
		join.click();
	}
	
	public void allDone() {
		
		buttonDone.click();
	}
	
	public void verifyScore() {

		driver.switchTo().frame("_ifrmreport_");
		WebElement list = driver.findElement(By.xpath("//div[contains(text(), 'Your Score: 1 of 1 (100%)')]"));
		Assert.assertTrue(list.getText().equals("Your Score: 1 of 1 (100%)"));
		driver.switchTo().parentFrame();
	}
}
