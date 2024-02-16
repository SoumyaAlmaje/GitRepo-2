package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_BloodDonations extends BaseTest {

	public Page_BloodDonations(WebDriver driver) {
		this.driver = driver;
	}

	BaseTest base = new BaseTest();

	public void Blooddonations() throws InterruptedException {

		WebElement bloodb = driver.findElement(By.xpath(pr_loc.getProperty("Bloodbank")));
		Actions act = new Actions(driver);
		act.moveToElement(bloodb).click().build().perform();
		Thread.sleep(2000);

		WebElement donors = driver.findElement(By.xpath(pr_loc.getProperty("Blood_Donations")));

		act.moveToElement(donors).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("New_BloodDonations"))).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath(pr_loc.getProperty("New_Blooddonor_container"))).click();
		Thread.sleep(5000);
		WebElement BD = driver.findElement(By.xpath(pr_loc.getProperty("New_Blooddonor_searchbox")));
		BD.sendKeys(pr_data.getProperty("Blooddonor_EditName"));
		BD.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(pr_loc.getProperty("New_Blooddonation_Bags"))).sendKeys(pr_data.getProperty("BloodDonationBags"));
		Thread.sleep(2000);

		WebElement save_donor = driver.findElement(By.id(pr_loc.getProperty("Blood_Donations_Save")));
		act.moveToElement(save_donor).click().build().perform();
		Thread.sleep(5000);
	}

}
