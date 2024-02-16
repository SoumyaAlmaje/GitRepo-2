package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_Bloodbank extends BaseTest {

	public Page_Bloodbank(WebDriver driver) {
		this.driver = driver;

	}

	public void bloodbank() throws InterruptedException {

		WebElement bloodb = driver.findElement(By.xpath(pr_loc.getProperty("Bloodbank")));

		Actions act = new Actions(driver);
		act.moveToElement(bloodb).click().build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath(pr_loc.getProperty("NewBloodgroup"))).click();
		Thread.sleep(2000);
		
		WebElement BloodGroupInput = driver.findElement(By.id(pr_loc.getProperty("Bloodgroup")));
		String dynamicBloodGroup = (pr_data.getProperty("User")) + UUID.randomUUID().toString() + (pr_data.getProperty("User_gmail"));
		BloodGroupInput.sendKeys(dynamicBloodGroup);
		Thread.sleep(2000);
		
		driver.findElement(By.id(pr_loc.getProperty("RemainedBags"))).sendKeys(pr_data.getProperty("No_Remainedbags"));		
		Thread.sleep(2000);
		
		WebElement save = driver.findElement(By.id(pr_loc.getProperty("Bloodsave")));
		act.moveToElement(save).click().build().perform();
		
		
		//usera819dd81-1209-4eb1-b554-f5a5d0bcfa32@hms.com
	}

}
