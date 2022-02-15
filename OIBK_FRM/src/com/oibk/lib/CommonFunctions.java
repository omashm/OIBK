package com.oibk.lib;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.oibk.utility.Log;

public class CommonFunctions extends GlobalData{
	//re-usable fun: related to whole application
	public void openApplication() {
	try {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application opened");
		Log.info("Application Opened");
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("Application not opened");
		Reporter.log("Application not opened");
	}
	}
	
	public void closeApplication() {
	   try {
		   driver.close();
	        System.out.println("Application closed");
	        Reporter.log("Application closed");
	        Log.info("Application Closed");
	   }
	   catch(Exception e) {
		   System.out.println(e);
		   System.out.println("Application not closed");
		   Reporter.log("Application not closed");
	   }
	}
	
	public void Admin_login() {
		try {
			driver.findElement(By.name(textbox_userid_name)).sendKeys(Admin_un1);
			driver.findElement(By.name(txtbox_password_name)).sendKeys(Admin_pw1);
			driver.findElement(By.name(button_signin_name)).click();
			System.out.println("Login completed");
			Reporter.log("Login completed");
			Log.info("Login completed");
		}
		catch(Exception e) {
			System.out.println("Login Failed");
			Reporter.log("Login Failed");
		}
			
		
	}
	public void Emp_login() {
		try {
			driver.findElement(By.name(textbox_userid_name)).sendKeys(Cust_un);
			driver.findElement(By.name(txtbox_password_name)).sendKeys(Cust_pw);
			driver.findElement(By.name(button_signin_name)).click();
			System.out.println("Login completed");
			Reporter.log("Login completed");
			Log.info("Login completed");
			
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Login Failed");
			Reporter.log("Login Failed");
		}
	}
	
	public void logout() {
		try {
	driver.findElement(By.linkText(link_logout_linktext)).click();
	System.out.println("Logout completed");
	Reporter.log("Logout completed");
	Log.info("Logout completed");
		}
		catch (Exception e){
			System.out.println(e);
			System.out.println("Logout Failed");
			Reporter.log("Logout Failed");
		}
	}
	
