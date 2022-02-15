package com.oibk.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oibk.lib.CommonFunctions;

public class TC005_Employee_Login_Logout {
	@Test
	public void TC005() {
	//public static void main(String args[]) {
		DOMConfigurator.configure("F:\\Java11\\OIBK_FRM\\src\\com\\oibk\\utility\\log4j.xml");
        CommonFunctions obj = new CommonFunctions();
        obj.openApplication();
        obj.Emp_login();
        obj.logout();
        obj.closeApplication();
	}
}
