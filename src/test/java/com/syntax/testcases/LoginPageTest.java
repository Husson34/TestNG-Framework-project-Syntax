package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommondMethods;


public class LoginPageTest extends BaseClass{

	@Test(groups="smoke")
	public void loginToOrangeHRM() {
		
		LoginPage login=new LoginPage();
		
		CommondMethods.sendText(login.username, "Admin");
		CommondMethods.sendText(login.password, "Ig@E2raY1O");
		CommondMethods.click(login.btnLogin);
	
	}
}


