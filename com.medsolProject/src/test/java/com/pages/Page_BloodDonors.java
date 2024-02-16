package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilites.DatePicker;

public class Page_BloodDonors extends BaseTest {

	public Page_BloodDonors(WebDriver driver) {
		this.driver = driver;
	}
  BaseTest base = new BaseTest();
	public void Blooddonors() throws InterruptedException {

		WebElement bloodb = driver.findElement(By.xpath(pr_loc.getProperty("Bloodbank")));
		Actions act = new Actions(driver);
		act.moveToElement(bloodb).click().build().perform();
		Thread.sleep(2000);

		WebElement donors = driver.findElement(By.xpath(pr_loc.getProperty("Blooddonors")));

		act.moveToElement(donors).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr_loc.getProperty("NewBlooddonors"))).click();
		Thread.sleep(2000);
		
		WebElement DonorsNameInput = driver.findElement(By.id(pr_loc.getProperty("Blooddonarname")));
		String dynamicDonorName = (pr_data.getProperty("User")) +UUID.randomUUID().toString() + (pr_data.getProperty("User_gmail"));
		DonorsNameInput.sendKeys(dynamicDonorName);
		Thread.sleep(2000);
		
		driver.findElement(By.id(pr_loc.getProperty("Blooddonorage"))).sendKeys(pr_data.getProperty("Blooddonor_Age"));
		Thread.sleep(2000);
		WebElement gender = driver.findElement(By.id(pr_loc.getProperty("Blooddonorgender")));

		if (gender.isSelected()) {
			System.out.println("male radio button is clicked");

		}

		driver.findElement(By.xpath(pr_loc.getProperty("BlooddonorsBloodgroup_container"))).click();
		Thread.sleep(5000);
		WebElement Bg=driver.findElement(By.xpath(pr_loc.getProperty("Blood_donors_searchbox")));
		Bg.sendKeys(pr_data.getProperty("Bloodgroup_edit"));
		Bg.sendKeys(Keys.ENTER);
		
		
        DatePicker donordate = new DatePicker(base.getdriver());
        donordate.datePick();
        Thread.sleep(2000);
        
        WebElement save_donor = driver.findElement(By.id(pr_loc.getProperty("Blood_donor_save")));  
		act.moveToElement(save_donor).click().build().perform();   
	}
    //user283422e7-5012-4888-8fe2-7a6371b95c18@hms.com
}
