Feature: Validate first and last name
As a user u need to validate first and last name

Scenario: Check first name and last name
    Given User need to be on demo site page
    When User enters first name
    When User enters last name
    Then close browser demo
