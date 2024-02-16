package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import utilites.DatePicker;

public class Page_Admin extends BaseTest {

	public Page_Admin(WebDriver driver) {
		this.driver = driver;

	}

	BaseTest base = new BaseTest();

	public void admin() throws InterruptedException {

		WebElement Adm = driver.findElement(By.xpath(pr_loc.getProperty("Admin")));

		Actions act = new Actions(driver);
		act.moveToElement(Adm).click().build().perform();

		driver.findElement(By.xpath(pr_loc.getProperty("Newadmin"))).click();
		driver.findElement(By.id(pr_loc.getProperty("firstname"))).sendKeys(pr_data.getProperty("first_name"));
		Thread.sleep(1000);
		driver.findElement(By.id(pr_loc.getProperty("lastname"))).sendKeys(pr_data.getProperty("last_name"));
		Thread.sleep(1000);
		driver.findElement(By.id(pr_loc.getProperty("email"))).sendKeys(pr_data.getProperty("email1"));
		Thread.sleep(1000);
		driver.findElement(By.id(pr_loc.getProperty("ph_no"))).sendKeys(pr_data.getProperty("phone_number"));
		Thread.sleep(1000);

		WebElement gen = driver.findElement(By.id(pr_loc.getProperty("gender")));

		if (gen.isSelected()) {
			System.out.println("male radio button is clicked");

		}
		Thread.sleep(2000);
		WebElement status = driver.findElement(By.xpath(pr_loc.getProperty("Status_active")));
		
		if (status.isSelected()) {
			System.out.println("status becomes active");
			
		}
		Thread.sleep(2000);
		driver.findElement(By.id(pr_loc.getProperty("pass"))).sendKeys(pr_data.getProperty("password"));
		Thread.sleep(1000);
		driver.findElement(By.id(pr_loc.getProperty("confpass"))).sendKeys(pr_data.getProperty("conf_password"));
		Thread.sleep(1000);

		DatePicker date = new DatePicker(base.getdriver());
		date.datePick();
		Thread.sleep(5000);

		WebElement sav = driver.findElement(By.xpath(pr_loc.getProperty("save")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(2000);

		act.moveToElement(sav).click().build().perform();
		System.out.println("save is clicked");
	}
}
