package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
	@Test
	public void tc004() {
		DOMConfigurator.configure("C:\\Users\\ashutosh\\git\\repository\\Orange HRM\\Orange_HRMS\\src\\com\\hrms\\utility\\log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterEmpFrame();
		obj.deleteimg();
		obj.exitEmpframe();
		obj.logout();
		obj.closeApplication();
		Reporter.log("Delete Img Sucessful.");

	}

}
