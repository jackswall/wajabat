#Autor
#Date
#Descripition


#@SmokeScenario
Feature: feature of testing login function
	@smoketest
  Scenario: Check login function with valid credentials
    Given user in login page
    When usre enters username and password
    And click on login button
    Then user navigated to home page

    #Scenario Outline: login function with various values
    #Given user in login page 
    #When usre enters <username> and <password>
    #And click on login button
    #Then user navigated to home page
    #
    #Examples:
    #|username|password|
    #|user1|pass1	|
    #|user2|pass2	|