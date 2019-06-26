package com.ranford.GeneralFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ranford.configure.Configure;

public class GeneralFunctions {

	public static class Browser
	{
		/*************************************************************
		 * Method Name   : launchApllication
		 * Purpose       : for launching Application
		 * Created on    :
		 * Created By    :
		 * Updated By    :
		 *Reviewed By    :
		 *************************************************************/
		
		public static WebDriver launchApplication(String url)
		{
			WebDriver driver = null;
			switch(Configure.sBrowserName)
			{
			case "Firefox":
			{
				driver=new FirefoxDriver();
				break;
			}
			case "Chrome":
			{
				System.setProperty("webdriver.chrome.driver","chromedriver.exe path");
				driver=new ChromeDriver();
				break;
			}
			default:
			{
				System.out.println("No Browser is available");
				break;
			}
			
			}//end of switch
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return driver;
		}
		
		/*************************************************************
		 * Method Name   : Close Browser
		 * Purpose       : It closes the Browser
		 * Created on    :
		 * Created By    :
		 * Updated By    :
		 *Reviewed By    :
		 *************************************************************/
		
		public static boolean BrowserClose(WebDriver driver)
		{
			try{
				driver.quit();
				return true;
			  }catch(Exception e)
			{
				  e.printStackTrace();
				  return false;
			}		}
      }

}