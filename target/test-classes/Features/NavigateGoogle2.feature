Feature: Title of your feature
  I want to use this template for my feature file

  @Google
  Scenario: Verify Google URL Navigatoin 
    Given Navigate to url "https://www.google.com"
    And Enter the serach text "Hardware"
    When Verify the logo
    And Close browser