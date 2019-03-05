package com.basic.Parametrization;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParametrizationStepDef {
	
	
	WebDriver driver;
	
	
	@Given("^User need to be on Facebook login page$")
	public void userNeedToBeOnFacebookLoginPage () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	}
	
	
	 @When("^User enters user \"([^\"]*)\" first name$")
	 public void  whenUserEntersUserFirstName (String userName) throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(userName);
		 Thread.sleep(1000);
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
/*	
	 @Then("^User checks user first name is present$")
	 public void UserChecksUserFirstNameIsPresent () {
		 String userName = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		 Assert.assertEquals("Antonio", userName);

	 }
*/	 
	@But("^User Mobile field should be blank$")
	public void UserMobileFieldShouldBeBlank() throws InterruptedException {
		 String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		 Assert.assertEquals("", mobileActual);
		 Thread.sleep(1000);
	}
	
	@Then ("^close browser$")
	public void closeBrowser() {
		driver.quit();
		driver = null;
	}
	
	

}
