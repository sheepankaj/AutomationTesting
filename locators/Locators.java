package com.ranford.locators;

import org.openqa.selenium.By;

public class Locators 
{
     public static class RanfordHomePage
     {
    	 //userName Locator
    	 public static By txtUserName=By.id("txtuId");
    	 
    	 //Password Locators
    	  public static By txtPassword=By.id("txtPword");
    	  
    	  //BranchName Locator
    	  public static By lstBranchname=By.id("drlist");
    	  
    	  //Login Locator
    	  public static By btnLogin=By.id("login");
    	  
    	  //Home Locator
    	  public static By imgHome=By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a/img");
    	  
    	  //Personal Banking Locator
    	  public static By imgPersonalBanking=By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a/img");
    	  
    	  //Corporate Banking Locators
    	  public static By imgCorporateBanking=By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a/img");
    	  
    	  //International Banking Locator
    	  public static By imgInternationalBanking=By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[5]/a/img");
    	  
    	  //About Us Locators
    	  public static By imgAboutUs=By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[6]/a/img");

    	  //Personal Locator
    	  public static By btnPesonal=By.id("personal");
    	  
    	  //Corporate Locator
    	  public static By btnCorporate=By.id("corporate");
    	  
    	  //International Locator
    	  public static By btnInternational=By.id("NRI");
    	  
    	  //Customer Services Locators
    	  public static By lnkCustomerService=By.linkText("Customer Service");
    	  
    	  //Internet Banking FAQ's Locator
    	  public static By lnkInternetBankingFAQ=By.linkText("Internet Banking FAQ's");
    	  
    	  //Privacy Locator
    	  public static By lnkPrivacy=By.linkText("Privacy");
    	  
    	  //Terms and Conditions Locator
    	  public static By lnkTermsandConditions=By.linkText("Terms and Conditions");
    	  
    	  //Disclaimer Locator
    	  public static By lnkDisclaimer=By.linkText("Disclaimer");
    	  
    	  //Site Map Locator
    	  public static By lnkSiteMap=By.linkText("Site Map");
    	  
    	  
     }//ending of Ranford Home Page
     
     
                //class for Customer Login Home page
                   public static class CustomerLogin
    	            {
    	             //UserName Locator for personal,corporate and international
    	              public static By btnUserName=By.xpath("//input[@id='idtxt']");
    	 
    	            //Password Locator for personal,corporate and international
    	              public static By btnPassword=By.xpath("//input[@id='pswdtxt']");
    	 
                   //Login Locator for personal,corporate and international
    	              public static By btnLogin=By.xpath("//input[@id='btnGO']");
    	 
    	            }//ending of customer login 
                   
                   
                   
             //class for personal banking home page
           public static class PersonalBanking
              {
    	       //SavingAccounts Locator
    	       public static By imgSavingAccounting=By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img");
    	 
    	       //FixedDeposits Locator
    	       public static By imgFixedDeposits=By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img");
    	 
    	       //MoneyTransfer Locator
    	       public static By imgMoneyTransfer=By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img");
    	 
    	       //Cards Locator
    	       public static By imgCards=By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img");
    	 
    	      //Loans Locator
    	      public static By imgLoans=By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[10]/td/a/img");
    	 
    	     //Payments Locators
    	     public static By imgPayments=By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[12]/td/a/img");
    	    
           }//ending of personal banking page
     
           
           
           
           
           
     public static class GlobalLocators
     {
    	 //Branches Locators
    	 public static By imgBranches=By.xpath("//img [@src='images/Branches_but.jpg']");
    	 
    	        //Country Locators
                   public static By lstCountry=By.xpath("//select[starts-with(@id,'lst_coun')]");
    	        //State Locator
    	         public static By lstState=By.xpath("//select[starts-with(@id,'lst_state')]");
    	 
    	         //City Locator
    	          public static By lstCity=By.xpath("//select[starts-with(@id,'lst_city')]");
    	          
