package com.ranford.RABP.com.ranford.RABP.testsuite;

import org.testng.annotations.Test;

import com.ranford.GeneralFunctions.GeneralFunctions;
import com.ranford.appfunctions.Appfunctions;
import com.ranford.configure.Configure;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class BP_TS1_ValidateBranches {

	WebDriver driver;
	  @BeforeMethod
	  public void preCondition() {

		  //launching application
		  driver=GeneralFunctions.Browser.launchApplication(Configure.sULR2);
	  }
	
	@Test
  public void f() {
		//admin login
		Appfunctions.adminLogin(driver);
		//click branches
		Appfunctions.Branches(driver);
  }


  @AfterMethod
  public void postCondition() {
	 //closing the application
	  GeneralFunctions.Browser.BrowserClose(driver);
  }

}
