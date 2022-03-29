package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import methods.SelActions;
import pageObjects.HomePage;
import resources.Base;

public class TestDemo extends Base{
	
	WebDriver driver;
	
	@BeforeTest
	public void getAccess() {
		String url = "https://demoqa.com/books";
		driver=init("chrome");
		driver.get(url);
	}
	
	@Test
	public void validateText() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		SelActions sa = new SelActions(driver);
		
		sa.clickElement(hp.SearchBoxInput());
		sa.typeText(hp.SearchBoxInput(), "Speaking Javascript");
		//click on the Home Tab
		Thread.sleep(3000);
		sa.clickElement(hp.bookName());
		Thread.sleep(2000);
		
		
//		List<WebElement> fr = driver.findElements(By.tagName("iframe"));
//		System.out.println(fr.size());
		//driver.switchTo().frame("ad_iframe");
		//sa.switching(hp.findFrame());
		
		Thread.sleep(3000);
		Assert.assertEquals(sa.getElementText(hp.NoOfPages()),"460");
		
	}
}
