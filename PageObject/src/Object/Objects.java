package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Objects {
	WebDriver driver;
	public Objects(WebDriver driver) {
		this.driver=driver;
	}
	
	By Username= By.xpath("//*[@id=\"username\"]");
	By Password=By.id("password");
	By signin= By.xpath("//*[@id=\"rememberMe\"]");
	
	public WebElement UserName()
	{
		return driver.findElement(Username);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement Signin()
	{
		return driver.findElement(signin);
	}
}

