package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Practice\\CucumberSampleProject\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://velayuthanadarsweets.com/");
	}
}
