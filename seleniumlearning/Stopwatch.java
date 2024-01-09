package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stopwatch {

	public static void main(String[] args) throws Exception {
		
		WebDriver d = new ChromeDriver();
		String url = "https://vclock.com/stopwatch/#";
		d.manage().window().maximize();
		d.get(url);
		Thread.sleep(2000);
		
	/*	WebElement startBtn = d.findElement(By.xpath("//button[@id='btn-resume']"));
		startBtn.click();
		Thread.sleep(2000);

		WebElement startBtn = d.findElement(By.xpath(""));
		
		WebElement stopBtn = d.findElement(By.xpath("//button[@id='btn-pause']"));
		stopBtn.click();
		
		WebElement startBtn = d.findElement(By.xpath("//button[contains(@id,'resume')]"));
		startBtn.click();
		Thread.sleep(2000);
		
		WebElement stopBtn = d.findElement(By.xpath("//button[contains(@id,'pause')]"));
		stopBtn.click();
		Thread.sleep(2000);  
	*/
		
		WebElement startBtn = d.findElement(By.xpath("//button[starts-with(@id,'btn-resume')]"));
		startBtn.click();
		Thread.sleep(2000);
		
		WebElement stopBtn = d.findElement(By.xpath("//button[starts-with(@id,'btn-pause')]"));
		stopBtn.click();
		Thread.sleep(2000);  
		
		d.close();
		d.quit();
		

	}

}
