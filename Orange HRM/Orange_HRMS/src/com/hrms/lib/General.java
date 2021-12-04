package com.hrms.lib;

import java.io.FileInputStream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

import jxl.Sheet;
import jxl.Workbook;

public class General extends Global {

	
	public void openApplication() {
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\Driver\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to(url);
	Log.info("Application Opened");
	
	}

	public void login() {
	driver.findElement(By.xpath(txt_loginname)).sendKeys(un);
	driver.findElement(By.xpath(txt_password)).sendKeys(pw);
	driver.findElement(By.xpath(btn_login)).click();
	Log.info("Login completed");
	}
	public void logout() {
	driver.findElement(By.xpath(link_logout)).click();
	Log.info("Logout completed");
	}
	
	public void closeApplication() {
	driver.close();
	Log.info("Application Closed");
	}
	
	public void addEmp() throws Exception {
		for (int i=1;i<=5; i=i+1){
		file=new FileInputStream("F:\\Notes\\Test2.xls");
		wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		String ln=st.getCell(0, i).getContents();
		String fn=st.getCell(1, i).getContents();
		

	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_lastname)).sendKeys(ln);
	driver.findElement(By.name(txt_firstname)).sendKeys(fn);
	driver.findElement(By.xpath(btn_save)).click();
	driver.findElement(By.xpath(btn_back)).click();
	Reporter.log(ln+" "+fn);
	


		}
		Log.info("Add Emp. completed");
	}
	
	public void enterEmpFrame() {
		driver.switchTo().frame(frame);
		Log.info("Entered into Frame");
	}
	
	public void exitEmpframe() {
		driver.switchTo().defaultContent();
		Log.info("Exited from Frame");
	}
	public void editEmpInfo() {
		driver.findElement(By.xpath(link_emp)).click();
		driver.findElement(By.xpath(btn_edit)).click();
		driver.findElement(By.name(txt_lastname)).clear();
		driver.findElement(By.name(txt_firstname)).clear();
		driver.findElement(By.name(txt_lastname)).sendKeys("Ram");
		driver.findElement(By.name(txt_firstname)).sendKeys("kadam");
		driver.findElement(By.xpath(btn_editndsave)).click();
		driver.findElement(By.xpath(btn_back)).click();
		Log.info("Edit Emp. info. completed");
	}
	public void deleteimg() {
		driver.findElement(By.xpath(link_emp)).click();
		driver.findElement(By.xpath(imgEmp)).click();
		driver.findElement(By.xpath(imgDelete)).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath(btn_back)).click();
		Log.info("Delete Emp. Image completed");
		
		
	}

}
