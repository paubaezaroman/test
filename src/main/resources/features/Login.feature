@Login_HUDL
  Feature: Login Functionality for HUDL - Test Automation

    @Login_HUDL_01
    Scenario: 01-Successful login to HUDL
      Given I go to the main website application
      When I click on login and enter "pau.baezaroman@gmail.com" and "pauUK001!"
      Then I am logged in to Hudl Home Page

    @Login_HUDL_02
    Scenario: 02-UnSuccessful login to HUDL due to user not found
      Given I go to the main website application
      When I click on login and enter "testestesttestestest@gmail.com" and "testesttest"
      Then I am prompted with an error

    @Login_HUDL_03
    Scenario: 03-UnSuccessful login to HUDL due to user and password not sent
      Given I go to the main website application
      When I click on login and enter "" and ""
      Then I am prompted with an error

