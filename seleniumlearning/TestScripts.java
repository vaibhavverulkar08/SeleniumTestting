package com.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// @Auther : vaibhavverulkar08 (github)

public class TestScripts {

	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		System.out.println("Selenium Script started..");
		setUp();
		System.out.println("Launching URL On Browser");
		getURL();
		System.out.println("Getting a Page Title");
		getPageTitle();
		System.out.println("Closing a Web Browser");
		tearDown();

	}

	private static void setUp() {
		driver.manage().window().maximize();
		System.out.println("Maximize The Browser");
	}

	private static void getURL() {
		driver.get("https://www.google.com/");
	}

	private static void getPageTitle() {
		String pageTitle=driver.getTitle();
		System.out.println("Page Title is : "+ pageTitle);
	}

	private static void tearDown() {
		driver.close();
		System.out.println("Browser closed");
		
	}

}
