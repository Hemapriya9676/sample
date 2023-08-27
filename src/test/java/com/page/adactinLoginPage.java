package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

//POJO class
public class adactinLoginPage extends Base{
	
	
	public adactinLoginPage() {
				PageFactory.initElements(driver,this );
	}
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginbutton;
	
	
	public WebElement getUser() {
		return username;
	}

	public void setUser(WebElement user) {
		this.username = user;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	

}
