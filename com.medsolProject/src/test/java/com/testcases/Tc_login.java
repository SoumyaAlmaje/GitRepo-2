package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_login;

public class Tc_login {
	BaseTest ss = new BaseTest();
	
	@BeforeTest
	
	public void Url_lunch() throws IOException {
		ss.setup();
	}
	
	@Test
	
  public void login() throws InterruptedException {
	  
	  Page_login bn = new Page_login(ss.getdriver());
	  bn.login();
  }
  
	@AfterTest
	public void Url_close() {
		
		ss.toClose();
	}
}
