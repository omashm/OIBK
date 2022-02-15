package com.hrms.lib;


import java.io.FileInputStream;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Global {
	public WebDriver driver;
	public FileInputStream file;
	public Workbook wb;
	public Sheet st;
	//Test data
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String frame="rightMenu";

	//objects
	public String txt_loginname="//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input";
	public String txt_password="//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input";
	public String btn_login="//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input";
	public String link_logout="//*[@id=\"option-menu\"]/li[3]/a";
	public String btn_add="//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String txt_firstname="txtEmpFirstName";
	public String txt_lastname="txtEmpLastName";
	public String btn_save="//*[@id=\"btnEdit\"]";
	public String btn_back="/html/body/div[5]/input";
	public String link_emp="//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
	public String btn_edit="//*[@id=\"btnEditPers\"]";
	public String btn_editndsave="//*[@id=\"btnEditPers\"]";
	public String imgEmp="//*[@id=\"photodiv\"]/img";
	public String imgDelete="//*[@id=\"photo\"]/div[1]/div[2]/div[2]/div/input[2]";

}
