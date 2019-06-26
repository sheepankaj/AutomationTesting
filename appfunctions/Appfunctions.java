package com.ranford.appfunctions;

import org.openqa.selenium.WebDriver;

import com.ranford.pageobjects.Pageobjects;
import com.ranford.testdata.TestData;

public class Appfunctions {
	
	
	/*************************************************************
	 * Method Name   : adminLogin
	 * Purpose       : for advancing to home page
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 *************************************************************/
	
	
	public static void adminLogin(WebDriver driver)
	{
		Pageobjects.RanfordHomePage.txtUserName(driver).clear();
		Pageobjects.RanfordHomePage.txtUserName(driver).sendKeys(TestData.RanfordHomePage.sUserName);
		
		Pageobjects.RanfordHomePage.txtPassword(driver).clear();
		Pageobjects.RanfordHomePage.txtPassword(driver).sendKeys(TestData.RanfordHomePage.sPassword);
		
		Pageobjects.RanfordHomePage.btnLogin(driver).click();
	}
	

	/*************************************************************
	 * Method Name   : Branches
	 * Purpose       : It navigates to Branches page
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 *************************************************************/
	
	
	public static boolean Branches(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.imgBranches(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	

	
	
	/*************************************************************
	 * Method Name   : New Branch
	 * Purpose       : It navigates to the New Branch Page
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 *************************************************************/

	
	public static boolean NewBranch(WebDriver driver)
	{
		try{
			Pageobjects.NewBranch.btnNewBranch(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/*************************************************************
	 * Method Name   : AdminHome Page
	 * Purpose       : It navigates to the Home 
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 *************************************************************/
	
	public static boolean AdminHome(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.imgHomeAdmin(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/*************************************************************
	 * Method Name   : Branches Logout
	 * Purpose       : It navigates to ranford home Page
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 *************************************************************/
	
	
	public static boolean BranchesLogout(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.imgLogout(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/*************************************************************
	 * Method Name   : Select Branches Details
	 * Purpose       : It displays the selected Country, State and City
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 * @return 
	 *************************************************************/
	
	
	public static boolean BranchesDetails(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.lstCountry(driver).selectByVisibleText(TestData.GlobalLocators.sCountry);
			Pageobjects.GlobalLocators.lstState(driver).selectByVisibleText(TestData.GlobalLocators.sState);
			Pageobjects.GlobalLocators.lstCity(driver).selectByVisibleText(TestData.GlobalLocators.sCity);
			return true;
		}catch(Exception e)
		{
		 e.printStackTrace();
		 return false;
		}
	}
	/*************************************************************
	 * Method Name   : Select BranchesSearch Button
	 * Purpose       : It performs the search button
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 * @return 
	 * @return 
	 *************************************************************/
	
	public static boolean BranchesSearch(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.btnSearch(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	/*************************************************************
	 * Method Name   : Select BranchesClear Button
	 * Purpose       : It performs the clear button
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 * @return 
	 * @return 
	 *************************************************************/
	
	public static boolean BranchesClear(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.btnClear(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	/*************************************************************
	 * Method Name   : New Branch Entry 
	 * Purpose       : It fills the fields the data in given section
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 * @return 
	 * @return 
	 *************************************************************/
	
	public static boolean NewBranchEntry(WebDriver driver,String sBranchName,String sAddress1,String sAddress2,String sAddress3,String sArea,String sZipCode,String sCountry,String sState,String sCity)
	{
		try{
			Pageobjects.NewBranch.btnBranchName(driver).sendKeys(sBranchName);
			Pageobjects.NewBranch.btnAddress1(driver).sendKeys(sAddress1);
			Pageobjects.NewBranch.btnAddress2(driver).sendKeys(sAddress2);
			Pageobjects.NewBranch.btnAddress3(driver).sendKeys(sAddress3);
			Pageobjects.NewBranch.btnArea(driver).sendKeys(sArea);
			Pageobjects.NewBranch.btnZipCode(driver).sendKeys(sZipCode);
			Pageobjects.GlobalLocators.lstCountry(driver).selectByVisibleText(sCountry);
			Pageobjects.GlobalLocators.lstState(driver).selectByVisibleText(sState);
			Pageobjects.GlobalLocators.lstCity(driver).selectByVisibleText(sCity);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/*************************************************************
	 * Method Name   : New Branch Entry Submit Button
	 * Purpose       : It clicks the submit button 
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 * @return 
	 * @return 
	 *************************************************************/
	
	public static boolean NewBranchEntrySubmit(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.btnSubmit(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	/*************************************************************
	 * Method Name   : New Branch Entry Reset Button
	 * Purpose       : It clicks the reset button 
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 *************************************************************/
	public static boolean NewBranchEntryReset(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.btnReset(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/*************************************************************
	 * Method Name   : New Branch Entry Cancel Button
	 * Purpose       : It clicks the Cancel button 
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 *************************************************************/
	public static boolean NewBranchEntryCancel(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.btnCancel(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	/*************************************************************
	 * Method Name   : New Branch Home Button
	 * Purpose       : It clicks the Home button 
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 *************************************************************/
	
	public static boolean NewBranchEntryHome(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.imgHomeAdmin(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/*************************************************************
	 * Method Name   : New Branch Logout Button
	 * Purpose       : It clicks the Logout button 
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 * @return 
	 *************************************************************/
	public static boolean NewBranchEntryLogout(WebDriver driver)
	{
		try{
			Pageobjects.GlobalLocators.imgLogout(driver).click();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	/*************************************************************
	 * Method Name   : New Branch
	 * Purpose       : It navigates to the New Branch Page
	 * Created on    :
	 * Created By    :
	 * Updated By    :
	 * Reviewed By    :
	 *************************************************************/

	
	public static boolean selectBranch(WebDriver driver)
	{
		try{
			Pageobjects.RanfordHomePage.lstBranchname(driver).selectByVisibleText(TestData.RanfordHomePage.sBranchName);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
}
