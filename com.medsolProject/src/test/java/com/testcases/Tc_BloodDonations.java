package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_BloodDonations;
import com.pages.Page_login;

public class Tc_BloodDonations {
	
	BaseTest base = new BaseTest();
	
	
	@BeforeTest

	public void url_lunch() throws IOException {
		base.setup();
	}

	@Test(priority=1)
	
	public void login() throws InterruptedException {
		Page_login log = new Page_login(base.getdriver());
		log.login();

	}

	@Test(priority=2)
	
	public void BloodDonations() throws InterruptedException {
		Page_BloodDonations bloodD = new Page_BloodDonations(base.getdriver());
		bloodD.Blooddonations();
	}
	
	//@Test(priority=3)
	
//	public void edit() throws InterruptedException {
		//Page_BloodDonors_edit edit = new Page_BloodDonors_edit(base.getdriver());
	//	edit.editTest();
	//}
	//@Test(priority=4)
	
	//public void delete() throws InterruptedException {
		//Page_BloodDonors_edit delete = new Page_BloodDonors_edit(base.getdriver());
		//delete.deleteTest();
	//}
	
	
	
	//@AfterTest

	//public void url_close() {
		//base.toClose();
	}




