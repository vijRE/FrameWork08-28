package org.test;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Twodlist {
	
	@Given("User click Add Customer link")
	public void user_click_Add_Customer_link() {
		Hooks.driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
	}
	
	@When("User provides valid credentials1")
	public void user_provides_valid_credentials1() {
		Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();
	   	   Hooks.driver.findElement(By.id("fname")).sendKeys("Mee");
	   	   Hooks.driver.findElement(By.id("lname")).sendKeys("askhi");
	   	   Hooks.driver.findElement(By.id("email")).sendKeys("meen@gmail.com");
	   	 Hooks.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Chennai");
	   	   Hooks.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("897984558");
	   	   Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   	System.out.println("Scenario done");
	}
	
	@When("User provides valid credentials2 {string},{string},{string},{string},{string}")
public void user_provides_valid_credentials2(String fname, String lname, String email, String Address, String Phoneno) {
		Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();
	   	   Hooks.driver.findElement(By.id("fname")).sendKeys(fname);
	   	   Hooks.driver.findElement(By.id("lname")).sendKeys(lname);
	   	   Hooks.driver.findElement(By.id("email")).sendKeys(email);
	   	 Hooks.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);
	   	   Hooks.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(Phoneno);
	   	   Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   	System.out.println("Scenario Outline done");
}
		@When("User provides valid credentials3")
	public void user_provides_valid_credentials3(io.cucumber.datatable.DataTable dataTable) {
	    List<String> onedList = dataTable.asList(String.class);
		Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();
	   	   Hooks.driver.findElement(By.id("fname")).sendKeys(onedList.get(0));
	   	   Hooks.driver.findElement(By.id("lname")).sendKeys(onedList.get(1));
	   	   Hooks.driver.findElement(By.id("email")).sendKeys(onedList.get(2));
	   	 Hooks.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(onedList.get(3));
	   	   Hooks.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(onedList.get(4));
	   	   Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   	System.out.println("OneD List done");
	}
	
	@When("User provides valid credentials4")
	public void user_provides_valid_credentials4(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> twodlist = dataTable.asLists(String.class);
	
		
		Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();
	   Hooks.driver.findElement(By.id("fname")).sendKeys(twodlist.get(1).get(0));
	   Hooks.driver.findElement(By.id("lname")).sendKeys(twodlist.get(0).get(1));
	   Hooks.driver.findElement(By.id("email")).sendKeys(twodlist.get(0).get(2));
	   Hooks.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(twodlist.get(1).get(3));
	   Hooks.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(twodlist.get(1).get(4));
	   Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   System.out.println("twodlist done");
	}
	  
	  @When("User provides valid credentials5")
	public void user_provides_valid_credentials5(io.cucumber.datatable.DataTable cust) { 
	   Map<String, String> onedMap = cust.asMap(String.class, String.class);
	   
	   		
	   		Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();
	   	   Hooks.driver.findElement(By.id("fname")).sendKeys(onedMap.get("fname"));
	   	   Hooks.driver.findElement(By.id("lname")).sendKeys(onedMap.get("lname"));
	   	   Hooks.driver.findElement(By.id("email")).sendKeys(onedMap.get("email"));
	   	 Hooks.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(onedMap.get("Address"));
	   	   Hooks.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(onedMap.get("Phoneno"));
	   	   Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   	   
	   	   System.out.println("onedMap done");
	}
	

	
	@When("User provides valid credentials6")
	public void user_provides_valid_credentials6(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> twodMap = dataTable.asMaps(String.class,String.class);
	    Hooks.driver.findElement(By.xpath("//label[text()='Done']")).click();
	   	   Hooks.driver.findElement(By.id("fname")).sendKeys(twodMap.get(0).get("fname"));
	   	   Hooks.driver.findElement(By.id("lname")).sendKeys(twodMap.get(1).get("lname"));
	   	   Hooks.driver.findElement(By.id("email")).sendKeys(twodMap.get(2).get("email"));
	   	 Hooks.driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(twodMap.get(3).get("Address"));
	   	   Hooks.driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(twodMap.get(3).get("Phoneno"));
	   	   Hooks.driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   	System.out.println("twodMap done");
	}




	
	

	
	
}
