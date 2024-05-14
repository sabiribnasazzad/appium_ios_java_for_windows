package tests;

import io.appium.java_client.ios.IOSDriver;
import pages.GrowLoginPage;
import java.net.MalformedURLException;

import actions.BaseIOSTest;
import fixture.TestData;

public class PbNGrowLoginTest extends BaseIOSTest{
	TestData testData = new TestData();

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		driver.findElement(GrowLoginPage.notificationDontAllowButton).click();
		driver.findElement(GrowLoginPage.loginButton).click();
		driver.findElement(GrowLoginPage.userNameField).sendKeys("chris.lau@practicenumbers.com");
		driver.findElement(GrowLoginPage.passwordField).sendKeys("ppp###2025");
		driver.findElement(GrowLoginPage.continueButton).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}