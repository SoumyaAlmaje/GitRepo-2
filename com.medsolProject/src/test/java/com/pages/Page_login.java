package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Page_login extends BaseTest {
	
	public Page_login(WebDriver driver) {
		this.driver=driver;
		
		
	}

	

	public void login() throws InterruptedException {

		driver.findElement(By.id(pr_loc.getProperty("id"))).sendKeys(pr.getProperty("user"));
		driver.findElement(By.id(pr_loc.getProperty("password"))).sendKeys(pr.getProperty("pass"));

		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("button"))).click();
		
	

		
	

	}

}
