package com.oibk.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oibk.lib.CommonFunctions;

public class TC003_Register_Branches {
	@Test
	public void TC003() {
	//public static void main(String[]args) {
		DOMConfigurator.configure("F:\\Java11\\OIBK_FRM\\src\\com\\oibk\\utility\\log4j.xml");
		CommonFunctions obj = new CommonFunctions();
		obj.openApplication();
		obj.Admin_login();
		obj.Mouseover_Branch_menu();
		obj.Click_on_Register_Branches_Submenu();
		obj.Branch_Registeration();
		obj.Mouseover_Branch_menu();
		obj.View_Branch();
		obj.logout();
		obj.closeApplication();
	}

}