    	          //Search Locator
    	     	 public static By btnSearch=By.xpath("//input[@id='btn_search']");
    	     	 
    	     	 //Clear Locator
    	     	 public static By btnClear=By.xpath("//input[@id='btn_clsearch' or @id='btn_clear']");
    	 
    	 //Roles Locators
    	 public static By imgRoles=By.xpath("//img [@src='images/Roles_but.jpg']");
    	 
    	 //Users Locators
    	 public static By imgUsers=By.xpath("//img[@src='images/Users_but.jpg']");
    	      //Branch Locators
    	         public static By lstBranch=By.xpath("//select[@id='lst_branchS' or @id='lst_Branch']");
    	      //Roles Locators
    	         public static By lstRoles=By.xpath("//select[@id='lst_rolesS' or  @id='lst_Roles']");
    	      //Login Password for New User and New Employee (page) LoginLocators
    	         public static By btnLoginPassword=By.xpath("//input[contains(@id,'txtLpwd')]");
    	 
    	 //Employees Locators
    	 public static By imgEmployees=By.xpath("//img[@src='images/emp_btn.jpg']");
    	 
    	 //HomeAdmin Locators
    	 public static By imgHomeAdmin=By.xpath("//img[@src='images/admin_but_01.jpg']");
    	 
    	 //Logout Locators
    	 public static By imgLogout=By.xpath("//img[@src='images/admin_but_03.jpg']");
    	  
    	  //Submit Locator
    	  public static By btnSubmit=By.xpath("//input[@id='btn_insert' or @id='BtnSubmit']");
    	 
    	   //Reset Locator
    	   public static By btnReset=By.xpath("//input[@src='images/Reset.jpg' or @src='images/reset.jpg']");
    	 
    	   //Cancel Locator
    	   public static By btnCancel=By.xpath("//input[contains(@src,'ancel.jpg')]");
     }
     
     
     
     
     
   //New Branches Locators
     public static class NewBranch
     {
    	 //NewBranch Locator
    	 public static By btnNewBranch=By.id("BtnNewBR");
    	 //Branch Name Locator
    	 public static By btnBranchName=By.id("txtbName");
    	 
    	 //Address1 Locator
    	 public static By btnAddress1=By.id("txtAdd1");
    	 
    	 //Address2 Locator
    	 public static By btnAddress2=By.id("Txtadd2");
    	 
    	 //Address3 Locator
    	 public static By btnAddress3=By.id("txtadd3");
    	 
    	 //Area Locator
    	 public static By btnArea=By.id("txtArea");
    	 
    	 //ZipCode Locator
    	 public static By btnZipCode=By.id("txtZip");
    	  	 
     }//ending of New Branch Locators
     
     
     
     
     //New Role Locators
     public static class NewRoles
     {
    	//NewRole Locator
    	 public static By btnNewRole=By.id("btnRoles");
    	 //RoleName Locator
    	 public static By btnRoleName=By.id("txtRname");
    	 //RoleDesc Locator
    	 public static By btnRoleDesc=By.id("txtRDesc");
    	 //RoleType Locator
    	 public static By lstRoleType=By.id("lstRtypeN");
    	 
     }//ending of New Role Locators
     
     
     
     //New User Locators
     public static class NewUser
     {
    	 //CustomerID Locator
    	 public static By lstCustomerID=By.id("DrCName");
    	 //Customer Name Locator
    	 public static By btnCustomerName=By.id("Lbc_name");
    	 //UserName Locator
    	 public static By btnUserName=By.id("txtUname");
    	 //Transaction password Locator
    	 public static By btnTransactionPassword=By.id("txtTpwd");
    	 
     }//ending of New User 
     
     
     
     //New Employee Locators
     public static class NewEmployee
     {
    	 //Employer Name Locator
    	 public static By btnEmployerName=By.id("txtUname");
     }//ending of New Employee Locators
     
     
     
}
