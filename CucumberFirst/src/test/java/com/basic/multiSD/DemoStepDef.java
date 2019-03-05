package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef {
	
	
	WebDriver driver;
	
	
	@Given("^User need to be on demo site page$")
	public void userNeedToBeOnDemoPage () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();	
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
	}
	
	
	 @When("^User enters first name$")
	 public void  userEntersFirstNameString () throws InterruptedException {
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Antonio");
		 Thread.sleep(1000);
	 }
	 
	 @When("^User enters last name$")
	 public void  userEntersLastNameString () throws InterruptedException {
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Antonio");
		 Thread.sleep(1000);
	 }
	 
	@Then ("^close browser demo$")
	public void closeBrowser() {
		driver.quit();
		driver = null;
	}


}
