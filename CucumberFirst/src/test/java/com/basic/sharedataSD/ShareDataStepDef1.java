package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef1 {
	
	
	WebDriver driver;
	
	public ShareDataStepDef1( SharedClass share) {
		driver = share.setup();
	}
	
	 
	 @Then("^User checks user \"([^\"]*)\" first name is present$")
	 public void thenUserChecksUseFirstNameIsPresent (String userName) throws InterruptedException {
		 String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		 Assert.assertEquals(userNameActual, userName);
		 Thread.sleep(1000);
	 } 
	
	 
	 @And("^User enters user \"([^\"]*)\" surname$")
	 public void userEntersUsernSurname (String surName) throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(surName);
		 Thread.sleep(1000);
	 }

	@But("^User Mobile field should be blank$")
	public void UserMobileFieldShouldBeBlank() throws InterruptedException {
		 String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		 Assert.assertEquals("", mobileActual);
		 Thread.sleep(1000);
	}
}
