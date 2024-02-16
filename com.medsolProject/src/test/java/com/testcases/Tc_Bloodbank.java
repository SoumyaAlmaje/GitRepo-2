package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_Admin_edit_delete_Sbox;
import com.pages.Page_Bloodbank;
import com.pages.Page_Bloodbank_edit;
import com.pages.Page_login;

public class Tc_Bloodbank {

	BaseTest base = new BaseTest();

	@BeforeTest

	public void url_launch() throws IOException {
		base.setup();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		Page_login log = new Page_login(base.getdriver());
		log.login();
	}

	@Test(priority = 2)
	public void Bloodbank() throws InterruptedException {
		Page_Bloodbank blood = new Page_Bloodbank(base.getdriver());
		blood.bloodbank();
	}

	@Test(priority = 3)
	public void edit() throws InterruptedException {
		Page_Bloodbank_edit editt = new Page_Bloodbank_edit(base.getdriver());
		editt.editTest();
	}

	@Test(priority = 4)

	public void delete() throws InterruptedException {
		Page_Bloodbank_edit deletee = new Page_Bloodbank_edit(base.getdriver());
		deletee.deleteTest();
	}

	// @AfterTest
	public void url_close() {
		base.toClose();
	}
}
