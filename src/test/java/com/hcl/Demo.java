package com.hcl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	

	public static  void main(String[] args) throws InterruptedException, AWTException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/");
	
	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	
	driver.findElement(By.id("newWindowBtn")).click();
	
	
	
	}
	}

