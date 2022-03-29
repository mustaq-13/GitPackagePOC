package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	//String browserName = "";
	
	public WebDriver init(String bn) {
		if (bn.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		return driver;
	}

}
