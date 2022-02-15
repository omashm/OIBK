package com.oibk.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalData {
	
	public WebDriver driver;
	public Actions at;
	
	// Test Data
	public String url="http://183.82.103.245:8888/BankingProject/LoginForm.jsp";
	public String Admin_un1="Admin";
	public String Admin_pw1="Admin";
	public String Admin_un2="nareshit";
	public String Admin_pw2="nareshit";
	public String Cust_un="nareshitemp";
	public String Cust_pw="nareshitemp";
	
	// Objects
	public String textbox_userid_name     = "username";
	public String txtbox_password_name    = "password";
	public String button_signin_name      = "Submit";
	public String link_logout_linktext    = "Logout";
	public String button_clear_name       = "Input2";
	public String text_on_Home_Xpath      = "/html/body/table/tbody/tr/td/table[3]/tbody/tr/td/center/h3";
	public String Branches_menu_name      = "link7";
	public String Customer_menu_name      = "link7";
	public String Register_Branches_Xpath = "//*[@id='menuItemHilite0']";
	public String textbox_Branchadd_name  = "branchAddr";
	public String dropdown_Branchadd_name  = "branchaddress";
	public String textbox_Branchemail_name= "branchEmailId";
	public String textbox_Phoneno1_name   = "branchPhNo1";
	public String textbox_Phoneno2_name   = "branchPhNo2";
	public String textbox_Phoneno3_name   = "branchPhNo3";
	public String button_Register_name    = "Register";
	public String View_Branch_Xpath       = "//*[@id='menuItemHilite1']";
	public String Employee_menu_name      = "link5";
	public String Register_Employee_Xpath = "//*[@id='menuItemHilite10']";
	public String Register_Customer_Xpath = "//*[@id='menuItemHilite0']";
	public String textbox_acc_intial_bal_name= "accountInitialBalance";
	public String textbox_FN_name         = "firstname";
	public String textbox_LN_name         = "lastname";
	public String Img_Calender_Xpath      = "/html/body/table/tbody/tr/td/table[3]/tbody/tr[2]/td/div/form/fieldset/table/tbody/tr[5]/td[2]/a/img";
	public String textbox_Calender_year_Xpath  = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/font/input";
	public String Button_Calender_Get_Xpath  = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td/input";
	public String Button_Calender_next_Xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[3]/a/img";
	public String Button_Calender_SelectDate_Xpath= "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]/a/font";
	public String textbox_houseno_name    = "hno";
	public String textbox_street_name     = "street";
	public String textbox_pincode_name    = "pincode";
	public String textbox_phoneNo_name    = "phoneNo";
	public String textbox_email_name      = "email";
	public String textbox_loginID_name    = "loginID";
	public String textbox_pass_name       = "password";
	public String dropdown_city_name      = "city";
	public String dropdown_State_name     = "state";
	public String dropdown_country_name   = "country";
	public String dropdown_Secret_Que_name= "secretqid";
	public String textbox_Secret_Ans_name = "secretqans";
	public String button_Emp_Register_name= "Input";
	public String button_Cust_Register_name= "Input";
	
	
	
	

}

