package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Object.Objects;


public class Testcases {
	@Test
	public void Login()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NandiniKrishna\\Downloads\\cd\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.get("https://www.thermofisher.com/iaam/loginDisplay");
		   Objects oj= new Objects(driver);
		   oj.UserName().sendKeys("nkpavuluri");
		   oj.Password().sendKeys("abcc");
		   oj.Signin().click();
	}
}
