package com.testout.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
	
//	@FindBy(xpath = "//div[@id='gClient.MailContactsCalendarsSettings1.ContentPresenter.HeaderedContentControl.Grid.svScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.Border.ContentPresenter.spStackPanel.PropertyGroup.Border.ContentPresenter.lbAccounts.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.SettingsItemSubMenu.Grid.ContentPresenter.StackPanel.TextBlock']")
//	WebElement maggieBrown;
	
	
	@FindBy(xpath = "//div[contains(text(), 'Maggie Brown')]")
	WebElement maggieBrown;
	
	@FindBy(xpath = "//div[contains(text(), 'mbrown@gmail.com')]")
	WebElement mbrownGmailAccount;	
	
	@FindBy(xpath = "//div[contains(text(), 'Advanced')]")
	WebElement advanced;	
	
	//@FindBy(xpath = "//div[@data-typename='HorizontalToggleSwitch']/div[@style='position: absolute; overflow: visible; display: inherit; cursor: pointer; left: 19px; top: 1px; width: 28px; height: 28px;']")	
	//@FindBy(xpath = "//div[@id='gTablet.Grid.gClient.GMailSettings1.Grid.Border.ContentPresenter.hcHeaderedContentControl.Grid.svScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.Border.ContentPresenter.grdClient.spAdvanced.PropertyGroup2.Border.ContentPresenter.SettingsListBox.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.siUseSSL.Grid.tbOnOff' and @data-typename='HorizontalToggleSwitch']")
	//@FindBy(xpath = "//div[@data-typename='HorizontalToggleSwitch']/div[@id='gTablet.Grid.gClient.GMailSettings1.Grid.Border.ContentPresenter.hcHeaderedContentControl.Grid.svScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.Border.ContentPresenter.grdClient.spAdvanced.PropertyGroup2.Border.ContentPresenter.SettingsListBox.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.siUseSSL.Grid.tbOnOff.Grid.SwitchRoot']/div[@id='gTablet.Grid.gClient.GMailSettings1.Grid.Border.ContentPresenter.hcHeaderedContentControl.Grid.svScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.Border.ContentPresenter.grdClient.spAdvanced.PropertyGroup2.Border.ContentPresenter.SettingsListBox.Grid.Border.ScrollViewer.Grid.Viewport.ScrollContentPresenter.OuterElement.InnerElement.ItemsPresenter.StackPanel.siUseSSL.Grid.tbOnOff.Grid.SwitchRoot.Canvas.SwitchTrack.StackPanel.Border1']")	
	
	//@FindBy(xpath = "//div[@style='position: absolute; overflow: visible; display: inherit; cursor: pointer; left: 34px; top: -1px; width: 36px; height: 31px; background-color: rgb(255, 255, 255); border-width: 0px; border-radius: 0px;']")
	@FindBy(xpath = "//div[@data-typename='Thumb']")
	WebElement sslEnabled;
	
	@FindBy(xpath = "//div[contains(text(), 'Server Port')]")
	WebElement serverPort;
	
	@FindBy(xpath = "//input[@data-typename='TextBox' and @type='text']")	
	//@FindBy(xpath = "//input[contains(text(), '993')]")
	WebElement serverPortText;
	
	@FindBy(xpath = "//div[@id='gHeader.gAdvanced.btnAccount.grid.contentPresenter.TextBlock']")
	WebElement account;
	
	@FindBy(xpath = "//div[@id='gHeader.btnDone.grid.contentPresenter.TextBlock']")
	WebElement done;
	
	// Initializing the Page Objects:
	public SettingPage() {
		PageFactory.initElements(driver, this);
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
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", sslEnabled);
		
		
		wait =new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(sslEnabled));
		sslEnabled.click();
	}
	
	public void scrollDown() {
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", serverPort);
	}
	
	public void verifyPort993(String port) {
		
		if(serverPortText.isDisplayed()) {
			System.out.println("here");
		}
		
		String portText = serverPortText.getText();
		Assert.assertEquals(portText, port);
		
	}

	
	public void account() {
		
		account.click();
	}
	
	public void done() {
		
		done.click();
	}
	
	
	
}
