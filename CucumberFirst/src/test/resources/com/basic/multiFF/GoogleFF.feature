Feature: Validate search of google
As a user u need to validate search of google

Scenario: Validate search field
    Given User need to be on google page
    When User enters search string
    Then close browser google
    
