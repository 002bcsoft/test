@Important
Feature: Create Account of Facebook
As a user to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name field
    Given User need to be on Facebook login page
    When User enters user "Antonio" first name 
    Then User checks user "Antonio" first name is present  
    Then close browser

@Smoke @Regression    
Scenario: Validate create user multiple fields
	Given User need to be on Facebook login page
	When User enters user "Mariacarmen" first name
	And User enters user "Sorrentino" surname
	Then User checks user "Mariacarmen" first name is present 
	But User Mobile field should be blank
	Then close browser

@Smoke
Scenario: Validate First Name field
    Given User need to be on Facebook login page
    When User enters user "Antonio" first name 
    Then User checks user "Antonio" first name is present  
    Then close browser

@Regression
Scenario: Validate First Name field
    Given User need to be on Facebook login page
    When User enters user "Antonio" first name 
    Then User checks user "Antonio" first name is present  
    Then close browser

@Smoke
Scenario: Validate First Name field
    Given User need to be on Facebook login page
    When User enters user "Antonio" first name 
    Then User checks user "Antonio" first name is present  
    Then close browser