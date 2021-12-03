package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterEmpFrame();
		obj.addEmp();
		obj.exitEmpframe();
		obj.logout();
		obj.closeApplication();
		Reporter.log("Add Emps Sucessful.");
		
	}

}
