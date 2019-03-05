package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	
	WebDriver driver;
	
	
	@Given("^User need to be on Facebook login page$")
	public void userNeedToBeOnFacebookLoginPage () {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	 @When("^User enters user first name$")
	 public void  whenUserEntersUserFirstName () {
		 driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Antonio");
		 
	 }
	 
	 
	 @Then("^User checks user first name is present$")
	 public void thenUserChecksUseFirstNameIsPresent () {
		 String userName = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		 Assert.assertEquals("Antonio", userName);
	 } 
	
	
	

}
