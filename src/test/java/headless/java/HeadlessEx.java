package headless.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessEx {
	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
		c.addArguments("Headless");
		
		WebDriver driver =  new ChromeDriver(c); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
