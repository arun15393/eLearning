
@tag
Feature: CourseraLearning
  I want to use this template for my feature file

  @tag1
  Scenario: Login to Coursera Successfull
    Given I am in Coursera Website
    When I click login
    Then I login succesfully with correct username and password

  @tag1
  Scenario: Login to Coursera UnSuccessfull
    Given I am in Coursera Website
    When I click login
    Then I login succesfully with incorrect username and password
