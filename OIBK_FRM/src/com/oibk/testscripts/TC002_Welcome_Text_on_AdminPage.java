package com.oibk.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oibk.lib.CommonFunctions;

public class TC002_Welcome_Text_on_AdminPage {
	@Test
	public void TC002 () {
	// public static void main(String args[]) {
		DOMConfigurator.configure("F:\\Java11\\OIBK_FRM\\src\\com\\oibk\\utility\\log4j.xml");
         CommonFunctions obj = new CommonFunctions();
         obj.openApplication();
         obj.Admin_login();
         obj.Welcome_Text();
         obj.logout();
         obj.closeApplication();
}
}
