package tests;

import io.appium.java_client.ios.IOSDriver;
import pages.LoginPage;
import java.net.MalformedURLException;

import actions.BaseIOSTest;
import fixture.TestData;

public class AppiumLoginTestForIOS extends BaseIOSTest{
	TestData testData = new TestData();

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		driver.findElement(LoginPage.usernameField).sendKeys("standard_user");
		driver.findElement(LoginPage.passwordField).sendKeys("secret_sauce");
		driver.findElement(LoginPage.loginButton).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}
