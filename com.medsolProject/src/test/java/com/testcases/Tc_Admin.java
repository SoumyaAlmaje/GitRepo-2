package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_Admin;
import com.pages.Page_Admin_edit_delete_Sbox;
import com.pages.Page_login;

public class Tc_Admin {

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
	public void Admin() throws InterruptedException {
		Page_Admin admin = new Page_Admin(base.getdriver());
		admin.admin();
	}

	// public void searchBox(){
	// Page_Admin_edit_delete_Sbox search=new
	// Page_Admin_edit_delete_Sbox(base.getdriver());
	// search.SearchBox();
	// }

	@Test(priority = 3)
	public void edit() throws InterruptedException {
		Page_Admin_edit_delete_Sbox editt = new Page_Admin_edit_delete_Sbox(base.getdriver());
		editt.editTest();
	}

	@Test(priority = 4)
	public void delete() throws InterruptedException {
		Page_Admin_edit_delete_Sbox deletee = new Page_Admin_edit_delete_Sbox(base.getdriver());
		deletee.deleteTest();
	}
//@AfterTest

	public void url_close() {
		base.toClose();
	}
}
