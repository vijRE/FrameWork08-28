package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import junit.framework.Assert;

public class Hooks {
	public static WebDriver driver;
@Before	
	public void user_should_launch_browser() {
	
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\VijRe\\cucumber1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

@Before(order=-10)
public void user_provides_valid_credentials5() { 
}

@After	(order = 10)
	public void verify_ID_is_displayed() {
	   Assert.assertTrue(Hooks.driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
		
	
	}

}
