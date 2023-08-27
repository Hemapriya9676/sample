package com.hcl;

import com.base.Base;
import com.page.adactinLoginPage;

public class sample extends Base {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("https://adactinhotelapp.com/");
		
		adactinLoginPage a = new adactinLoginPage();
		
		a.getUser().sendKeys("SOWMYAMANI");
		a.getPassword().sendKeys("9676350884");
		a.getLoginbutton().click();
		
		
		sendvalue(a.getUsername(),"SOWMYAMANI");
		sendvalue(a.getPassword(),"9676350884");
		
		Thread.sleep(5000);
			
					}
	
	
	}


	