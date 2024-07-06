Feature: Ebay Home Page Scenarios

  @P0 @P1 
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I navigate to the Advanced Search Page

  @P1 @setCookies @Test
  Scenario: Search items count
    Given I am on Ebay Home Page
    When I search for 'iPhone11'
    Then I validate at least 1000 search items present

  @P5 @setCookies
  Scenario: Search items barbie dolls
    Given I am on Ebay Home Page
    When I search for 'barbie dolls'
    Then I validate at least 100 search items present

  @P240
  Scenario: Search an item in category
    Given I am on Ebay Home Page
    When I search for 'soap' in 'BaBy' category

@P500
  Scenario Outline: Home page Links
    Given I am on Ebay Home Page
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link    | url                                                                | title       |
      | Motors  | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334     | eBay Motors |       
      | Fashion | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Clothing    |       
      | Toys    | https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497                 | Toys        |       
