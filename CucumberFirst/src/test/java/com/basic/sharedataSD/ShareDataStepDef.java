package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	
	WebDriver driver;
	
	public ShareDataStepDef( SharedClass share) {
		driver = share.setup();
	}
	
	@Given("^User need to be on Facebook login page$")
	public void userNeedToBeOnFacebookLoginPage () throws InterruptedException {
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	}
	
	
	 @When("^User enters user \"([^\"]*)\" first name$")
	 public void  whenUserEntersUserFirstName (String userName) throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(userName);
		 Thread.sleep(1000);
	 }
	
}
