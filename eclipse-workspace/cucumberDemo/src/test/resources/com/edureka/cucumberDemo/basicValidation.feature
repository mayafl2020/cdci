@login @Basic
Feature: Basic Validation
  This feature file is used to validate basic functionality

  @positive @regression
  Scenario: Page title validation
    Given I am on login page
    Then Page title should be displayed

  @positive @regression
  Scenario: Page url validation
    Given I am on login page
    Then Page url should be displayed
