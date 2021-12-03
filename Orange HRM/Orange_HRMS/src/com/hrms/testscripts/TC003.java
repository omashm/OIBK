package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	@Test
	public void tc003() {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterEmpFrame();
		obj.editEmpInfo();
		obj.exitEmpframe();
		obj.logout();
		obj.closeApplication();
		Reporter.log("Edit Emp Sucessful.");

	}
	
	

}
