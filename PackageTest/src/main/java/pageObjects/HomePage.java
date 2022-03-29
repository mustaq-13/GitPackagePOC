package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class HomePage extends Base{
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Home']")
	public WebElement homeTab;
	
	@FindBy(xpath="//input[@id='searchBox']")
	public WebElement searchBox;
	
	@FindBy(xpath="//a[text()='Speaking JavaScript']")
	public WebElement book;
	
	@FindBy(xpath="//label[@id='userName-value'][text()='460']")
	public WebElement pages;
	
	@FindBy(xpath="//a[text()='Bank Project']")
	public WebElement bktab;
	
	@FindBy(xpath="//*[@id='dismiss-button']")
	public WebElement close;
	
	public WebElement home() {
		return homeTab;
	}
	
	public WebElement SearchBoxInput() {
		return searchBox;
	}
	
	public WebElement bookName() {
		return book;
	}
	
	public WebElement NoOfPages() {
		return pages;
	}
	
	public WebElement bankTab() {
		return bktab;
	}
	
	public WebElement dismiss() {
		return close;
	}
	
}
