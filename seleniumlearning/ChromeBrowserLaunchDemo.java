package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunchDemo {
	public static void main(String[] args) throws InterruptedException {

		// Creating a driver object referencing WebDriver interface
		WebDriver driver;

		// Setting the webdriver.chrome.driver property to its executable's location
		//System.setProperty("webdriver.chrome.driver", "C:/MyEclipseWorkspace/AmazonWebAppTesting/Drivers/chromedriver.exe");

		// Instantiating driver object
		driver = new ChromeDriver();
		Thread.sleep(12000);
		// Using get() method to open a web page
		driver.get("https://www.amazon.in/");

		driver.manage().window().fullscreen();
		// Closing the browser
		driver.quit();

	}
}
