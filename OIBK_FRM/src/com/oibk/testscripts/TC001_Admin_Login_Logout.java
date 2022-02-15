package com.oibk.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.oibk.lib.CommonFunctions;

public class TC001_Admin_Login_Logout {
	@Test
	public void TC001() {
	//public static void main(String args[]) {
		DOMConfigurator.configure("F:\\Java11\\OIBK_FRM\\src\\com\\oibk\\utility\\log4j.xml");
         CommonFunctions obj = new CommonFunctions();
         obj.openApplication();
         obj.Admin_login();
         obj.logout();
         obj.closeApplication();
        
 }
}
/*
Try Block- Identifify the error.abstract
catch block - Catch the Error After identified by Try block.abstract*/
//<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">  