	public void Welcome_Text() {
		try {
			System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3")).getText());
			Reporter.log(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3")).getText());
			//Log.info(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3")).getText());
		}
		catch(Exception e) {
			System.out.println("Welcome Text not found");
			Reporter.log("Welcome Text not found");
		}
	}
	
	public void Mouseover_Branch_menu() {
		 try {
			 at = new Actions(driver);
			 at.moveToElement(driver.findElement(By.name(Branches_menu_name))).perform();
			 System.out.println("Mouseover on Branches menu Completed");
			 Reporter.log("Mouseover on Branches menu Completed");
			 Log.info("Mouseover on Branches menu Completed");
		 }
		 catch(Exception e) {
			 System.out.println("Mouseover on Branches menu Failed"); 
			 Reporter.log("Mouseover on Branches menu Failed");
		 }
	}
	public void Mouseover_Employee_menu() {
		 try {
			 at = new Actions(driver);
			 at.moveToElement(driver.findElement(By.name(Employee_menu_name))).perform();
			 System.out.println("Mouseover on Employee menu Completed");
			 Reporter.log("Mouseover on Employee menu Completed");
			 Log.info("Mouseover on Employee menu Completed");
		 }
		 catch(Exception e) {
			 System.out.println("Mouseover on Employee menu Failed");
			 Reporter.log("Mouseover on Employee menu Failed");
		 }
	}
	public void Mouseover_Customer_menu() {
		 try {
			 at = new Actions(driver);
			 at.moveToElement(driver.findElement(By.name(Customer_menu_name))).perform();
			 System.out.println("Mouseover on Customer menu Completed");
			 Reporter.log("Mouseover on Customer menu Completed");
			 Log.info("Mouseover on Customer menu Completed");
		 }
		 catch(Exception e) {
			 System.out.println("Mouseover on Customer menu Failed");
			 Reporter.log("Mouseover on Customer menu Failed");
		 }
	}
	public void Click_on_Register_Emp_submenu() {
		try {
			at.moveToElement(driver.findElement(By.xpath(Register_Employee_Xpath))).perform();
			System.out.println("mouseover for Register Employee");
			Reporter.log("mouseover for Register Employee");
			driver.findElement(By.xpath(Register_Employee_Xpath)).click();
			System.out.println("Clicked on Register Employee sub menu");
			Reporter.log("Clicked on Register Employee sub menu");
			Log.info("Clicked on Register Employee sub menu");
		}
		catch(Exception e) {
			System.out.println("Clicked on Register Employee sub menu Failed");
			Reporter.log("Clicked on Register Employee sub menu Failed");
		}
	}
	public void Click_on_Register_Branches_Submenu() {
		try {
			at.moveToElement(driver.findElement(By.xpath(Register_Branches_Xpath))).perform();
			System.out.println("mouseover for Register Branches Submenu");
			Reporter.log("mouseover for Register Branches Submenu");
			driver.findElement(By.xpath(Register_Branches_Xpath)).click();
			System.out.println("Clicked on Register Branches sub menu");
			Reporter.log("Clicked on Register Branches sub menu");
			Log.info("Clicked on Register Branches sub menu");
		}
		catch(Exception e) {
			System.out.println("Clicked on Register Branches sub menu Failed");
			Reporter.log("Clicked on Register Branches sub menu Failed");
			
		}
	}
	public void Click_on_Customer_Registeration_Submenu () {
		try {
			at.moveToElement(driver.findElement(By.xpath(Register_Customer_Xpath))).perform();
			System.out.println("mouseover for Register Customer");
			Reporter.log("mouseover for Register Customer");
			driver.findElement(By.xpath(Register_Customer_Xpath)).click();
			System.out.println("Clicked on Register Customer sub menu");
			Reporter.log("Clicked on Register Customer sub menu");
			Log.info("Clicked on Register Customer sub menu");
		}
		catch(Exception e) {
			System.out.println("Clicked on Register Customer sub menu Failed");
			Reporter.log("Clicked on Register Customer sub menu Failed");
		}
	}
	public void Branch_Registeration () {
		try {
			driver.findElement(By.name(textbox_Branchadd_name)).sendKeys("Vasantnagar");
			driver.findElement(By.name(textbox_Branchemail_name)).sendKeys("asr@gmail.com");
			driver.findElement(By.name(textbox_Phoneno1_name)).sendKeys("1234567890");
			driver.findElement(By.name(textbox_Phoneno2_name)).sendKeys("1234567800");
			driver.findElement(By.name(textbox_Phoneno3_name)).sendKeys("1234567000");
			driver.findElement(By.name(button_Register_name)).click();
			System.out.println("Branch Registeration Sucessful");
			Reporter.log("Branch Registeration Sucessful");
			Log.info("Branch Registeration Sucessful");
		}
		catch(Exception e) {
			System.out.println("Branch Registeration Failed");
			Reporter.log("Branch Registeration Failed");
		}
	}
	public void View_Branch() {
		try {
			at.moveToElement(driver.findElement(By.xpath(View_Branch_Xpath))).perform();
			System.out.println("mouseover for View branches");
			Reporter.log("mouseover for View branches");
			driver.findElement(By.xpath(View_Branch_Xpath)).click();
			System.out.println("Clicked on View Branches sub menu");
			Reporter.log("Clicked on View Branches sub menu");
			Log.info("Clicked on View Branches sub menu");
		}
		catch (Exception e) {
			System.out.println("Clicked on View Branches sub menu Failed");
			Reporter.log("Clicked on View Branches sub menu Failed");
		}
	    
	}
	public void Emp_Registeration() throws Exception {
		try {
			Select st = new Select(driver.findElement(By.name(dropdown_Branchadd_name)));
			st.selectByValue("Shivajinagar");
			driver.findElement(By.name(textbox_acc_intial_bal_name)).sendKeys("3000");
			driver.findElement(By.name(textbox_FN_name)).sendKeys("Vikas");
			driver.findElement(By.name(textbox_LN_name)).sendKeys("Kadam");
			
			driver.findElement(By.xpath(Img_Calender_Xpath)).click();
			ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windinfo.get(1));
			System.out.println("Switch on new window Sucessful");
			driver.findElement(By.xpath(textbox_Calender_year_Xpath)).clear();
			driver.findElement(By.xpath(textbox_Calender_year_Xpath)).sendKeys("1997");
			driver.findElement(By.xpath(Button_Calender_Get_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			//driver.findElement(By.xpath(Button_Calender_SelectDate_Xpath)).click();
			driver.findElement(By.linkText("16")).click();
			Thread.sleep(3000);
			System.out.println("Birth date selection Sucessful");
			Reporter.log("Birth date selection Sucessful");
			driver.switchTo().window(windinfo.get(0));
			System.out.println("Switch on Previous window Sucessful");
			Reporter.log("Switch on Previous window Sucessful");
			Thread.sleep(2000);
			
			driver.findElement(By.name(textbox_houseno_name)).sendKeys("C102");
			driver.findElement(By.name(textbox_street_name)).sendKeys("Pune Road");
			Select sa = new Select(driver.findElement(By.name(dropdown_city_name)));
			sa.selectByValue("Mumbai");
			Select sl = new Select(driver.findElement(By.name(dropdown_State_name)));
			sl.selectByValue("Maharashtra");
			Select co = new Select(driver.findElement(By.name(dropdown_country_name)));
			co.selectByValue("India");
			driver.findElement(By.name(textbox_pincode_name)).sendKeys("400030");
			driver.findElement(By.name(textbox_phoneNo_name)).sendKeys("1234567891");
			driver.findElement(By.name(textbox_email_name)).sendKeys("ax@gmail.com");
			driver.findElement(By.name(textbox_loginID_name)).sendKeys("Vk258");
			driver.findElement(By.name(textbox_pass_name)).sendKeys("Vk258");
			Select ans = new Select(driver.findElement(By.name(dropdown_Secret_Que_name)));
			ans.selectByValue("2");
			driver.findElement(By.name(textbox_Secret_Ans_name)).sendKeys("Hero");
			Thread.sleep(2000);
			driver.findElement(By.name(button_Emp_Register_name)).click();
			System.out.println("Employee Registeration Sucessful");
			Reporter.log("Employee Registeration Sucessful");
			Log.info("Employee Registeration Sucessful");
		}
		catch (Exception e) {
			System.out.println("Employee Registeration Fail");
			Reporter.log("Employee Registeration Fail");
		}
	}
	public void Cust_Registeration() throws Exception {
		try {
			Select st = new Select(driver.findElement(By.name(dropdown_Branchadd_name)));
			st.selectByValue("Shivajinagar");
			driver.findElement(By.name(textbox_acc_intial_bal_name)).sendKeys("3000");
			driver.findElement(By.name(textbox_FN_name)).sendKeys("Rakesh");
			driver.findElement(By.name(textbox_LN_name)).sendKeys("Kadam");
			
			driver.findElement(By.xpath(Img_Calender_Xpath)).click();
			ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windinfo.get(1));
			System.out.println("Switch on new window Sucessful");
			Reporter.log("Switch on new window Sucessful");
			driver.findElement(By.xpath(textbox_Calender_year_Xpath)).clear();
			driver.findElement(By.xpath(textbox_Calender_year_Xpath)).sendKeys("1995");
			driver.findElement(By.xpath(Button_Calender_Get_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_next_Xpath)).click();
			driver.findElement(By.xpath(Button_Calender_SelectDate_Xpath)).click();
			System.out.println("Birth date selection Sucessful");
			Reporter.log("Birth date selection Sucessful");
			driver.switchTo().window(windinfo.get(0));
			System.out.println("Switch on Previous window Sucessful");
			Reporter.log("Switch on Previous window Sucessful");
			Thread.sleep(2000);
			
			driver.findElement(By.name(textbox_houseno_name)).sendKeys("K10");
			driver.findElement(By.name(textbox_street_name)).sendKeys("Nagar Road");
			Select sa = new Select(driver.findElement(By.name(dropdown_city_name)));
			sa.selectByVisibleText("Mumbai");
			Select sl = new Select(driver.findElement(By.name(dropdown_State_name)));
			sl.selectByVisibleText("Maharashtra");
			Select co = new Select(driver.findElement(By.name(dropdown_country_name)));
			co.selectByVisibleText("India");
			driver.findElement(By.name(textbox_pincode_name)).sendKeys("400030");
			driver.findElement(By.name(textbox_phoneNo_name)).sendKeys("1234567891");
			driver.findElement(By.name(textbox_email_name)).sendKeys("zx@gmail.com");
			driver.findElement(By.name(textbox_loginID_name)).sendKeys("sk25");
			driver.findElement(By.name(textbox_pass_name)).sendKeys("sk25");
			Select ans = new Select(driver.findElement(By.name(dropdown_Secret_Que_name)));
			ans.selectByValue("2");
			driver.findElement(By.name(textbox_Secret_Ans_name)).sendKeys("Hero");
			Thread.sleep(2000);
			driver.findElement(By.name(button_Emp_Register_name)).click();
			System.out.println("Customer Registeration Sucessful.");
			Reporter.log("Customer Registeration Sucessful.");
			Log.info("Customer Registeration Sucessful.");
		}
		catch(Exception e) {
			System.out.println("Customer Registeration Fail.");
			Reporter.log("Customer Registeration Fail.");
		}
	}
	
}
