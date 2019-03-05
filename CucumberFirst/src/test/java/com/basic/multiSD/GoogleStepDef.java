package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {	
	WebDriver driver;

	@Given("^User need to be on google page$")
	public void userNeedToBeOnGooglePage () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(1000);
	}
	
	
	 @When("^User enters search string$")
	 public void  userEntersSearchString () throws InterruptedException {
		 driver.findElement(By.xpath("//input[@title='Cerca']")).sendKeys("selenium");
		 Thread.sleep(1000);
	 }
	 
	
		@Then ("^close browser google$")
		public void closeBrowser() {
			driver.quit();
			driver = null;
		}


}
