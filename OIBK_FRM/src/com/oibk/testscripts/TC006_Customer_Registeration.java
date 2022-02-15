package com.oibk.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oibk.lib.CommonFunctions;

public class TC006_Customer_Registeration {
	@Test
	public void TC006() throws Exception {
	//public static void main(String[]args) throws Exception {
		DOMConfigurator.configure("F:\\Java11\\OIBK_FRM\\src\\com\\oibk\\utility\\log4j.xml");
		CommonFunctions obj = new CommonFunctions();
		obj.openApplication();
		obj.Emp_login();
		obj.Mouseover_Customer_menu();
		obj.Click_on_Customer_Registeration_Submenu();
		obj.Cust_Registeration();
		Thread.sleep(3000);
		obj.logout();
		Thread.sleep(2000);
		obj.closeApplication();
	}
}
