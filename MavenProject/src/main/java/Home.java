

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
WebDriver driver;
By myacc=By.linkText("My Account");

public Home(WebDriver driver) {
	super();
	this.driver = driver;
}

public void clickOnMyAcc() {
	driver.findElement(myacc).click();
	
}
}
