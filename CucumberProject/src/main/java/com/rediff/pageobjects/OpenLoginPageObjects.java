package com.rediff.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLoginPageObjects {
	WebDriver driver = new ChromeDriver();
	public void Openurl(){
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver.get("https://www.rediff.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
    
   
	
}
