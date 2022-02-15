package com.oibk.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oibk.lib.CommonFunctions;

public class TC004_Employee_Registeration {
	@Test
	public void TC004() throws Exception {
	//public static void main(String[]args) throws Exception {
		DOMConfigurator.configure("F:\\Java11\\OIBK_FRM\\src\\com\\oibk\\utility\\log4j.xml");
		CommonFunctions obj = new CommonFunctions();
		obj.openApplication();
		obj.Admin_login();
		obj.Mouseover_Employee_menu();
		obj.Click_on_Register_Emp_submenu();
		obj.Emp_Registeration();
		obj.logout();
		obj.closeApplication();
}
}