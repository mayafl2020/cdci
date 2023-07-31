#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Login feature
  This feature is used to test login functionality

  @positive @smoke @regression
  Scenario: Valid username valid password test
    Given I'm on login page
    When I enter "maya@gmail.com" and "test111"
    Then I should get login success message

  @negative
  Scenario Outline: Invalid username invalid password
    Given I'm on login page
    When I enter "<username>" and "<password>"
    Then I should get login failure message

    Examples: 
      | username          | password       |
      | invalid@gmail.com | test123        |
      | valid@gmail.com   | invalidtest123 |
      |                   | invalidtest123 |
      | invalid@gmail.com |                |
