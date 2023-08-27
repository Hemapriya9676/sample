package adactinbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/// reusable class
public class adactinhotel {
	 public static WebDriver driver;
	
	//browserLaunch
	 public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
	}
	 //maximize
	 public static void Maximize() {
		 driver.manage().window().maximize();
	
		}
	 public static void sendValue(WebElement ref,String value) {
			ref.sendKeys(value);
			

	}
}