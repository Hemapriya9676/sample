package com.base;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	

	
		 public static WebDriver driver; 
		//browserlaunch
		
		public static void browserLaunch(String url) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

			driver.get(url);
							}
		public static void maximize() {
			driver.manage().window().maximize();
		}
			//sendvalues
		public static void sendvalue(WebElement ref,String value) {
			ref.sendKeys(value);
		}
			//print URL
		public static void printUrl() {
					System.out.println(driver.getCurrentUrl());
		}
			//print pageTitle
		public static void printTitle() {
			System.out.println(driver.getTitle());
				}
			//print quit 
		public static void printquit() {
			driver.quit();
			
		}
		
	}		
	
	

	


