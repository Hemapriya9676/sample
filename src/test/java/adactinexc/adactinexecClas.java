package adactinexc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import adactinbaseclass.adactinhotel;

//Execution class

public class adactinexecClas extends adactinhotel{
	
	public static void main(String[] args) {
		
		browserLaunch("https://adactinhotelapp.com/");
		Maximize();
		
		
		WebElement user = driver.findElement(By.id("username"));
		sendValue(user, "SOWMYAMANI");
		WebElement pwd = driver.findElement(By.id("password"));
		sendValue(pwd, "9676350884");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		
		//page inside
		
		WebElement loca = driver.findElement(By.id("location"));
		sendValue(loca, "London");
		WebElement hotel = driver.findElement(By.id("hotels"));
		sendValue(hotel, "hotel creek");
		WebElement r_ty = driver.findElement(By.id("room_type"));
		sendValue(r_ty, "Double");
		WebElement search = driver.findElement(By.id("search"));
		search.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
			

				}
	