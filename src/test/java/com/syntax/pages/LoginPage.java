package com.syntax.pages;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	import com.syntax.utils.BaseClass;
import com.syntax.utils.CommondMethods;

	public class LoginPage extends BaseClass{

		public WebElement username=driver.findElement(By.id("txtUsername"));
		public WebElement password=driver.findElement(By.id("txtPassword"));
		public WebElement btnLogin=driver.findElement(By.id("btnLogin"));
		
	
	
	public void login(String uname,String pwd) {
		CommondMethods.sendText(username, uname);
		CommondMethods.sendText(password, pwd);
		CommondMethods.click(btnLogin);
	}

}