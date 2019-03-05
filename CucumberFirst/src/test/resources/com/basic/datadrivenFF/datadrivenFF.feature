Feature: Create Account of Facebook
As a user to open facebook home page and do the validations


Scenario Outline: Validate First Name field
    Given User need to be on Facebook login page
    When User enters user "<user>" first name 
    Then User checks user "<user>" first name is present  
    Then close browser
    
Scenario Outline: Validate create user multiple fields
	Given User need to be on Facebook login page
	When User enters user "<user>" first name
	And User enters user "<surname>" surname
	Then User checks user "<user>" first name is present 
	But User Mobile field should be blank
	Then close browser
	Examples: 
    	|user |surname |
    	|Tom	|Hanks	 |
    	|Jack	|Daniel	 | 
    

