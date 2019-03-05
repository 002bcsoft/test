Feature: Create Account of Facebook
As a user to open facebook home page and do the validations

Background: User open FB and enter username and pwd
	Given User need to be on Facebook login page
	
Scenario: Validate First Name field
    When User enters user "Antonio" first name 
    Then User checks user "Antonio" first name is present  
    Then close browser
    
Scenario: Validate create user multiple fields
	When User enters user "Mariacarmen" first name
	And User enters user "Sorrentino" surname
	Then User checks user "Mariacarmen" first name is present 
	But User Mobile field should be blank
	Then close browser
