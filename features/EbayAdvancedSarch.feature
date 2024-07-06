Feature: Ebay Advanced Search Page

  @P24
  Scenario: Ebay Logo on Advanced Search page
    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay Home Page

  @P300 @setCookies
  Scenario: Advanced Search on Item
    Given I am on Ebay Advanced Search Page
    When I advanced search an item
      | keyword  | exclude     | min | max |
      | iPhone11 | refurbished | 300 | 900 |
 
 
