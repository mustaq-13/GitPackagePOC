package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelActions {
	public WebDriver driver;
	
	public SelActions(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickElement(WebElement ele) {
		ele.click();
	}
	
	public void typeText(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public String getElementText(WebElement ele) {
		return ele.getText();
	}
	
	public WebDriver switching(WebElement ele) {
		return driver.switchTo().frame(ele);
	}
	
	public WebDriver switchDefault() {
		return driver.switchTo().defaultContent();
	}

}
