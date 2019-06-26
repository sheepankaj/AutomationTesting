package com.ranford.RABP.com.ranford.RABP.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.GeneralFunctions.GeneralFunctions;
import com.ranford.appfunctions.Appfunctions;
import com.ranford.configure.Configure;
import com.ranford.testdata.TestData;

public class BP_TS9_validateBranchesEntryCancel {
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
		//click on New Branches
		Appfunctions.NewBranch(driver);
		//Fill the Branch Name 
		
		String sBranchName=TestData.NewBranch.sBranchName;
		String sAddress1=TestData.NewBranch.sAddress1;
		String sAddress2=TestData.NewBranch.sAddress2;
		String sAddress3=TestData.NewBranch.sAddress3;
		String sArea=TestData.NewBranch.sArea;
		String sZipCode=TestData.NewBranch.sZipCode;
		String sCountry=TestData.GlobalLocators.sCountry;
		String sState=TestData.GlobalLocators.sState;
		String sCity=TestData.GlobalLocators.sCity;
		Appfunctions.NewBranchEntry(driver, sBranchName, sAddress1, sAddress2, sAddress3, sArea, sZipCode, sCountry, sState, sCity);
		//Click on Cancel Button
		Appfunctions.NewBranchEntryCancel(driver);
		
}

@AfterMethod
public void postCondition() {
	 //closing the application
	  GeneralFunctions.Browser.BrowserClose(driver);
}
}
