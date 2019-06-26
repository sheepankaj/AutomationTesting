package com.ranford.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ranford.locators.Locators;

public class Pageobjects {
    //Pageobjects for Ranford Home Page
	public static class RanfordHomePage
	{
	  //pageobjects for UserName
		public static WebElement txtUserName(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.txtUserName);
		}
		//pageobjects for password
		public static WebElement txtPassword(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.txtPassword);
		}
		//pageobjects for BranchName
		public static Select lstBranchname(WebDriver driver)
		{
			return new Select(driver.findElement(Locators.RanfordHomePage.lstBranchname));
		}
		//pageobjects for login
		public static WebElement btnLogin(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.btnLogin);
		}
		//pageobjects for mainHomePage
		public static WebElement imgHome(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.imgHome);
		}
		//pageobjects for personal 
		public static WebElement btnPesonal(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.btnPesonal);
			
		}
		//pageobjects for corporate
		public static WebElement btnCorporate(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.btnCorporate);
		}
		//pageobjects for international
		public static WebElement btnInternational(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomePage.btnInternational);
		}
		
		     //pageobjects for Personal Banking
		   public static WebElement imgPersonalBanking(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.imgPersonalBanking);
		    }
		   //pageobjects for Corporate Banking Locator
		   public static WebElement imgCorporateBanking(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.imgCorporateBanking);
		    }
		   //pageobjects for International Banking Locator
		   public static WebElement imgInternationalBanking(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.imgInternationalBanking);
		    }
		   //pageobjects for About us Locator
		   public static WebElement imgAboutUs(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.imgAboutUs);
		    }
		   //pageobjects for Customer Services
		   public static WebElement lnkCustomerService(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.lnkCustomerService);
		    }
		   //pageobjects for Internet Banking FAQ's
		   public static WebElement lnkInternetBankingFAQ(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.lnkInternetBankingFAQ);
		    }
		   //pageobjects for Privacy
		   public static WebElement lnkPrivacy(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.lnkPrivacy);
		    }
		   //pageobjects for Terms and Conditions 
		   public static WebElement lnkTermsandConditions(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.lnkTermsandConditions);
		    }
		   //pageobjects for Disclaimer
		   public static WebElement lnkDisclaimer(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.lnkDisclaimer);
		    }
		   //pageobjects for Site Map
		   public static WebElement lnkSiteMap(WebDriver driver)
		   {
			  return driver.findElement(Locators.RanfordHomePage.lnkSiteMap);
		    }
		   
	}//ending of Ranford Home Page 
	
	
	
	
	//class for Customer Login Home Page
	 public static class CustomerLogin
	 {
		 //pageobjects for UserName Locator for personal,corporate and international
		 public static WebElement btnUserName(WebDriver driver)
	      {
		    return driver.findElement(Locators.CustomerLogin.btnUserName);
	      }
		 //pageobjects for  Password Locator for personal,corporate and international
		 public static WebElement btnPassword(WebDriver driver)
	      {
		    return driver.findElement(Locators.CustomerLogin.btnPassword);
	      }
		//pageobjects for Login Locator for personal,corporate and international
		 public static WebElement btnLogin(WebDriver driver)
	      {
		    return driver.findElement(Locators.CustomerLogin.btnLogin);
	      }
		 
	 }//ending of Customer Login Home Page
	 
	
	
	
	//class for Personal Banking
   public static class PersonalBanking
   {
	     //pageobjects for SavingAccounts
	     public static WebElement imgSavingAccounting(WebDriver driver)
	      {
		    return driver.findElement(Locators.PersonalBanking.imgSavingAccounting);
	      }
	     //pageobjects for Fixed Deposits
	     public static WebElement imgFixedDeposits(WebDriver driver)
	      {
		    return driver.findElement(Locators.PersonalBanking.imgFixedDeposits);
	      }
	     //pageobjects for Money Transfer
	     public static WebElement imgMoneyTransfer(WebDriver driver)
	      {
		    return driver.findElement(Locators.PersonalBanking.imgMoneyTransfer);
	      }
	     //pageobjects for Cards
	     public static WebElement imgCards(WebDriver driver)
	      {
		    return driver.findElement(Locators.PersonalBanking.imgCards);
	      }
	     //pageobjects for Loans
	     public static WebElement imgLoans(WebDriver driver)
	      {
		    return driver.findElement(Locators.PersonalBanking.imgLoans);
	      }
	     //pageobjects for Payments
	     public static WebElement imgPayments(WebDriver driver)
	      {
		    return driver.findElement(Locators.PersonalBanking.imgPayments);
	      }
      }//ending of personal banking page
   
   
   
   //class for after login home page
   public static class GlobalLocators
   {
	   //pageobjects for Branches Locator
	   public static WebElement imgBranches(WebDriver driver)
	   {
		   return driver.findElement(Locators.GlobalLocators.imgBranches);
	   }
	         //pageobjects for Country 
	         public static Select lstCountry(WebDriver driver)
	         {
		      return new Select(driver.findElement(Locators.GlobalLocators.lstCountry));
	         }
	         //pageobjects for State
	         public static Select lstState(WebDriver driver)
	         {
		      return new Select(driver.findElement(Locators.GlobalLocators.lstState));
	         }
	         //pageobjects for City
	         public static Select lstCity(WebDriver driver)
	         {
		      return new Select(driver.findElement(Locators.GlobalLocators.lstCity));
	         }
	         //pageobjects for Search
	         public static WebElement btnSearch(WebDriver driver)
	         {
		      return driver.findElement(Locators.GlobalLocators.btnSearch);
	         }
	         //pageobjects for Clear
	         public static WebElement btnClear(WebDriver driver)
	         {
		      return driver.findElement(Locators.GlobalLocators.btnClear);
	         }
	         
	         
	  //pageobjects for Roles
	   public static WebElement imgRoles(WebDriver driver)
      {
		return driver.findElement(Locators.GlobalLocators.imgRoles);
       }     
	  //pageobjects for Users
	   public static WebElement imgUsers(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.imgUsers);
	   }
	            //pageobjects for  Branch Locators
	             public static Select lstBranch(WebDriver driver)
	             {
	              return new Select(driver.findElement(Locators.GlobalLocators.lstBranch));
	              }
	             //pageobjects for Roles Locators
	             public static Select lstRoles(WebDriver driver)
	             {
	              return new Select(driver.findElement(Locators.GlobalLocators.lstRoles));
	              }
	           //pageobjects for Login Password Locators
	             public static WebElement btnLoginPassword(WebDriver driver)
	             {
	              return driver.findElement(Locators.GlobalLocators.btnLoginPassword);
	              }
	   
	             
	   //pageobjects for Employees
	   public static WebElement imgEmployees(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.imgEmployees);
	   }
	   //pageobjects for HomeAdmin
	   public static WebElement imgHomeAdmin(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.imgHomeAdmin);
	   }
	   //pageobjects for Logout
	   public static WebElement imgLogout(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.imgLogout);
	   }
	   //pageobjects for Submit
	   public static WebElement btnSubmit(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.btnSubmit);
	   }
	   //pageobjects for reset
	   public static WebElement btnReset(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.btnReset);
	   }
	   //pageobjects for cancel
	   public static WebElement btnCancel(WebDriver driver)
	   {
	    return driver.findElement(Locators.GlobalLocators.btnCancel);
	   }
	   
	   
	   
   }//ending of Global Locators
   
   
   
   
   //class for New Branches Locators
   public static class NewBranch
   {
	 //pageobjects for NewBranch Locator
	   public static WebElement btnNewBranch(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnNewBranch);
	   }
	 //pageobjects for Branch Name Locator
	   public static WebElement btnBranchName(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnBranchName);
	   }
	 //pageobjects for Address1 Locator
	   public static WebElement btnAddress1(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnAddress1);
	   }
	 //pageobjects for Address2 Locator
	   public static WebElement btnAddress2(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnAddress2);
	   }
	 //pageobjects for Address3 Locator
	   public static WebElement btnAddress3(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnAddress3);
	   }
	  //pageobjects for Area Locator
	   public static WebElement btnArea(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnArea);
	   }
	 //pageobjects for  ZipCode Locator
	   public static WebElement btnZipCode(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewBranch.btnZipCode);
	   }
	   
	   
   }//ending of New Branches Locators
   
   
   
   
 //class New Roles Locators
   public static class NewRoles
   {
	 //pageobjects for NewRole Locator
	   public static WebElement btnNewRole(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewRoles.btnNewRole);
	   }
	 //pageobjects for RoleName Locator
	   public static WebElement btnRoleName(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewRoles.btnRoleName);
	   }
	 //pageobjects for RoleDesc Locator
	   public static WebElement btnRoleDesc(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewRoles.btnRoleDesc);
	   }
	 //pageobjects for RoleType Locator
	   public static Select lstRoleType(WebDriver driver)
	   {
	    return new Select(driver.findElement(Locators.NewRoles.lstRoleType));
	   }
   }//ending of New Role Locators
   
   
   
   
 //class New User Locators
   public static class NewUser
   {
	 //pageobjects for CustomerID Locator
	   public static Select lstCustomerID(WebDriver driver)
	   {
	    return new Select(driver.findElement(Locators.NewUser.lstCustomerID));
	   }
	 //pageobjects for Customer Name Locator
	   public static WebElement btnCustomerName(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewUser.btnCustomerName);
	   }
	 //pageobjects for UserName Locator
	   public static WebElement btnUserName(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewUser.btnUserName);
	   }
	 //pageobjects for  Transaction password Locator
	   public static WebElement btnTransactionPassword(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewUser.btnTransactionPassword);
	   }
	   
   }//ending of New User
   
   
   
   
 //class New Employee Locators
   public static class NewEmployee
   {
	 //pageobjects for  Employer Name Locator
	   public static WebElement btnEmployerName(WebDriver driver)
	   {
	    return driver.findElement(Locators.NewEmployee.btnEmployerName);
	   }
   }//ending of New Employee Locators
   
   
}//ending of pageobjects  
