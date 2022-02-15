package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
	//@Test
	//public void tc001() {
	public static void main (String Args[]) {
		//DOMConfigurator.configure("C:\\Users\\ashutosh\\git\\repository\\Orange HRM\\Orange_HRMS\\src\\com\\hrms\\utility\\log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		Reporter.log("Login logout Sucessful.");

	}


}
